package Collection;

public class Student {
	
	private int id;
	private String name;
	private int marks;
	private String city;
	
	public Student() {
		
	}
	

	public Student(int id, String name, int marks, String city) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.city = city;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", city=" + city + "]";
	}


	public static void main(String[] args) {
		
		
	}

}
