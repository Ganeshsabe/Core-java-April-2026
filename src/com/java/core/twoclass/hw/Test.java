package com.java.core.twoclass.hw;

import java.util.Scanner;

import com.java.core.twoclass.UsernameGenerator;

public class Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fname : ");
		String fname = sc.next();
		
		System.out.println("Enter lname : ");
		String lname = sc.next();
		
		System.out.println("Enter year of birth : ");
		int yob = sc.nextInt();
		int year = yob%100;
	    System.out.println("yob is : "+year );
	    
	    System.out.println("username :" +fname,lname ,yob);
	}
}