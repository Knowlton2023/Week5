package com.coderscampus.lesson1;

public class Human {
	// instance variable
	int age;
	
	public String getStageOfLife() {
		if (age < 13) {
			return "Child";
		} else if (age <19) {
			return "Teenager";   
		} else if (age < 65) {
			return "Adult";
		} else {
			return "Senior";
		}

	}
}
