# dom-module-id-bug
Basic vaadin project to demonstrate bug with com.vaadin.flow.server.frontend.TaskUpdateImports

mvn install
mvn jetty:run

There's something wrong with this dummy project; after maven install the flow-build-info.json has a chunks.fallback section, but when the jetty server starts up something is overwriting it with a dev mode style version of the file and this leads to it not being able to load fallback chunks. You can get round this by replacing the flow-build-info.json with its original contents, once the server is loaded, before loading the page in the browser. Anyway, I need to move on and I think what's here is enough to clearly explain the bug and cause...

After running mvn install, see target/frontend folder, both the main file and the fallback one have a dom-module with id "flow_css_mod_0". This happens because com.vaadin.flow.server.frontend.TaskUpdateImports ends up calling AbstractUpdateImports.run() twice - once for the fallback file and once for the main imports file - which results in AbstractUpdateImports.getCssLines() running twice and both start with i=0. See AbstractUpdateImports.addCssLines() uses i as the format argument for "...flow_css_mod_%d..."

The result is that one set of styles - whichever appeared first in the DOM - won't get imported properly.

Currently working around this in our real app with @Uses annotations to make sure absolutely nothing ends up in the fallback file!
