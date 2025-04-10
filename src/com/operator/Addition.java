package com.operator;
import java.util.Scanner;
public class Addition {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of a:");
		int a = sc.nextInt();
		//System.out.println("value of a is:"+a);
		System.out.println("Enter value of b:");
		int b = sc.nextInt();
		//int sum = a+b;
		System.out.println("Addition of numbers is:"+(a+b));
		System.out.println("Subtraction of numbers is:"+(a-b));
				
		
	}
}
