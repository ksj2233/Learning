package sec02;

public class ObjectMethoudDemo {

	public static void main(String[] args) {
		Mouth m1 = new Mouth("Logitech");
		Mouth m2 = new Mouth("Logitech");
		Mouth m3 = m1;
		Keyboard k1 = new Keyboard("Microsoft");
		Keyboard k2 = new Keyboard("Microsoft");

		System.out.println(m1.toString());
		System.out.println(m1);

		System.out.println(k1.toString());
		System.out.println(k1);

		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		System.out.println(k1.equals(k2));

	}

}
