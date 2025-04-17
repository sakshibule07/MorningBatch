package Collection;

import java.util.List;

public class Company {

	private int cid;
	private String cname;
	private String location;
	private String category;
	private List<Project> projects;
	
	public Company() {
		
	}

	public Company(int cid, String cname, String location, String category, List<Project> projects) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.location = location;
		this.category = category;
		this.projects = projects;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Company [cid=" + cid + ", cname=" + cname + ", location=" + location + ", category=" + category
				+ ", projects=" + projects + "]";
	}

}
