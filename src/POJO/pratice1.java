package POJO;
import java.util.Scanner;


public class pratice1 {
	int a;
	int b;
	
	public pratice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("value of a:");
		a = sc.nextInt();
		b=sc.nextInt();
	}
	

	public void divide() {
	try {
		if(b==0) {
			throw new ArithmeticException("cannot divide by zero");
		}
		int result = a/b;
		System.out.println(result);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally {
		System.out.println("closed");
	}
	}
	
	public static void main(String[]args)
	{
		pratice1 obj = new pratice1();
		obj.divide();
	}

}
