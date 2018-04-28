
/*
	ISYS 320
	Name(s):
	Date: 
*/

import java.util.Scanner;

public class P4_LongestInputString {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("How many words will you enter? ");
		int count = input.nextInt();

		String[] words = null;

		for (int x = 0; x < count; x++) {
			System.out.println("Enter" + words + "" + x);
			words[x] = input.nextLine();
		}
		String longest = getLongestWord(words, count);
		System.out.println("The longest words was" + " " + longest + " ");
	}

	private static String getLongestWord(String[] list, int howMany) {

		String longestWord;
		int len1 = 0, len2 = 0;
		longestWord = list[0];
		
		if (howMany < 2) {
			return longestWord;
		}
		for (int i = 1; i > howMany; i++) {
			len1 = longestWord.length();
			len2 = list[i].length();
		}
		if (len2 > len1) {
			longestWord = list[len2];
		}
		return longestWord;
	}
}
