package string;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Priya";
		String s2 = "Priya";

		String s3 = "Ramesh";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		String s4 = new String("Priya");

		System.out.println(s1 == s4);
		System.out.println(s1.equals(s4));

		String s5 = new String("Priya");
		System.out.println(s1.equals(s5));
		System.out.println(s4.equals(s4));

	}

}
