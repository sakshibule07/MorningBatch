package Pratice;
import java.util.Scanner;

public class Menu {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result;
		
		boolean flag = true;    //true
		while(flag!=false)      //true!=false   condition becomes true and enters loop
		{
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			
			System.out.println("5.Enter choices:");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				result = a+b;
				System.out.println("Addition"+result);
				break;
			
			case 2:
				result = a-b;
				System.out.println("Subtraction"+result);
				break;
			case 3:
				result = a*b;
				System.out.println("Multiplication:"+result);
				break;
			case 4:
				result =a/b;
				System.out.println("Division"+result);
				break;
//			case 5:
//				flag = false;
//				continue;
			default:
				System.out.println("invalid choice..");
			}
			System.out.println("Do you want to continue  Yes.. or No...");
			String str = sc.next();
			if(str.equals("yes")) {
				
			}
			else {
				flag = false;
			}
			
		}
		System.err.println("Application closed");
	}
}
