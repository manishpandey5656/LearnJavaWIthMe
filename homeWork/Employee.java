package homework;
//question2:
/* Multilevel Inheritance Scenerio: - 
Create a base class called Person , a derived class Employee that inherits from Person, and a further derived class called Manager that inherits 
from Employee. The Person class should contain attributes for name and age , along with method to display personal information. THe employee
class should add attributes for employeeId and department, along with method to display employee-specific  information. 
The manager class should add an attribute for teamSize and a method to display manager-specific information.

* */
public class Employee extends Person {
	int empId;
	String department;
	
	/*public Employee(String name, int age, int empId,String department ) {
	   this.name = name;
		this.age = age;
		this.empId = empId;
		this.department = department;
		
	}*/ 
	
	
	public void display() {
		System.out.println(" Id of the Employee : - "+ empId);
		System.out.println(" name of the Employee : - "+ name);
		System.out.println(" age of the Employee : - "+ age);
		System.out.println(" department of the Employee : - "+ department);
	}
}
