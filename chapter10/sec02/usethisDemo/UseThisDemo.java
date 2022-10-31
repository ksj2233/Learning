package sec02.usethisDemo;

interface UseThis {
	void use();
}

public class UseThisDemo {
	public void lamda() {
		String hi = "Hi!";

		UseThis u1 = new UseThis() {

			@Override
			public void use() {
				System.out.println(this);
			}
		};

		u1.use();
		System.out.println(u1);

		UseThis u2 = () -> System.out.println(this);
		u2.use();
	}

	public String toString() {
		return "UseThisDemo";
	}

	public static void main(String[] args) {
		int one = 1;
		new UseThisDemo().lamda();
	}

}
