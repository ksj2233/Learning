package lotto;

public class Lotto_Test {
	public static void main(String[] args) {
		// 로또 번호 뽑기 프로그램
		int num = 5; // 횟수
		int[] lotto = new int[6];

		for (int j = 1; j <= num; j++) {
			lotto_num(lotto);
			lotto_Test(lotto);
			lotto_Asc(lotto);

			System.out.printf("자동 %d 번째 : ", j);
			for (int i = 0; i < 6; i++) {
				System.out.print("\t" + lotto[i]);
			}
			System.out.println();

		}
	}

	public static int[] lotto_num(int[] lotto) {

		for (int i = 0; i < 6; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);

		}

		return lotto;
	}

	static int[] lotto_Test(int[] lotto) {

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (i == j)
					continue;
				else if (lotto[i] == lotto[j]) {
					lotto[j] = (int) (Math.random() * 45 + 1);
					lotto_Test(lotto);
				}

			}
		}
		return lotto;
	}

	static int[] lotto_Asc(int[] lotto) {
		int temp = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				if (lotto[j] > lotto[j + 1]) {
					temp = lotto[j];
					lotto[j] = lotto[j + 1];
					lotto[j + 1] = temp;
				}
			}
		}

		return lotto;
	}

}
