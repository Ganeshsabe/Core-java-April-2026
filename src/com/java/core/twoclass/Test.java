package com.java.core.twoclass;

public class Test {
public static void main(String[] args) {
	// Requirement -> fname = jojn , iname =wick , yob=1999
	// Username -> johnwick99
	UsernameGenerator generator = new UsernameGenerator();
	String username = generator.getUsername("John", "Wick" , 1999);
	System.out.println("Username is : " +username);
	
}
}
