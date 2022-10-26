package sec04.genericextends;

public class BoxDemo {

	public static void main(String[] args) {
		Box<Integer> ibox = new Box<>();
		ibox.set(560);
		System.out.println(ibox.get());

		Box<Double> dbox = new Box<>();
		dbox.set(123.4567);
		System.out.println(dbox.get());
	}

}
