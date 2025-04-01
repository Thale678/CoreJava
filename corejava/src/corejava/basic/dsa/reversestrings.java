package corejava.basic.dsa;

import java.util.Arrays;

class stringfunction {

	public static void reversechars(String S) {

		String words[] = S.split(" ");

		// List<String> rwords = new ArrayList<String>();
		String rwords = "";
		System.out.println("Words :" + Arrays.toString(words));

		for (String word : words) {
			String rev = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				rev = rev + word.charAt(i);
			}
			rwords = rwords + rev + " ";
		}
		System.out.println("Reversed character sentence : " + rwords);
		// for (String word : rwords) {
		// System.out.print(word + " ");
		// }
	}

	public static void reversewords(String S) {
		String words[] = S.split(" ");
		int n = words.length;
		String rwords = "";// [] = new String[n];

		// List<String> rwords = new ArrayList<String>();
		for (int i = n - 1; i >= 0; i--) {
			rwords = rwords + words[i] + " ";
		}
		System.out.println("\nReverse word sentence :" + rwords);
	}

	public static void reversewordsandchars(String S) {
		String words[] = S.split(" ");
		int n = words.length;
		String rwords = "";// [] = new String[n];

		// List<String> rwords = new ArrayList<String>();
		for (int i = n - 1; i >= 0; i--) {
			String word = words[i];
			String rev = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				rev = rev + word.charAt(j);
			}

			rwords = rwords + rev + " ";
		}
		System.out.println("\nReverse word and char sentence :" + rwords);
	}
}

public class reversestrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S = "My Name is Manish";
		stringfunction.reversechars(S);
		stringfunction.reversewords(S);
		stringfunction.reversewordsandchars(S);

	}

}
