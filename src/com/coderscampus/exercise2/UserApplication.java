package com.coderscampus.exercise2;

import java.util.Arrays;

public class UserApplication {

	public static void main(String[] args) {
		UserService userService = new UserService();
		String[] stringInput = new String[3];
		stringInput[0] = "aUsernameHere";
		stringInput[1] = "aPasswordHere";
		stringInput[2] = "Sombodies Name";

		User[] users = new User[1];
		for (int i = 0; i < 1; i++) {
			users[i] = userService.createUser(stringInput[0], stringInput[1], stringInput[2]);
		}

		users[0] = userService.createUser(stringInput[0], stringInput[1], stringInput[2]);

		
		
		
//        // Create an array of strings with 3 elements
//        String[] stringInputs = new String[3];
//
//        // Assign values to the array elements
//        stringInputs[0] = "First String";
//        stringInputs[1] = "Second String";
//        stringInputs[2] = "Third String";
//
//        // Access and print the array elements
//        System.out.println("Element at index 0: " + stringInputs[0]);
//        System.out.println("Element at index 1: " + stringInputs[1]);
//        System.out.println("Element at index 2: " + stringInputs[2]);

	}

}
