package com.tts;
// Create a Pet Class with the following instance variables: 

//name (PRIVATE) 
//age (PRIVATE) 
//location (PRIVATE) 
// (PRIVATE) 
//two constructors(empty, all attributes)
//Code to be able to access the following (Get Methods): 
//name, age, type 
//Code to be able to change (Set Methods): 
//name, age, location  

public class Pet {
//Class Properties
	private String name;
	private Integer age;
	private String location;
	private String type;
	

	//Constructors
	// no arguments
	public Pet(){}
			
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
		
	}
	//will print entire object and values
	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + ", location=" + location + ", type=" + type + "]";
	}
	
	}

