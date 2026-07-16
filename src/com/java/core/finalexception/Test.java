package com.java.core.finalexception;


public class Test {

	public static void main(String[] args) {
		try {
			Zomato.orderFood("NOIDA");
		} catch (InvalidCityException e) {
            System.out.println("Exception invalid city" +e);
		
		}
		
		System.out.println("IMP Code");
		System.out.println("Exception Handlings");
	}

}
