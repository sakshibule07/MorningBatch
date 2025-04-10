package Multithreading;

public class JoinEx extends Thread {
	
	static Thread main1;
	public void run()
	{
		try
		{
		main1.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName());
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
			
		}
	}
	public static void main(String[]args) throws InterruptedException
	{
		
		main1=Thread.currentThread()	;
		JoinEx th = new JoinEx();
		
		th.start();
		//th.join();                        //to print first child element until then keep parent for waiting
		for(int i=1;i<=5;i++)
		{
		System.out.println(Thread.currentThread().getName());
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		}
		
		
	}

}
