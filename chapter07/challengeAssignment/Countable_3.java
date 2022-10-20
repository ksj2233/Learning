package challengeAssignment;

public abstract class Countable_3 {
	protected String name;
	protected int num;

	Countable_3(String name, int num) {
		this.name = name;
		this.num = num;
	}

	abstract void count();
}
