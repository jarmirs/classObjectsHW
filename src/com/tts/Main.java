package com.tts;

public class Main {
	public static void main (String [] args) {
		Pet rosco = new Pet();
		rosco.setAge(7);
		rosco.setLocation("Miami, Fl");
		rosco.setType("dog");
		rosco.setName("rosco");
		
		System.out.println(rosco.toString());
		
		Houses mansion =new Houses();
	mansion.setStyle("ranch");
	mansion.setBathrooms(6);
	mansion.setBedrooms(5);
	mansion.setComplete(true);
	
	System.out.println(mansion.getComplete());	
	}

}
