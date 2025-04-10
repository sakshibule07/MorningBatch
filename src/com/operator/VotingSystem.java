package com.operator;
import java.util.Scanner;

public class VotingSystem {
 public static void main(String[]args)
 {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your age:");
	int age = sc.nextInt();
	if (age>=18)
	{
		System.out.println("Your Eligible to vote!!!");
	}
	else if(age<= 18)
	{
		System.out.println("Your are not Eligible for vote");
	}
	else
	{
		System.out.println("Invalid Data");
	}
 }
}
