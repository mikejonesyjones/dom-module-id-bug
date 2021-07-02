package com.pay4.vaadin;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JsModule;

@CssImport(value = "./css/button-customisations.css", themeFor = "vaadin-button")
public class CustomisedButton extends Button
{
	public CustomisedButton()
	{
		super();
	}

}
