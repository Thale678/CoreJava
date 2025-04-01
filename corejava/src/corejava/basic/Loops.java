package corejava.basic;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// While Loop
		int i = 1;
		while (i <= 5) {
			System.out.println("Hello : " + i);
			i++;
		}

		// Do While Loop
		int j = 2;
		do {
			System.out.println("Hi : " + j);
			j++;
		} while (j <= 5);

		// For Loop

		for (int s = 1; s <= 5; s++) {

			for (int a = 1; a <= 5 - s; a++) {
				System.out.print("  ");

			}

			for (int k = 1; k <= (s * 2) - 1; k++) {
				System.out.print("* ");

			}

			System.out.println();
		}

		for (int s = 4; s >= 1; s--) {

			for (int a = 1; a <= 5 - s; a++) {
				System.out.print("  ");

			}

			for (int k = 1; k <= (s * 2) - 1; k++) {
				System.out.print("* ");

			}

			System.out.println();
		}

	}

}
