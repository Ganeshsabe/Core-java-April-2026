package com.java.core.superthis;

public class HR extends Employee {
	
	public HR(String a) {
		System.out.println("HR Name : " +a);

		super.getAge();
		System.out.println(super.age);
		this.Something();
	    System.out.println(this.age);
	}
	public int age = 256;
	
	public void Something() {
		System.out.println("Something called");
		System.out.println(this.age);
		System.out.println(super.age);
	}
	
	

}
