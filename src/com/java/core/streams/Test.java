package com.java.core.streams;

import java.util.Arrays;
import java.util.List;


public class Test {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(12,32,54,32,35,1);
			
		for(int a : l) {
			System.out.println(a);
		}
		
		System.out.println("--------------------");
		l.stream().forEach(x -> System.out.println(x));
		System.out.println("Even number");
		
		l.stream().filter(x -> x%2 == 0).forEach(x -> System.out.println(x));

		l.stream()
		.filter(x -> x%2==0)
		.map(y -> y*10)
        .forEach(x -> System.out.println(x));
	}

}
