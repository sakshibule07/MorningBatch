package Multithreading;

public class PriorityEx extends Thread
{
	public void run() 
	{
		   for(int i=1; i<=5;i++) 
		   {
			Thread.currentThread().setPriority(MAX_PRIORITY);
			System.out.println("Child"+Thread.currentThread().getPriority());
			  
			   try 
			   {
				Thread.sleep(1000);   
			   }
			   catch(InterruptedException e) {
				   e.printStackTrace();
			   }
	      }
	}
	public static void main(String[]args) 
	{
		PriorityEx th = new PriorityEx();
		th.start();
		
		for(int i=1; i<=5;i++)
		{
		Thread.currentThread().setPriority(MIN_PRIORITY);
		System.out.println("main"+Thread.currentThread().getPriority());
		 
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
