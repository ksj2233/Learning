package sec03;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");

		int a = in.nextInt();
		System.out.print("정수를 입력하세요 : ");
		int z = in.nextInt();

		System.out.println(a + " 와 " + z + "사이의 난수 10개는 =");

		int j = 0;

		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			j = r.nextInt(z + 1);
			if (a <= j) {
				System.out.print(j + " ");
			} else
				i--;

		}
	}

}
