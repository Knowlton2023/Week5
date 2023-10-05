package com.coderscampus.exercise2;

public class UserApplication {

	public static void main(String[] args) {
		UserService userService = new UserService();
		User[] stringInputs = new User[3];

		stringInputs[0] = "aUsernameHere";
//		stringInputs[0] = userService.createUser("aUsernameHere", "aPasswordHere", "Somebodies Name");
//		stringInputs[1] = userService.createUser(null, "aPasswordHere", null);
//		stringInputs[2] = userService.createUser(null, null, "Somebodies Name");


		
		System.out.println(stringInputs);

	
	}

}
