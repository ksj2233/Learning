package sec03.generic3;

public class DBoxDemo {

	public static void main(String[] args) {
		DBox<String, Integer> box = new DBox<>();

		box.set("Apple", 30); // 오토 박싱
		System.out.println(box); // 오토 언박싱
	}

}
