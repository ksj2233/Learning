package sec06.box;

public class BoxHandler {
	public static void outBox(Box<Toy> box) {
		Toy t = box.get();
		System.out.println(t);
	}

	public static void outBox2(Box<? extends Toy> box) {
		Toy t = box.get();
		System.out.println(t);
//		box.set(new Toy());  사용할수 없다.
	}

	public static <T> void outBox3(Box<? extends T> box) {
		T t = box.get();
		System.out.println(t);
	}

	public static void inBox(Box<Toy> box, Toy n) {
		box.set(n);
	}

	public static void inBox2(Box<? super Toy> box, Toy n) {
		box.set(n);
//		Toy t = box.get(); //사용할수 없다.
	}

	public static <T> void inBox3(Box<? super T> box, T n) {
		box.set(n);
	}

}
