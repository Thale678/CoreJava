package corejava.basic;

import java.text.DecimalFormat;
import java.util.Arrays;

class student {
	String name;
	int std;
	int rollno;

	@Override
	public String toString() {
		return "student [name=" + name + ", std=" + std + ", rollno=" + rollno + "]";
	}

}

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Single dimetional array
		int nums[] = new int[4];

		nums[0] = 5;
		nums[1] = 8;
		nums[3] = 2;
		nums[2] = 7;
		// nums[4] = 88;

		for (int n : nums) {

			System.out.print(n + "  ");

		}
		// MultiDimesional Array
		System.out.println();
		int num[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				num[i][j] = (i * 10) + j;
			}
		}

		// Print using normal for loop
		DecimalFormat decimalFormat = new DecimalFormat("00");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.print(decimalFormat.format(num[i][j]) + "  ");
			}
			System.out.println();
		}
		// Print using enhanced for loop
		System.out.println("Print using enhanced for loop");
		for (int[] i : num) {
			// System.out.println(Arrays.toString(i));
			for (int j : i) {
				System.out.print(decimalFormat.format(j) + "  ");
			}
			System.out.println();
		}

		// Jagged Array

		int jaggedarr[][] = new int[4][];

		jaggedarr[0] = new int[2];
		jaggedarr[1] = new int[4];
		jaggedarr[2] = new int[1];
		jaggedarr[3] = new int[3];

		System.out.println("\n\n JAGGED ARRAY");

		for (int i = 0; i < jaggedarr.length; i++) {
			for (int j = 0; j < jaggedarr[i].length; j++) {
				jaggedarr[i][j] = (i * 10) + j;
				// System.out.print(jaggedarr[i][j] + " ");

			}
			// System.out.println();
		}

		for (int[] i : jaggedarr) {
			// System.out.println(Arrays.toString(i));
			for (int j : i) {
				System.out.print(decimalFormat.format(j) + "  ");
			}
			System.out.println();
		}

		int arr3d[][][] = new int[3][3][3];

		System.out.println("\n\n 3D ARRAY");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					arr3d[i][j][k] = (i * 100) + (j * 10) + k;
				}
			}
		}

		for (int[][] m : arr3d) {
			for (int[] n : m) {
				System.out.println(Arrays.toString(n));
			}
			System.out.println();
		}
		// Array of Objects

		System.out.println("Print array of object");
		student students[] = new student[4];

		student s1 = new student();
		s1.name = "ram";
		s1.rollno = 69;
		s1.std = 7;

		student s2 = new student();
		s2.name = "manoj";
		s2.rollno = 45;
		s2.std = 11;

		student s3 = new student();
		s3.name = "rohiy";
		s3.rollno = 15;
		s3.std = 9;

		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s2;
		for (student s : students) {
			System.out.println(s);
		}

	}

}
