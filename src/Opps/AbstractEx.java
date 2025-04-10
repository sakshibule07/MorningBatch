package Opps;


abstract class demo{
	abstract void show();
	
	public void show1() {
		System.out.println("hello show1");
	}
}
public class AbstractEx extends demo {
	 @Override
	 public void show() {
		 System.out.println("hello show");
	 }
	 
	 public static void main(String[]args) {
		 
		 AbstractEx obj = new AbstractEx();
		 obj.show();
		 obj.show1();
	 }
		
		

}
