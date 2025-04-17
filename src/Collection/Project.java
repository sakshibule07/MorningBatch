package Collection;

public class Project {

	
		private int pid;
		private String pname;
		private double budget;
		
		public Project() {

	}

		public Project(int pid, String pname, double budget) {
			super();
			this.pid = pid;
			this.pname = pname;
			this.budget = budget;
		}

		public int getPid() {
			return pid;
		}

		public void setPid(int pid) {
			this.pid = pid;
		}

		public String getPname() {
			return pname;
		}

		public void setPname(String pname) {
			this.pname = pname;
		}

		public double getBudget() {
			return budget;
		}

		public void setBudget(double budget) {
			this.budget = budget;
		}

		@Override
		public String toString() {
			return "Project [pid=" + pid + ", pname=" + pname + ", budget=" + budget + "]";
		}
		

}
