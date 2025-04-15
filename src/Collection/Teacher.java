package Collection;
import java.util.List;

public class Teacher {
	private int tid;
	private String tname;
	private String position;
	private List <Student> students;
	
	public Teacher() { 
		
	}                                                
	
	 //right click || click on source || constructor using fields  
	
	public Teacher(int tid, String tname, String position, List<Student> students) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.position = position;
		this.students = students;
	}
	 
	// right click || source || click on getter setter

	public int getTid() {
		return tid;
	}


	public void setTid(int tid) {
		this.tid = tid;
	}


	public String getTname() {
		return tname;
	}


	public void setTname(String tname) {
		this.tname = tname;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public List<Student> getStudents() {
		return students;
	}


	public void setStudents(List<Student> students) {
		this.students = students;
	}

		//right click || source || toString

	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", position=" + position + ", students=" + students + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		
		

	}

}
