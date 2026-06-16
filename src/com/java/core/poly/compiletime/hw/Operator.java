package com.java.core.poly.compiletime.hw;

public class Operator {
	public void sum(int a ,int b)	{
		System.out.println("Sum is : " +(a+b));
	}
	
	public void sum(int a , int b ,int c) {
		System.out.println("Sum is : " +(a+b+c));
	}
	
	public void sum(int a , int b ,int c ,int d  ) {
		System.out.println("Sum is : " +(a+b+c+d));
	}
	
	public void sum(int a , int b, int c , int d , int e) {
	    System.out.println("Sum is : " +(a+b+c+d+e));
	}
	
	public void sub(int a , int b) {
	    System.out.println("substraction is : " +(a-b));	
	}
	
	public void sub(int a , int b , int c) {
		System.out.println("Substraction is : " +(a-b-c));
		
	}
	
	public void sub(int a , int b , int c ,int d) {
		System.out.println("Substraction is : " +(a-b-c-d));
	}
	
	public void sub(int a, int b , int c ,int d, int e) {
		System.out.println("Substraction is : " +(a-b-c-d-e));
	}
	
	public void mul(int a , int b) {
    System.out.println("Multiplication is : " +(a*b));		
	}
	
	public void mul(int a , int b , int c) {
		System.out.println("Multipllication is : " +(a*b*c));	
	}
	
	public void mul(int a , int b , int c , int d) {
		System.out.println("Multiplication is : " +(a*b*c*d));
	}
	
	public void mul(int a , int b , int c ,int d, int e) {
		System.out.println("Multiplication is : " +(a*b*c*d*e));
	}
	public void Div(int a , int b) {
		System.out.println("Division is : " +(a/b));
	}
	
	public void Div(int a , int b ,int c) {
		System.out.println("Division is : " +(a/b/c));
	}
	public void Div(int a ,int b , int c , int d) {
		System.out.println("Division is : " +(a/b/c/d));
	}
	
	public void Div(int a , int b ,int c , int d ,int e) {
		System.out.println("Dividion is : " +(a/b/c/d/e));
	}
	
}
