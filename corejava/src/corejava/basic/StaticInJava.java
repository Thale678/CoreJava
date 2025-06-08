package corejava.basic;

 class mobile {
	public String name;
	public int price;
	static String brand; // static varibale

	// static block to initilize static variables.It will called only once
	

	public mobile() {
System.err.println("Constructor");
		name = "F6";
		price = 17000;
		brand = "Apple";
	}
	static {
		brand = "OPPO";
		System.err.println("Static Block");
	}

	public void show() {
		System.out.println(name + "\n" + price + "\n" + brand);
	}

	// In static method we can iuse static varibales directly,but use public
	// variables we have to use object.
	public static void show(mobile obj) {
		System.out.println(obj.name + "\n" + obj.price + "\n" + brand);
	}

}

public class StaticInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		 
		mobile m1 = new mobile();
		
		m1.show();
		System.out.println("*******************");
		m1.name = "V100";
		m1.price = 60000;
		m1.brand = "vivo";

		m1.show();
		// mobile.brand = "Vivo"; // static variable can accesssed directly with class
		// name,whithout creating instance
		// it will refelcts in all object of class
		mobile m2 = new mobile();
		m2.name = "13";
		m2.price = 55000;
		m2.brand = "Oneplus";

		m1.show();
		m2.show();
		System.out.println("*************************");
		// static methods can accesssed directly with class name,whithout creating
		// instance
		mobile.show(m2);
		
	}

}
