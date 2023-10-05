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

		System.out.println(users);
		System.out.println(Arrays.toString(users[0]));
		
		
		
//		System.out.println(Arrays.toString(stringInput));
//		
////		userService.createUser(stringInput);
//		
//
//		String[] stringInput2 = new String[3];
//		stringInput2[0] = "aUsernameHere";
//		stringInput2[1] = "aPasswordHere";
//		stringInput2[2] = "Sombodies Name";
//
//		System.out.println(Arrays.toString(stringInput2));
//		
		
		
		
//		stringInput[0] = userService.createUser("aUsernameHere", null, null);
//		stringInput[1] = userService.createUser(null, "aPasswordHere", null);
//		stringInput[2] = userService.createUser(null, null, "Somebodies Name");
//
//		System.out.println(stringInputs);

		
        // Create an array of strings with 3 elements
        String[] stringInputs = new String[3];

        // Assign values to the array elements
        stringInputs[0] = "First String";
        stringInputs[1] = "Second String";
        stringInputs[2] = "Third String";

        // Access and print the array elements
        System.out.println("Element at index 0: " + stringInputs[0]);
        System.out.println("Element at index 1: " + stringInputs[1]);
        System.out.println("Element at index 2: " + stringInputs[2]);
		
		
	
	}

}
