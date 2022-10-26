package sec03.generic;

public class BoxFault2 {

	public static void main(String[] args) {
		Box aBox = new Box();
		Box bBox = new Box();

		aBox.setOb("Apple");
		bBox.setOb("Orange");

		Apple apple = (Apple) aBox.getOb();
		Orange orange = (Orange) bBox.getOb();

		System.out.println(apple);
		System.out.println(orange);
	}

}
