package sec03.generic3;

public class DBox<L, R> {
	private L left;
	private R right;

	public void set(L left, R right) {
		this.left = left;
		this.right = right;

	}

	public String toString() {
		return left + " & " + right;
	}

}
