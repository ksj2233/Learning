package sec06.box;

public class BoundWildCardGenericMethod {

	public static void main(String[] args) {
		Box<Toy> tbox = new Box<>();
		BoxHandler.inBox3(tbox, new Toy());
		BoxHandler.outBox3(tbox);

		Box<Robot> rbox = new Box<>();
		BoxHandler.inBox3(rbox, new Robot());
		BoxHandler.outBox3(rbox);

	}

}
