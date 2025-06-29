package string;

public class Demo07 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("abcde");
		// sb.append("a")
		System.out.println(sb.length() + " " + sb.capacity());
		char ch = sb.charAt(1);
		System.out.println(ch);

		System.out.println(sb.isEmpty());
		System.out.println(sb.lastIndexOf("b"));
		sb.insert(0, "zzz");
		System.out.println(sb);

		StringBuilder sb1 = new StringBuilder("yyyy");
		// sb1.append("xyz");
		System.out.println(sb1.length() + " " + sb1.capacity());

	}

}
