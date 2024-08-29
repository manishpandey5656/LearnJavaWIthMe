package homework;
// question 1: - 
/* Single inheritance Scenerio: 
 Create a base class called Smartphone. The Device class should contain attributes for brand and model , along with methods to display device 
 information and power on and off.
 The SmartPhone class should inherit from Device class and includes additional attributes for operating System and cameraResolution, along with me
 methods to display SmartPhone- Specific information and take photo.
 
 */
import java.util.Scanner;
public class Device {
String brand;
String model;
public void display() {
	System.out.println("It's brand name is   "+ brand+" "+ "It's model is "+ model);
	
}
public void powerOn(boolean x) {
	if(x == true) {
	System.out.println(" Power is On");
	}
	else {
		powerOff(false);
	}
	
}

public static  void powerOff(boolean x) {
	if(x == false) {
	System.out.println("Power is off");
}}

}
