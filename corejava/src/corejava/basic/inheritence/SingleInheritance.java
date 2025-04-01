package corejava.basic.inheritence;

public class SingleInheritance {
	public static void main(String a[]) {
		System.out.println("Single Inheritance \n");

		SciCalculator cal = new SciCalculator();
		int sum = cal.add(10, 12);
		int sub = cal.sub(15, 10);
		int mul = cal.multiplication(6, 4);
		double div = cal.div(10, 3);
		double power = cal.power(2, 4);
		System.out.println(sum + "\n" + sub + "\n" + mul + "\n" + div + "\n" + power);
	}
}
