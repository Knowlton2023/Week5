package com.coderscampus.exercise3;

public class UserService {

	public User createUser (String username, String password, String name) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);
		return user;
	}

	public User createUser2 (String[] stringInput) {
		User user2 = new User();
		user2.setUsername(stringInput[0]);
		user2.setPassword(stringInput[1]);
		user2.setName(stringInput[2]);
		return user2;
	}

	
	
	public String[] parseText (String inputs) {
		String[] splitString = inputs.split(",");
		return splitString;
	}	
	
	
}
