package sec04.genericextends;

public class Box<T extends Number> {
	private T ob;

	public void set(T o) {
		ob = o;

	}

	public T get() {
		return ob;
	}
}
