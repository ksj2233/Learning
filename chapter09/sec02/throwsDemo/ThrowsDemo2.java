package sec02.throwsDemo;

import java.util.Scanner;

public class ThrowsDemo2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			square(in.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("정수가 아닙니다.");
			System.out.println(e.getMessage());
		}

	}

	private static void square(String s) throws NumberFormatException {
		int n = Integer.parseInt(s);
		System.out.println(n * n);

	}

}
