package com.operator;

class Person
{
	String fname;
	String lname;
	int age;
	
	public Person()
	{
		System.out.println("hello");
	}
	public Person(String fname,String lname,int age)
	{
		this.age = age;
		this.fname = fname;
		this.lname = lname;
		System.out.println("hello2");
	}
	public Person(String fname,String lname)
	{
		this.fname = fname;
		this.lname = lname;
	}
	void Greet(int age)        //compile time polymorphism
	{
		this.age= age;
		System.out.println("good morning");
	}
}

public class oppsconcept {
	public static void main(String[]args) {
		Person p1 = new Person();
		Person p2 = new Person("sakshi","bule",25);
		System.out.println(p2.fname);
		Person p3 = new Person("Sakshi","bule");
		System.out.println("firstname:" +p3.fname);
	    p3.Greet(20);
	    System.out.println("My age"+p3.age);
}
}
