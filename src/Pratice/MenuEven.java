package Pratice;
import java.util.Scanner;

public class MenuEven {
	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number value of a:");
		int a = sc.nextInt();
		
		
		int flag = 1;
		while(flag!=0)
		{
			System.out.println("1.Check even odd");
			System.out.println("Enter choices");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				if(a % 2== 0) {
					System.out.println("Number is even");
				}
				else
				{
					System.out.println("number is odd");
				}
				break;
			case 2:
				flag = 0;
				continue;
				
			default:
				System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue yes..no");
			String str = sc.next();
			if(str.equals("yes")) {
				
			}
			else {
				flag = 0;
			}
		}
		System.err.println("out code");
	}

}
