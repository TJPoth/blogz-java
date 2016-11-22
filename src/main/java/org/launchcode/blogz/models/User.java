package org.launchcode.blogz.models;

import java.util.regex.*;
import java.util.ArrayList;

public class User extends Entity {
	
	private String username;
	private String password;
	private static ArrayList<User> users;
	
	
	public User(String username, String password) {
		super();
		if(isValidUsername(username)) {
			this.username = username;
		} else {
			throw new IllegalArgumentException();
		}
		this.password = hashPassword(password);
	}
	
	
	private static String hashPassword(String password) {
		return password;
	}
	
	
	private boolean isValidPassword(String password) {
		if(hashPassword(password) != this.password) {
			return false;
		}
		return true;
	}
	
	
	protected static boolean isValidUsername(String username) {
		Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]{4,11}");
		Matcher m = p.matcher(username);
		boolean b = m.matches();
		return b;
	}
	
	public String getUsername() {
		return this.username;
	}

	
	public static void getUsers() {
		for(int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i).getUsername());
		}
	}
	
	
	
	
	public static void main(String[] args) {

	}

}