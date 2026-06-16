package com.java.core.exception;

public class ExceptionBasics {
	 public static void main(String[] args) {
		System.out.println("Start");
		String s = "apple";
		
		try {
			for(int i =0; i <=s.length() ; i++) {
				System.out.println(s.charAt(i));
			}
			
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("String value exceed");
		}
		
		
		//code stopped due to exception
		//when execution occurs code flow breaks/code stops.
		//further code do not get executed

		System.out.println("END");
	 }

}
