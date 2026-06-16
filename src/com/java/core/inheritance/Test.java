package com.java.core.inheritance;

public class Test {

	public static void main(String[] args) {
		//parents class
		Student S = new Student();
		System.out.println(S.a);
		System.out.println(S.d);
		System.out.println("-----------------------");
		
		//Child class
		Shubham ss = new Shubham();
		System.out.println(ss.a);
		System.out.println(ss.b);
		System.out.println(ss.c);
		System.out.println(ss.d);
		System.out.println("Name is : " +ss.Name);
	}
}
