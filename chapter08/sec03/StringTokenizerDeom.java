package sec03;

import java.util.StringTokenizer;

public class StringTokenizerDeom {

	public static void main(String[] args) {
		String s = "of the people, by the people, for the people";
		getString(s, " ,");
		s = "PM:08:45";
		getString(s, ":");
		s = "12 + 36 - 5 / 2 = 44";
		getString(s, "+-/= ");
		s = "김 성 진";
		getString(s, " ");

//		StringTokenizer st = new StringTokenizer(s, " ,");
//
//		System.out.println(st.countTokens());
//
//		while (st.hasMoreTokens()) {
//			System.out.print("[" + st.nextToken() + "]");
//		}
	}

	static void getString(String s, String x) {
		StringTokenizer st = new StringTokenizer(s, x);

		System.out.println(st.countTokens());

		while (st.hasMoreTokens()) {
			System.out.print("[" + st.nextToken() + "]");
		}

		System.out.println();
	}

}
