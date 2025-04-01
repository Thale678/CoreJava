package corejava.basic;

import java.io.FileNotFoundException;

class CustomException extends RuntimeException {
	public CustomException(String msg) {
		super(msg);
		System.out.println("You are in Custom exception");
	}
}

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int I = 0;
		int J = 12;
		int arr[] = new int[5];
		try {
			if (I == 0) // throw keyword is used to throw user defined exceptions using userdefined
						// exception class
				throw new CustomException("J cannot be zero");
		} catch (CustomException e) {
			// TODO: handle exception
		}
		try {
			System.out.println(J / I);
			arr[2] = 7;
		} catch (ArithmeticException e) {
			System.out.println("enter valid values \n" + e);
			System.out.println(
					"Catch block is mandatory with try block to handle exceptions,it will executed only when exception occurs");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("out boundry \n" + e);

			

		} catch (Exception e) {
			System.out.println(
					"Something got Wrog,Its a global exception and it will handle all types of exceptions" + e);

		} finally {
			System.out.println("finally is a optinal block ,it will executer in any condition");
		}
		System.out.println("Bye");

	}
}
