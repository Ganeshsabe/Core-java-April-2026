package com.java.core.functionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Testss {
	public static void main(String[] args) {
		
		Predicate<Integer> p =(Integer t) -> { return t%2==0;};
		System.out.println(p.test(9)); 
		//=========================================================
		
		Predicate<String> s = (String z) -> {return z.startsWith("M");};
         System.out.println(s.test("Monday"));
          //======================================================
    
         Function<Integer, Integer> square = i -> (i*i);
         System.out.println(square.apply(10));
         
         //====================================================
         
         Consumer<String> c = ss -> System.out.println(ss.toLowerCase());
         c.accept("APPLE");
         
         //===================================================
         Supplier<String> sup = () -> "www.myntra.com";
         System.out.println("Myntra URL : " +sup.get());
          
	}

} 
