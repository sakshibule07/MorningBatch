package Multithreading;

public class BankTransaction {
	
	static int totalBalence = 100;                //used static
	
	public static synchronized void withdralMoney(int rupees)       //used static so its static synchronized which is 3rd method
	{
		if(totalBalence >= rupees)
		{
			System.out.println(rupees+"rupees withdraw successfully");
			totalBalence -= rupees;
			System.out.println(totalBalence+"ruppees available");
		}
		else
		{
			System.out.println("Insufficient balnace.....");
			System.out.println("rupees available..........");
		}
	}
	

}
