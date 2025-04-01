package corejava.basic;

class sum {

	public int add(int n1, int n2) {

		return n1 + n2;

	}

	public int add(int n1, int n2, int n3) {

		return n1 + n2 + n3;

	}

}

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum s = new sum();
		int sum = s.add(5, 9);

		System.out.println(sum);

		int sum2 = s.add(5, 9, 4);

		System.out.println(sum2);
	}

}
