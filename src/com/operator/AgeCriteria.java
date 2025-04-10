package com.operator;
import java.util.Scanner;
public class AgeCriteria 
{
 public static void main(String[]args) 
 {
	 Scanner sc = new Scanner(System.in);
	 int ageA,ageB,ageC;
	 String oldestperson="";
	 System.out.println("Enter age of person A:");
	 ageA = sc.nextInt();
	 System.out.println("Enter age of Person B:");
	 ageB = sc.nextInt();
	 System.out.println("Enter age of Person C:");
	 ageC = sc.nextInt();
	 if (ageA > ageB && ageA > ageC)
	 {
		 oldestperson = "PersonA";
	 }
	 else if (ageB > ageA && ageB > ageC)
	 {
		 oldestperson = "PersonB";
	 }
	 else if(ageC > ageA && ageC > ageB)
	 {
		 oldestperson = "PersonC";
	 }
	 else
	 {
		 System.out.println("No single person is oldest there is a tie");
	 }
	 System.out.println(oldestperson+ "is oldest");
	 
	 
	 
 }
}

