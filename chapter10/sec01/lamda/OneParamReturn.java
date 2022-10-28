package sec01.lamda;

public class OneParamReturn {

	public static void main(String[] args) {
		Printable2 p;

		p = new Printable2() {

			@Override
			public void print(String s) {
				System.out.println(s);
			}
		};

//		1번
		p = (String s) -> {
			System.out.println(s);
		};

//		2번
		p = (s) -> System.out.println(s);

//		3번
		p = s -> System.out.println(s);

		p.print("Lamda exp four");

	}

}
