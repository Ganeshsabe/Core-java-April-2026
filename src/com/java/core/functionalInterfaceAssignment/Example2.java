package com.java.core.functionalInterfaceAssignment;

import java.util.function.Function;

public class Example2 {

	public static void main(String[] args) {
		
		Function<String, Integer> func = new Function<String, Integer>() {
			
			@Override
			public Integer apply(String t) {
				// TODO Auto-generated method stub
				return 12;
			}
		};
	}
}
