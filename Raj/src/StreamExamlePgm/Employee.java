package StreamExamlePgm;

public class Employee {

	
		private int age;
		
		private String gender;
		
		private String name;
		
		private double salary;

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public Employee(int age, String gender, String name, double salary) {
			super();
			this.age = age;
			this.gender = gender;
			this.name = name;
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [age=" + age + ", gender=" + gender + ", name=" + name + ", salary=" + salary + "]";
		}
		
		
		
		
	

}
