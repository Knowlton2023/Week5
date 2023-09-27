package com.coderscampus.exercise1;

public class UserMain {

	public static void main(String[] args) {

		User aUser = new User("WhatACoolUserName","CreativePa$$w0rd","Charles");
		System.out.println("Username: " + aUser.getUsername() + ", Password: " + aUser.getPassword() + ", Name: " + aUser.getName());

	}

}
