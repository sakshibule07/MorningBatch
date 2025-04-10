package Multithreading;

public class EarningEx extends Thread{
	
	int totalEarning=0;
	public void run() {
		synchronized (this) 
		{
			for(int i=1;i<=10;i++) 
			{
				totalEarning +=100;
			
			}
			notify();
		}
	}
	
	public static void main(String[]args) throws InterruptedException
	{
		EarningEx th = new EarningEx();
		th.start();
		synchronized (th)
		{
			th.wait();
		}
		System.out.println(th.totalEarning);
	}

}

