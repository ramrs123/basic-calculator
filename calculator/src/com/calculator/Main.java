package com.calculator;

import java.util.Scanner;

public class Main  extends Operations{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int choice = 1;
		while(choice == 1) {
			
		System.out.println("Enter a and b values : ");
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		System.out.println("Which operation You want to perform :...(1 , 2 , 3 , 4)");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");

		System.out.println();

		int options = sc.nextInt();
		
		
		switch (options) {
		
		case 1:
			
			Operations.add(a, b);
			
			break;
			
		case 2:
			
			Operations.subtract(a,b);
			
			break;
			
		case 3:
			
			Operations.multiply(a, b);
			
			break;
			
		case 4:
			
			Operations.divide(a, b);
			
			break;
			
			
		default:
			
			System.out.println("Please provide a and b values");
		}
		
		
		System.out.println("Do you want to try again .? (1 for yes / 0 for no)");
		
		choice = sc.nextInt();
		
		if(choice == 0) {
			sc.close();
			
			System.out.println("Calculator closed...");
			return;
		}
		
		System.out.println();

		}
	}

}
