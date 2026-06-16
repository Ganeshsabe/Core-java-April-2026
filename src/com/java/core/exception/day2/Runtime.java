package com.java.core.exception.day2;

import java.util.Scanner;

public class Runtime {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		System.out.println("Please enter a : ");
		int a = sc.nextInt();
		System.out.println("Please enter b : ");
		int b = sc.nextInt();
		
		try {
			
			System.out.println(a/b);
			
		} catch (ArithmeticException e) {

			System.out.println("Exception occured");
		}
		
	}
}
