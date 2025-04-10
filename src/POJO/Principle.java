package POJO;

public class Principle {

	private int pid;
	private String name;
	private String college;
	private Teacher teacher;
	
	public Principle() {
		
	}

	public Principle(int pid, String name, String college, Teacher teacher) {
		super();
		this.pid = pid;
		this.name = name;
		this.college = college;
		this.teacher = teacher;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Principle [pid=" + pid + ", name=" + name + ", college=" + college + ", teacher=" + teacher + "]";
	}
	public static void main(String[]args) {
		Teacher obj = null;
		Principle p1 = new Principle(125,"Bule","GPAN",obj); 
		System.out.println(p1);
	}
}
