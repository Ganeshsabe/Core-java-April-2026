package com.java.core.functionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class trickyy {
	public static void main(String[] args) {
		//if number is even then square the number and print it
		
	//	int a = 12;
	//	if(a%2 ==0) {
	//		System.out.println(a*a);
	//	}
		
		// predicate , function , consumer and supplier
		
		Supplier<Integer> supplier = new Supplier<Integer>() {
			
			@Override
			public Integer get() {
				return 34;
			}
		};
		
		Predicate<Integer> predicate = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t%2==0;
			}
		};
		
		Function<Integer, Integer> function = new Function<Integer, Integer>() {
			
			@Override
			public Integer apply(Integer x) {
				// TODO Auto-generated method stub
				return (x*x);
			}
		};
		
		Consumer<Integer> consumer = new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		};
		
		//int z = supplier.get();
		//predicate.test(z);
		if(predicate.test(supplier.get())) {
			//int square = function.apply(supplier.get());
			consumer.accept(function.apply(supplier.get()));
			
		}
		
	}

}
