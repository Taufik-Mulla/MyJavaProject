package string;

public class Demo05 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		sb.append("ab");
		System.out.println(sb.length() + " " + sb.capacity());

		StringBuilder sb1 = new StringBuilder();
		sb1.append("xyz");
		System.out.println((sb1.length() + " " + sb.capacity()));

	}

}
