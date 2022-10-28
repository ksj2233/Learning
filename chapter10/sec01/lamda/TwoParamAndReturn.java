package sec01.lamda;

public class TwoParamAndReturn {

	public static void main(String[] args) {
		Calculate c;

		c = new Calculate() {

			@Override
			public int cal(int a, int b) {

				return a + b;
			}
		};

//		1번
		c = (a, b) -> {
			return a + b;
		};

//		2번
		c = (a, b) -> a + b;

		System.out.println(c.cal(2, 3));

	}

}
