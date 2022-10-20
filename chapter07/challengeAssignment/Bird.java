package challengeAssignment;

public class Bird implements Countable {

	String name;

	public Bird(String name) {
		this.name = name;
	}

	@Override
	public void count() {
		System.out.println(name + "가 2마리 있다.");
	}

	void fly() {
		System.out.printf("2마리 %s가 날아간다.\n", name);
	}
}
