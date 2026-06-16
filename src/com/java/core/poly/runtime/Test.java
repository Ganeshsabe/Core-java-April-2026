package com.java.core.poly.runtime;

public class Test {
	public static void main(String[] args) {
		String ip ="HR";
		Employee e;
		if(ip.equals("DEVELOPER")) {
			e = new Developer();
			e.printSalary();
		}
		else {
			e = new HR();
			e.printSalary();
		}
	
	}

}
