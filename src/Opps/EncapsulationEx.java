package Opps;

class Person{
	
	private int age;
	
	public void setName(int newAge) {
		
		age=newAge;
	}
	public int getName() {
		return age;
	}
}
public class EncapsulationEx{
	public static void main(String[]args) {
		
		Person obj = new Person();
		obj.setName(10);
		System.out.println("my age is "+obj.getName());
	}
}