package com.java.core.exception.thorws;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Operation {
	//Runtime-> do not write throws in method body
	public void division(int a , int b) {
		
		System.out.println("Important code - 1");
		int div = a/b;
		System.out.println(div);
		System.out.println("Important code -2");
	}
	
	//CompileTime
	public void readFile() throws FileNotFoundException{
		FileReader f = new FileReader("abc.txt");
	}

}
