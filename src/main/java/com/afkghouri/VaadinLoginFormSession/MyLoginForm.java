package com.afkghouri.VaadinLoginFormSession;

import javax.annotation.PostConstruct;

import com.vaadin.shared.Registration;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.LoginForm;
import com.vaadin.ui.Notification;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Component;

@org.springframework.stereotype.Component
public class MyLoginForm extends LoginForm{

	@PostConstruct
	protected void init(){ 
	}

	@Override
	protected Component createContent(TextField userNameField, PasswordField passwordField,
			Button loginButton) {
		return buildForm(userNameField,passwordField,loginButton);
	}

	private Component buildForm(TextField userNameField, PasswordField passwordField, Button loginButton) {
		addLoginListener(listener -> {
			Notification.show(""+listener.getLoginParameter("username")+" "+listener.getLoginParameter("password")); 
		});
		VerticalLayout formLayout  = new VerticalLayout();
		formLayout.addComponents(userNameField,passwordField,loginButton);
		return formLayout;
	}

	 
	
}
