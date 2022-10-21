package sec02;

public class StringBuilderDemo {

	public static void main(String[] args) {

		String s = new String("hi");
		System.out.println(s.hashCode());
		s = s + "!";
		System.out.println(s.hashCode());

		StringBuilder sb0 = new StringBuilder();

		StringBuilder sb = new StringBuilder("hi");
		System.out.println("sb.length() : " + sb.length());
		System.out.println("sb.capacity() : " + sb.capacity());
		System.out.println("sb0.length() : " + sb0.length());
		System.out.println("sb0.capacity() : " + sb0.capacity());
		System.out.println();
		System.out.println(sb.hashCode());
		sb = sb.append("!");
		System.out.println(sb);

		System.out.println(sb.replace(0, 2, "Good bye").insert(0, "Java, "));
		System.out.println("sb.length() : " + sb.length());
		System.out.println("sb.capacity() : " + sb.capacity());
		System.out.println("sb.hashCode() : " + sb.hashCode());
		System.out.println(sb);

	}

}
