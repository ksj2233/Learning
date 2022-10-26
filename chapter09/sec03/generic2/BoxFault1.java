package sec03.generic2;

public class BoxFault1 {

	public static void main(String[] args) {
		Box<Apple> aBox = new Box<>();
		Box<Orange> bBox = new Box<>();

		aBox.setOb(new Apple());
		bBox.setOb(new Orange());

		Apple apple = aBox.getOb();
		Orange orange = bBox.getOb();

		System.out.println(apple);
		System.out.println(orange);
		System.out.println(new Apple());
	}

}
