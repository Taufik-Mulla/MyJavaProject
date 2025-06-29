package string;

public class Demo04 {

	public static void main(String[] args) {

		String s1 = "Welcome to java programing";
		System.out.println(s1);

		String s[] = s1.split(" ");
		for (String string : s) {
			System.out.println(string);
		}
		char ch[] = s[0].toCharArray();

		for (char c : ch) {
			System.out.println(c);
		}
	}

}
