package com.pay4.vaadin;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("")
public class View extends Div {

    public View() {
        try
        {
            CustomisedButton customisedButton = new CustomisedButton();
            customisedButton.setText("Should have red background");

            CustomisedTextField customisedTextField = new CustomisedTextField();
            customisedTextField.setValue("Should have blue border");

            add(customisedButton, customisedTextField);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
