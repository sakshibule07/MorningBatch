package Collection;

import java.util.ArrayList;

public class TestCompany {

	public static void main(String[] args) {
		
		ArrayList<Project> list = new ArrayList<Project>();
		
		list.add(new Project(1001,"sakshi",78000));
		list.add(new Project(1002,"bule",87000));
		list.add(new Project(1003,"saku",89000));
		
		Company cmp = new Company(1,"TechnoGrowth","Warje Pune","IT",list);
		
		double sum = 0;
		for(Project project:cmp.getProjects()) {
			sum+=project.getBudget();
		}
		
		double avg = sum/list.size();
		System.out.println(avg);
		
		for(Project project:cmp.getProjects()) {
			if(project.getBudget()>=avg) {
				System.out.println(project.getPname());
			}
		}
		

	}

}
