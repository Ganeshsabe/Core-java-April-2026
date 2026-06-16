package LoopsClasswork;

import java.util.Scanner;

public class Example5 {
	public static void main(String[] args) {
		// only 3 free additions are permitted then buy 
		// a premium package
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1 ; i<=3; i++) {
			
			System.out.println("Please enter a ->");
			int a =sc.nextInt();
			System.out.println("Please enter b ->");
			int b = sc.nextInt();
			
			int sum =a+b;
			System.out.println("Addition is : " +sum);
			System.out.println("--------------------");
		}
		System.err.println("Please buy premium package");
	}

}
