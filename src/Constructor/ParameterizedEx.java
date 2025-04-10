package Constructor;


class car {
	
	String model;
	int year;
	
	car(String m , int y)
	{
		String model = m;
		year = y;
	}
	
	void display() {
		System.out.println("My car model is: " +model+ "  of year:"+year);
	}
}

public class ParameterizedEx {
	
	public static void main(String[]args)
	{
		car obj = new car("swift",2025);
		obj.display();
	}
}
