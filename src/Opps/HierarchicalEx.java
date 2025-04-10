
package Opps;

class Animal{
	public void Dog(){
		System.out.println("bhooo");
	}
}
class Cat extends Animal{
	public void bark() {
		System.out.println("meow");
	}
}
class pet extends Animal{
	public void sound() {
		System.out.println("Animals sound");
	}
}
public class HierarchicalEx {
	public static void main(String[]args) {
		pet obj=new pet();
		obj.sound();
		obj.Dog();
		Cat obj1=new Cat();
		obj1.Dog();
		obj1.bark();
	}
}
