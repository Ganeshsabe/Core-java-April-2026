package com.java.core.exception.day2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Compiletime {
	
	public static void main(String[] args) {
		
		try {
			FileReader f = new FileReader("abc.txt");
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("imp code");
	}

}
