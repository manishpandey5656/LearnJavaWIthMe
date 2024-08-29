package homework;

public class SmartPhone extends Device {
	String os ;
	String camRes;
	
	public SmartPhone( String brandName, String modelname, String os, String camRes) {
		this.brand = brandName;
		this.model= modelname;
		this.os = os;
		this.camRes = camRes;
	}
	 
	@Override
	public String toString() {
		return "SmartPhone [brand=" + brand + ", model=" + model + "OS of this SmartPhone =  "+ os +" "+"camera Resolution =  "+camRes+"]";
	}

	public static void main(String args[]) {
	
	SmartPhone s1 = new SmartPhone("Nokia", "3301", "ios", "10mp");
	System.out.println(s1);
	s1.powerOn(false);
	
	
}
	}
