package sec06.box;

public class BoundWildCardBase {

	public static void main(String[] args) {
		Box<Toy> box = new Box<>();
		Toy toy = new Toy();
		BoxHandler.inBox(box, toy);
		BoxHandler.outBox(box);

		Box<Robot> rBox = new Box<>();
		BoxHandler.inBox3(rBox, new Robot());
		BoxHandler.outBox3(rBox);

	}

}
