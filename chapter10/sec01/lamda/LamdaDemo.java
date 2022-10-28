package sec01.lamda;

public class LamdaDemo {

	public static void main(String[] args) {
		Negative n;
		Printable p;

		n = new Negative() {

			@Override
			public int neg(int x) {
				// TODO Auto-generated method stub
				return 0;
			}
		};

//		1번
		n = (int x) -> {
			return -x;
		};

//		2번
		n = (x) -> {
			return -x;
		};

//		3번
		n = x -> {
			return -x;
		};

//		4번
		n = (x) -> -x;

//		5번
		n = x -> -x;

////////////////////////////////////////////////////////////////////		

		p = new Printable() {

			@Override
			public void print() {
				System.out.println("Hi~~");
			}
		};
//		1번
		p = () -> {
			System.out.println("Hi~~");
		};

//		2번
		p = () -> System.out.println("Hi~~");

//		3번
		p.print();

	}

}
