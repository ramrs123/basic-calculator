package com.calculator;

public class Operations {
	
	public  static void add(int a , int b) {
		
		System.out.println("The sum of " + a +" and " + b + " is : " + (a+b));
	}
	
	public static void subtract(int a, int b) {
		
		System.out.println("The difference of " + a +" and " + b + " is : " + (a-b));
	}
	
	public static void multiply(int a , int b) {
		
		System.out.println("The product of " + a +" and " + b + " is : " + (a*b));
	}
	
	public static void divide(int a , int b) {
		
		if(b == 0) {
			
			System.out.println("Zero Division Error : Division by Zero is not possible");
			
		}
		
		System.out.println("The division of " + a +" and " + b + " is : " + (a/b));
	}

}
