package sec05.box;

import sec03.generic.Apple;

public class GenericMethodBoxMaker {

	public static void main(String[] args) {
		BoxFactory bf = new BoxFactory();
		Box<String> sBox = bf.makeBox("Sweet");
		System.out.println(sBox.get());

		Box<Double> dBox = bf.makeBox(7.59);
		System.out.println(dBox.get());

		Box<Apple> aBox = bf.makeBox(new Apple());
		System.out.println(aBox.get());

	}

}
