package Collection;

import java.util.ArrayList;
import java.util.List;

public class TestTeacher {

	public static void main(String[] args) {
		Student stud = new Student (1,"sakshi",99,"Pune");
		Student stud1 = new Student (2,"Bule",89,"katraj");
		Student stud2 = new Student (3,"saksu",90,"wagholi");
		
		ArrayList<Student>list =new ArrayList<Student>();
		
		list.add(stud);
		list.add(stud1);
		list.add(stud2);
		
		Teacher teach = new Teacher (1,"sakshiBule","Assi.Prof",list);
		System.out.println(teach);
		
		List <Student> students = teach.getStudents();
		
//		for(Student studen :students) {
//			System.out.println(studen.getName());
//		}
		
		int sum = 0;
		int count = 0;
		
		for (Student studen : students) {
			sum += studen.getMarks();
			count++;
	
		}
		
		int avg = sum/count;
		System.out.println(avg);
		
		for(Student studen : students) {
			if(studen.getMarks()>=avg) {
				System.out.println(studen.getName());
			}
		}
		
		
		

	}

}
