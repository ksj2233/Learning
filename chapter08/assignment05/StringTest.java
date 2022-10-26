package assignment05;

public class StringTest {
//	<문제>
//	String, StringBuilder, StringBuffer 클래스는 모두 
//	문자열을 처리하는 클래스이다. 다음 프로그램처럼 세 가지 타입에
//	모두 가능한 show() 메서드를 작성하라.
	
	public static void main(String[] args) {
		show(new String("멘붕"));
		show(new StringBuilder("meltdown"));
		show(new StringBuffer("!@#"));
//		show(new Date());
		
	}

	public static void show(Object str) {
	System.out.println(str);
}
}
