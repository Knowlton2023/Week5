package com.coderscampus.exercise3;

public class UserApplication {

	public static void main(String[] args) {
		UserService userService = new UserService();
		User[] users = new User[3];
		users[0] = userService.createUser("aUsernameHere", "aPasswordHere", "Sombodies Name");
		users[1] = userService.createUser("aUsernameHere2", "aPasswordHere2", "Sombodies Name2");
		users[2] = userService.createUser("aUsernameHere3", "aPasswordHere3", "Sombodies Name3");
		System.out.println("Username: " + users[0].getUsername());
		System.out.println("Password: " + users[0].getPassword());
		System.out.println("Name: " + users[0].getName());

		
		String[] stringInput = {"aUsernameHere","aPasswordHere","Sombodies Name"};
		UserService userService2 = new UserService();
		User users2 = userService2.createUser2(stringInput);
		System.out.println("Username: " + users2.getUsername());
		System.out.println("Password: " + users2.getPassword());
		System.out.println("Name: " + users2.getName());
		

		UserService userService3 = new UserService();
		String[] inputs = userService3.parseText("exampleUser,examplePassword,exampleName");
		for (String input : inputs) {
			System.out.println(input);
		}
		
	}

}
