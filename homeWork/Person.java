package homework;
// question2:
/* Multilevel Inheritance Scenerio: - 
 Create a base class called Person , a derived class Employee that inherits from Person, and a further derived class called Manager that inherits 
 from Employee. The Person class should contain attributes for name and age , along with method to display personal information. THe employee
 class should add attributes for employeeId and department, along with method to display employee-specific  information. 
 The manager class should add an attribute for teamSize and a method to display manager-specific information.
 
 * */
public class Person {
	String name;
	int age;
	
	public void display(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("person name = "+ name+" and age =  "+ age);
	}

}
