package corejava.basic.inheritence;

class Parent {

	public void show() {
		System.out.println("I am Parent class");
	}
}

class child1 extends Parent {

	public void show() {
		System.out.println("I am Parent child1");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Method overrding is a runtime polymorphism,where child class overides method
		// of parent class
		child1 c = new child1();
		c.show();
		Parent p = new child1(); // Dynamic method dispatch - it will call mwthod from child class
		p.show();
	}

}
