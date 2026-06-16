package LoopsClasswork;

import java.util.Scanner;

public class Example2 {
	
		//Q-> print table by taking user inputs
	
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("pleasse enter a number to get table");
		int input = sc.nextInt();
		sc.close();
		//consider input = 5
		//as table has 10 numbers so we want numbers from 1 to 10
		System.out.println("Table of "+ input +"is as follows - ");
         for(int i = 1 ; i <=10; i++) {
        	 System.out.println(i +"x"+input+"="+i*input);
         } 
		

	 }
	
	}