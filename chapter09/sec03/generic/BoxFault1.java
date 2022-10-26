package sec03.generic;

public class BoxFault1 {

	public static void main(String[] args) {
		Box aBox = new Box();
		Box bBox = new Box();

		aBox.setOb(new Apple());
		bBox.setOb(new Orange());

		Apple apple = (Apple) aBox.getOb();
		Orange orange = (Orange) bBox.getOb();

		System.out.println(apple);
		System.out.println(orange);
	}

}
