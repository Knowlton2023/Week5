package com.coderscampus.exercise3;

public class UserApplication {

	public static void main(String[] args) {
		UserService userService = new UserService();
//		String[] stringInput = new String[3];
		User[] users = new User[3];
		users[0] = userService.createUser("aUsernameHere", "aPasswordHere", "Sombodies Name");
		users[1] = userService.createUser("aUsernameHere2", "aPasswordHere2", "Sombodies Name2");
		users[2] = userService.createUser("aUsernameHere3", "aPasswordHere3", "Sombodies Name3");

		System.out.println("User1: " + users[0].toString());
		System.out.println("User2: " + users[1].toString());
		System.out.println("User3: " + users[2].toString());

		
		
	}

}
