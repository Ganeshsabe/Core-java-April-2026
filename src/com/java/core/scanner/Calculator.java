package com.java.core.scanner;

import java.util.Scanner;

public class Calculator {
 
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
	System.out.println("Enter value of a : ");
    
	int a = sc.nextInt();
	
	System.out.println("Enter value of b :");
	
	int b = sc.nextInt();
	
	int sum = a+b;
	System.out.println("sum is :" +sum);
	
	int sub = a-b;
	System.out.println("Substraction is :" +sub);
	
	int mul = a*b;
	System.out.println("Multiplication is :" +mul);
	
	int div = a/b;
	System.out.println("Division is :" +div);
	
	int rem = a%b;
	System.out.println("Reminder is :" +rem);
	
	}
	
}
