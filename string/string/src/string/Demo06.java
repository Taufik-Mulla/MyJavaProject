package string;

public class Demo06 {

	public static void main(String[] args) {

		String s1 = "Welcome to java programming";
		String s2 = "abg";

		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.isEmpty());
		System.out.println(s1.length());

		s1 = s1.replace('a', '*');
		System.out.println(s1);

		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3, 8));

	}

}
