package com.java.core.loops;

public class WhileLoop {
	
	public static void main(String[] args) {
		/* Execution sequence for loop
		 * 1.initialization
		 * 2.condition
		 * 3.code/ for loop body
		 * 4.increment/decrement
		 * */
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("Hello in for loop : " +i);
		}
		System.out.println("----------------------------------");
	// initializationn , condition and incr/decr  --> needed
	//sntax for while loop
	/*
	 * Execution sequence for while loop
	 * 1.initialization
	 * 2.condition
	 * 3.code /while loop body
	 * 4.increment/decrement
	 * */
		int i =0;
		while(i<5) {
			System.out.println("Hello from while loop" +i);
			i++;
		}
	
		System.out.println("===================================");
	    int j = 5;
	    while(j>0) {
	    	System.out.println("Reverse while loop : " +j);
	    	j--;
	    }
	}
}