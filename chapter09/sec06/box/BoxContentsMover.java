package sec06.box;

public class BoxContentsMover {
	public static void moveBox(Box<? super Toy> to, Box<? extends Toy> from) {
		to.set(from.get());
	}
}
