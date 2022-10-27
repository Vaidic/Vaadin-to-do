package com.example.application.views.main;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Main")
@Route(value = "")
public class MainView extends VerticalLayout {

    public MainView() {
        VerticalLayout todosList = new VerticalLayout();
        TextField textField = new TextField();
        Button addButton = new Button("Add");
        addButton.addClickListener(click -> {
            Checkbox checkbox = new Checkbox(textField.getValue());
            todosList.add(checkbox);
        });

        addButton.addClickShortcut(Key.ENTER);

        add(
                new H1("Vaadin To Do List"),
                todosList,
                new HorizontalLayout(
                        textField,
                        addButton));
    }

}
