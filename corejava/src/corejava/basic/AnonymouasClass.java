package corejava.basic;

class Test {

	public void print() {
		System.out.println("Class A");
	}
}

public class AnonymouasClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.print();

		Test antest = new Test(){
			public void print() {
		System.out.println("Class Anonymous");
	}
		};

		antest.print();
	}

}
