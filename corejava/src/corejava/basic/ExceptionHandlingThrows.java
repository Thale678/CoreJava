  package corejava.basic;

class AX {

	public void show() throws ClassNotFoundException {
		Class.forName("ExceptionHandlingThrows");
		System.out.println("Class A");
	}
}

public class ExceptionHandlingThrows {

	static {
		System.out.println("class loaded");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AX ax = new AX();
		try {
			ax.show();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("In Catch block");
		}

		System.out.println("Bye");
	}

}
