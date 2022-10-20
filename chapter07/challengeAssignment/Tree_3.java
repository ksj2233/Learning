package challengeAssignment;

public class Tree_3 extends Countable_3 {

	Tree_3(String name, int num) {
		super(name, num);
	}

	@Override
	public void count() {
		System.out.printf("%s가 %d그루 있다.\n", name, num);
	}

	void ripen() {
		System.out.printf("%d그루 %s에 열매가 잘 익었다.\n", num, name);
	}
}
