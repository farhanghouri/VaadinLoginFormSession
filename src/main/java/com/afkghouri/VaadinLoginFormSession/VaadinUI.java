package com.afkghouri.VaadinLoginFormSession;

import java.awt.Button;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinSession;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Component;
import com.vaadin.ui.UI;
 

@SpringUI 
public class VaadinUI extends UI{

	@Autowired
	MyLoginForm myLoginForm;
	@Override
	protected void init(VaadinRequest request) {
		sessionInstance();
		setContent(myLoginForm);
	}
	
	public void sessionInstance() {
//		DashboardEventBus dashboardEventBus = VaadinSession.getCurrent().getAttribute(DashboardEventBus.class);
//		if (dashboardEventBus == null) {
//			dashboardEventBus = new DashboardEventBus();
//			VaadinSession.getCurrent().setAttribute(DashboardEventBus.class, dashboardEventBus);
//		} 
//		return dashboardEventBus;
		VaadinSession.getCurrent().setAttribute(Shape.class, new Shape().withShapeName("circle"));
		VaadinSession.getCurrent().setAttribute(Shape2.class, new Shape2().withShapeName("triangle"));
		Shape shape = (Shape) VaadinSession.getCurrent().getAttribute(Shape.class.getName());
		System.out.println("VaadinSession: "+shape.getShapeName());
		System.out.println("VaadinSession: "+((Shape2) VaadinSession.getCurrent().getAttribute(Shape2.class.getName())).getShapeName());
		
		
		// Close the session
       // getSession().close();
	}

}
