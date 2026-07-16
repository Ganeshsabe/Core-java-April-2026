package com.java.core.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Introduction {
	public static void main(String[] args) {
		List l = new ArrayList<>();
		l.add(12);
		l.add("SUYASH");
		l.add(false);
		
		System.out.println(l);
		
		Set s = new HashSet(); 
		s.add("Monday");
		s.add("Tuesday");
		s.add("Wednesday");
		s.add("Thursday");
		System.out.println(s);
		
		 Map<String , Integer> m = new HashMap();
		 m.put("Ram", 87);
		 m.put("Sham", 85);
		 m.put("Shubham", 75);
		 System.out.println(m);
		 
		//for(int i= 0; i<l.size(); i++) {
		//System.out.println(l.get(i));}
	}

}
