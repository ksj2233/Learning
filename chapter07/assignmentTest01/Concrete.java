package assignmentTest01;

public class Concrete extends Abstract {
	int j;

	public Concrete(int i, int j) {
		super.i = i;
		this.j = j;

	}

	@Override
	void show() {
		System.out.printf("i = %d, j = %d\n", i, j);
	}

}
