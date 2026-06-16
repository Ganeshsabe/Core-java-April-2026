package com.java.core.inheritance.hw;

public class Test {
	public static void main(String[] args) {
		//parent class object
		Ganesh g = new Ganesh();
		System.out.println(g.age);
		System.out.println(g.city);
		System.out.println(g.Name);
		System.out.println(g.phoneNumber);
		System.out.println(g.rollNumber);
        System.out.println("------------------------------------------------------");
		//child class object
		Supesh s = new Supesh();
		System.out.println(s.rollNumber);
		System.out.println(s.city);
		System.out.println(s.age);
		System.out.println(s.Name);
		System.out.println(s.fName);
		System.out.println(s.lName);
		System.out.println(s.phoneNumber);
		System.out.println("++++++++++++++++++++++++++++++++++++");
		//2nd child class
		Shubham sh = new Shubham();
		System.out.println(sh.age);
		System.out.println(sh.fName);
		System.out.println(sh.lName);
		System.out.println(sh.phoneNumber);
		System.out.println(sh.Name);
		System.out.println(sh.city);
		System.out.println(sh.rollNumber);
	}

}
