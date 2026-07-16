package com.java.core.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setss {
	public static void main(String[] args) {
		
		Set<Integer> s = new HashSet<Integer>();
		s.add(234);
		s.add(9000);
		s.add(2586);
		s.add(25);
		s.add(null);
		System.out.println(s);
		
		Set<Integer> sa = new LinkedHashSet<Integer>();
		sa.add(256);
		sa.add(582);
		sa.add(586);
		sa.add(285);
		sa.add(null);
		System.out.println(sa);
		
		Set<Integer> saa = new TreeSet<Integer>();
		saa.add(654);
		saa.add(359);
		saa.add(598);
		saa.add(987);
		//saa.add(null);
		System.out.println(saa);
	}

}
