package com.java.core.twoclass.hw;

import java.util.Scanner;

public class Usernameganerator {
	public String username() {
		//string input from console
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fname : ");
		String fname = sc.next();
		System.out.println("fname is : " + fname);
		
		// String input from console
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter fname : ");
		String lname = sc.next();
		System.out.println("lname is :" + lname);
		
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter yob : ");
		int yob =sc.nextInt();
		System.out.println("yob is :" +yob);
}
}
