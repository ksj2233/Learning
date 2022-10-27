package sec06.box;

public class WildCardUnboxer {

	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.set("so simple String");
		Unboxer.peekBox(box);
//		Unboxer.peekBox3(box);
//		Unboxer.peekBox4(box);

		Box<Integer> iBox = new Box<>();
		iBox.set(5959);
		Unboxer.peekBox2(iBox);
		Unboxer.peekBox3(iBox);
		Unboxer.peekBox4(iBox);

		Box<Double> dBox = new Box<>();
		dBox.set(123.456);
		Unboxer.peekBox(dBox);
		Unboxer.peekBox2(dBox);
		Unboxer.peekBox3(dBox);
//		Unboxer.peekBox4(dBox); Integer 상위 클래스만 가능하게 제한되어 있음.

	}

}
