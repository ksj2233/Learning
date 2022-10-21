package sec02;

public class BuildString {

	public static void main(String[] args) {
		StringBuilder stbuf = new StringBuilder("123");

		stbuf.append(45678);
		System.out.println(stbuf);
		System.out.println(stbuf.toString());

		stbuf.delete(0, 2); // 앞 2글자 삭제
		System.out.println(stbuf);

		stbuf.replace(0, 2, "AB"); // 앞 2글자 변경
		System.out.println(stbuf);

		stbuf.reverse();
		System.out.println(stbuf);

		String sub = stbuf.substring(2, 4);
		System.out.println(sub);
		System.out.println(stbuf);
	}

}
