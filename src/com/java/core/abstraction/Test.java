package com.java.core.abstraction;

public class Test {
	public static void main(String[] args) {
		int salary = 10000;
		Employee e;
		e= new Developer();
		e.getName();
		e.giveSalary(salary);
		
		e= new HR();
		e.getName();
		e.giveSalary(salary);
	}

}
