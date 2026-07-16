package com.java.core.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListss {
	public static void main(String[] args) {
		
		List<Integer> la = new LinkedList<Integer>();
		la.add(12);
		la.add(43);
		la.add(87);
		
		Integer a = la.get(2);
		System.out.println(a);
	}

}
