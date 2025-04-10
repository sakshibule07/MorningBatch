package Multithreading;

public class TestBankStatic extends Thread {
	
	private int rupees;
	private BankTransaction bt;
	
	public TestBankStatic(int rupees,BankTransaction bt)
	{
		this.rupees = rupees;
		this.bt = bt;
	}
	public void run()
	{
		bt.withdralMoney(rupees);
	}
	
    public static void main(String[]args)
    {
    	BankTransaction obj=new BankTransaction();
    	
    	TestBankStatic th = new TestBankStatic(35,obj);
    	th.start();
    	
    	BankTransaction obj1 = new BankTransaction();
    	TestBankStatic th1= new TestBankStatic(35,obj1);
    	th1.start();
    }

}
