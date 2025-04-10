package POJO;

public class TestPratice {
	public static void main(String[]args)
	{
		pratice p1 = new pratice();
		p1.setId(10);
		p1.setName("sakshi");
		p1.setAge(20);
		System.out.println(p1);
		pratice p2 = new pratice(12,"sakshibule",20);
		System.out.println(p2);
	}

}
