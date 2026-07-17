package com.java.core.functionalInterfaceAssignment;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Example1 {
	//Use a Supplier<Integer> to provide a number, a 
	//positive, and a Predicate to check if itʼs
	//Consumer to print “Positive Number” if true.

	public static void main(String[] args) {
		Supplier<Integer> s = () -> 34;
		Predicate<Integer> isPositive = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return false;
			}
		}; 
	
	}
}
