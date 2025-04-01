package corejava.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BufferReaderAndScanner {

	public static void main(String[] args) throws IOException, NumberFormatException {
		// TODO Auto-generated method stub
		BufferedReader bf = null;
		try {
			InputStreamReader in = new InputStreamReader(System.in);
			bf = new BufferedReader(in);
			System.out.println("Enter a String");
			String str = bf.readLine();
			System.out.println(str);

			System.out.println("Enter a Number"); // its always take input as string
			int num = Integer.parseInt(bf.readLine()); // converting to int
			System.out.println(num);

			System.out.println("******************************************\n");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a String");
			String str1 = sc.nextLine();
			System.out.println(str1);
			System.out.println("Enter a number");
			int num1 = sc.nextInt();
			System.out.println(num1);
		} catch (NumberFormatException e) {
			System.out.println("Enter a valid number");
		} catch (InputMismatchException e) {
			System.out.println("Enter a valid number");
		} finally {

			bf.close();
			System.out.println("bye");
		}

	}

}
