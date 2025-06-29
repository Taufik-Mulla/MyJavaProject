package string;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String("hello");
		String s2 = "Hello";

		s2=s2.concat("world");
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		char[]ch=s2.toCharArray();
		for(char c:ch) {
			System.out.println(c);
		}	
		String s4="      Teena    ";
	}

}
