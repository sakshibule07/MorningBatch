package Constructor;

class Car{
	String model;
	int year;
    
	Car(String m,int y){
		model=m;
		year=y;
	}
	Car(Car c){
		model = c.model;
		year = c.year;
	}
	void display() {
		System.out.println("Model: " +model+ " Year:" +year);
	}
	
}

public class CopyEx {
	public static void main(String[]args)
	{
		Car obj = new Car("honda",123);
		Car obj2 = new Car(obj);
		
		obj.display();
		obj2.display();
		
		
		
		
	}

}
