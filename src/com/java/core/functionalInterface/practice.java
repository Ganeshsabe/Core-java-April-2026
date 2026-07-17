package com.java.core.functionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class practice {

	public static void main(String[] args) {
		
		Predicate<Integer> p = (Integer t) -> {return t%3==0;};
		System.out.println(p.test(12));
		
		//===============================================
		Predicate<String> s = (String z) -> {return z.startsWith("A");};
		System.out.println(s.test("Monday"));
		
		Predicate<String> ss = (String t) -> {return t.startsWith("A");};
		System.out.println(ss.test("Apple"));
		
		//=========================================================
		Function<Integer, Integer> square = i -> { return (i*i);};
		System.out.println(square.apply(10));
		//==============================
		Consumer<String> c = t -> System.out.println(t.toLowerCase());
		c.accept("APPLE");
		//========================================
		Supplier<String> sup = () -> "www.Myntra.com";
		System.out.println("Myntra url : " +sup.get());
		
	}
}
