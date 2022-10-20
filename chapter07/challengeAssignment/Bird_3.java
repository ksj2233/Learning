package challengeAssignment;

public class Bird_3 extends Countable_3 {

	Bird_3(String name, int num) {
		super(name, num);

	}

	@Override
	public void count() {
		System.out.printf("%s가 %d마리 있다.\n", name, num);
	}

	void fly() {
		System.out.printf("%d마리 %s가 날아간다.\n", num, name);
	}
}
