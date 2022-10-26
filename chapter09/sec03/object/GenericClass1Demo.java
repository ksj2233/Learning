package sec03.object;

public class GenericClass1Demo {

	public static void main(String[] args) {
		Cup<Boricha> c = new Cup<Boricha>();

		c.setBeverage(new Boricha());
		Boricha b1 = c.getBeverage();

		c.setBeverage(new Boricha());
		// b1 = c.getBeverage();

	}

}
