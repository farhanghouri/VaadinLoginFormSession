package com.afkghouri.VaadinLoginFormSession;

public class Shape {
   String shapeName;

	public String getShapeName() {
		return shapeName;
	}
	
	public void setShapeName(String shapeName) {
		
		this.shapeName = shapeName;
	}
	public Shape withShapeName(String shapeName){
		setShapeName(shapeName);
		return this;
	}
	 
   
}
