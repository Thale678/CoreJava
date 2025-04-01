package corejava.basic.inheritence;

class A {
	A() {
		System.out.println("in default A");
	}

	A(int a) {
		System.out.println("in parameterized A");
	}
}

class B extends A {

	B() {
		super(23);
		System.out.println("in default B");
	}

	B(int a) {
		this();
		System.out.println("in paremetarized B");
	}

	B(int a, String s) {
		this();// to call current class default constructor

		System.out.println("in 2 paremetarized B");
	}

}

class C extends B {

	C() {
		super(6, "HH");// To call parent class constructor;
		System.out.println("in default C");
	}
}

// when we create object of class , default constructor is automatically created and is haves super method 
//by deafult d.efault constructor of parent class is automatically called using this super() method;
// both super and default contructor  are hidden and autommatically called

public class ThisAndSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c = new C();

		// B b = new B();
	}

}
