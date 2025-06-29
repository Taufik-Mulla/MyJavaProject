package string;

import java.util.Arrays;

public class Demo08 {

	private static char[] ch;

	public static void main(String[] args) {
		String s1 = "Welcome to java programing";
		System.out.println(s1);

		String s[] = s1.split(" ");
		for (String string : s) {
			System.out.println(string);
		}
		for (char c : ch) {
			System.out.println(c);
		}
		System.out.println("********************");
		Arrays.sort(ch);
		for (char c : ch) {
			System.out.println(c);
		}
	}

}
