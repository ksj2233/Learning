package assignmentTest05;

public class ControllerTest {

	public static void main(String[] args) {
		Controller[] c = { new TV(false), new Radio(true) };

		for (Controller controller : c)
			controller.show();
		// show() 메서드를 실행 하여
		// TV가 꺼졌습니다.
		// 라디오가 켜졌습니다. 를 출력한다.
	}
}
