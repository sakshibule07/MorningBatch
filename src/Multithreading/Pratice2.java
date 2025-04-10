package Multithreading;

class MyThread extends Thread{
	
	public void run() {
		for(int i=1 ;i<=5;i++) {
			System.out.println(Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
public class Pratice2{
	public static void main(String[] args) {
		MyThread obj = new MyThread();
		MyThread obj2 = new MyThread();
		//obj.setName("Thread1");
		//obj2.setName("Thread2");
		
		
		obj.start();
		//obj.join();
		try {
			obj.join();                    //Ensures obj completes before obj2 starts
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		obj2.start();             
		
	}
}