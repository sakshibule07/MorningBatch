package Opps;
class Grandparent{
	public void check1() {
		System.out.println("This is Grandparent.");
	}
}

class Parent extends Grandparent{
	public void show() {
		System.out.println("This is parent");
	}
}
class Child extends Parent{
	public void check() {
		System.out.println("This is Child");
	}
}
public class Inheritance{
	public static void main(String[]args) {
	Child obj = new Child();
	 obj.check();
	 obj.show();
	 obj.check1();
	}
}
