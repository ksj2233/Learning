package assignmentTest05;

public class TV extends Controller {

	String name = "TV";

	public TV(boolean onOff) {
		power = onOff;
//		전원 on / off 를 확인

	}

	@Override
	String getName() {
		return name;
	}
}
