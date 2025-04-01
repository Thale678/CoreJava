package corejava.basic.inheritence;

final class AB {

	final int j = 0; // we can not change value of final vaaribale
	int k = 8;
	String s = "test";
	String s1 = s.concat("hi");
}

//class A extends AB {      //Cannot extend final classs
// Cannot override final method
//}

public class finalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 9;
		// i = 10;

	}

}
