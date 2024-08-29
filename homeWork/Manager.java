package homework;

public class Manager extends Employee {
	int teamSize;
	
	public Manager(int empId, String name, int age, String department,int teamSize) {
		this.empId = empId;
		this.age = age;
		this.name= name;
		this.department = department;
		this.teamSize = teamSize;
	}
	
	public void display() {
		System.out.println( "Employe ID = " + empId);
		System.out.println("Name of Manager= "+ name);
		System.out.println("age of employee= "+age);
		System.out.println("department of employee = "+ department);
		System.out.println("Team size of the team"+ teamSize);
	}
	 
	@Override
	public String toString() {
		return "Manager [teamSize=" + teamSize + ", empId=" + empId + ", department=" + department + ", name=" + name
				+ ", age=" + age + "]";
	}

	public static void main(String[] args) {
		Manager m1 = new Manager(1, "Manish", 23, "IT department",20);
		System.out.println(m1);
		m1.display();
	}
	
	


}
