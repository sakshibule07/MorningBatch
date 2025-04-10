package Opps;

public class OverloadingEx {
	
	public void show(int val) {
		System.out.println(val);
	}
	public void show(String name) {
			System.out.println(name);
	}
	
	public static void main(String[]args)
	{
		OverloadingEx obj = new OverloadingEx();
		obj.show(0);
		obj.show("sakshi");
	}
}