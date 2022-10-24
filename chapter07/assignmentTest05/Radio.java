package assignmentTest05;

public class Radio extends Controller {

	String name = "라디오";

	public Radio(boolean onOff) {
		power = onOff;
	}

	@Override
	String getName() {
		return name;
	}

}
