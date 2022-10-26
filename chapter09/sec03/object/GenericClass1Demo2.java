package sec03.object;

public class GenericClass1Demo2 {

	public static void main(String[] args) {
		Cup<Beer> c = new Cup<Beer>();

		c.setBeverage(new Beer());
		Beer b1 = c.getBeverage();

		// c.setBeverage(new Boricha());
		b1 = c.getBeverage();

	}

}
