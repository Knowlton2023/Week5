package com.coderscampus.exercise1;

public class UserMain {

	public static void main(String[] args) {

	User aUser = new User();
	aUser.setName("Charles");
	aUser.setPassword("CreativePa$$w0rd");
	aUser.setUsername("WhatACoolUserName");
	System.out.println(aUser.getName());
	System.out.println(aUser.getPassword());
	System.out.println(aUser.getUsername());


	}

}
