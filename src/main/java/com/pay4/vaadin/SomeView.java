package com.pay4.vaadin;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.Route;

/**
 * @author michael.jones
 */
@Route("/some/view")
@Uses(CustomisedTextField.class)
@Uses(Button.class)
public class SomeView extends Div
{
	public SomeView()
	{
		//Something to force chunks in the flow-build-info.json, so that fallbacks are loaded
		Tabs tabs = new Tabs();
		add(tabs);
	}
}
