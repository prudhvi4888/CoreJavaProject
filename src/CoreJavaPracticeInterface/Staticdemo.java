package CoreJavaPracticeInterface;

public class Staticdemo {
	
	int carloaAmount;
	int homeloanAmount;  // Instance variable 
	String name;
	static String state="VA"; //class level variable and is shared across all the instances created.
	//static block
	static int totalAmount;
	static String insuranceName;
	static {
		totalAmount=50000;
		insuranceName="AAA";
	}

	public Staticdemo(int carloaAmount, int homeloanAmount, String name) {
		this.carloaAmount= carloaAmount;
		this.homeloanAmount=homeloanAmount;
		this.name=name;
	}

	public void getDetails() {
		System.out.println(carloaAmount+" "+homeloanAmount+" "+name+" "+state);
			
	}
	
	public static void getName() { //static methods only accept static variables
		System.out.println(state+" "+insuranceName);
	}
	
	public static void main(String[] args) {
		 
		
		Staticdemo obj= new Staticdemo(12000,40000,"Dave");
		obj.getDetails();
		Staticdemo.getName(); //static methods and variables can be called directly with out object creation using classname. 
		Staticdemo.state="MD";
;
		
	}

}
