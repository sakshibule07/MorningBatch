package Multithreading;

public class TestBank extends Thread {
	static BankTransaction obj;
	 public void run()
	 {
		 obj.withdralMoney(35);
	 }
	public static void main(String[]args)
	{
		obj = new BankTransaction();
		
		TestBank th = new TestBank();
		th.start();
		
		TestBank th1= new TestBank();
		th1.start();
	}

}
