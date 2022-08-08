package com.tts;
/**2. Create a Custom Class (anything you want - car, phone, holiday, etc.). 

//Requirements: 

//Minimum 3 private instance variables 
//An empty constructor 
//A constructor that uses only 2 of your 3 variables
//A constructor that uses all 3 of your instance variables 
//Get methods for all 3 of your instance variables and Set methods for all 3 of your instance variables 
//A method that returns a Boolean 
//A method that returns a String (For example, if I created a Santa Custom Class, my code would
//look something like the attached Santa.java file. */
public class Houses {
//Class properties
	private String style;
	private Integer bedrooms;
	private Integer bathrooms;
	private String color;
	private Boolean complete;
	
	//Constructors
	public Houses () {}
	public Houses (Integer bedrooms, Integer bathrooms,Boolean complete) {
		
	}
	public Houses (Integer bedrooms, Integer bathrooms,String style) {}
	
	public String getStyle() {
		return style;
	}
	
	public void setStyle(String style) {
		this.style = style;
	}
	
	public Integer getBedrooms() {
		return bedrooms;
	}
	
	public void setBedrooms(Integer bedrooms) {
		this.bedrooms = bedrooms;
	}
	
	public Integer getBathrooms() {
		return bathrooms;
	}
	
	public void setBathrooms(Integer bathrooms) {
		this.bathrooms = bathrooms;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public Boolean getComplete() {
		return complete;
	}
	
	public void setComplete(Boolean complete) {
		this.complete = complete;
	}
	
	
	
	
}

