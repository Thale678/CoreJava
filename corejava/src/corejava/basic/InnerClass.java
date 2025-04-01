package corejava.basic;

class A {

	String s = "Class A";

	public void print() {
		System.out.println(s);
	}

	class B {
		String s = "Class B";

		public void print() {
			System.out.println(s);

		}

		class C {
			String s = "Class C";

			public void print() {
				System.out.println(s);

			}
		}
	}
}

public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.print();

		A.B b = a.new B();
		// to access inner class use this syntax - mainclass.subclass.subclass obj =
		// parentcalssobj.new subclass()
		b.print();

		A.B.C c = b.new C();
		c.print();
	}

}
