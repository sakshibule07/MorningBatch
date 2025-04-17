package Collection;

import java.io.Serializable;

public class Developer implements Serializable {

		private transient int id;
		private transient String name;
		private String position;
		private int salary;
		
		public Developer() {
			
		}

		public Developer(int id, String name, String position, int salary) {
			super();
			this.id = id;
			this.name = name;
			this.position = position;
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Developer [id=" + id + ", name=" + name + ", position=" + position + ", salary=" + salary + "]";
		}
		
		

	}


