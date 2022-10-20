package assignmentTest05;
// 출력 값

// TV가 꺼졌습니다.
// 라디오가 켜졌습니다.

public class ControllerTest {

	public static void main(String[] args) {
		Controller[] c = { new TV(false), new Radio(true) };
	
		for (Controller controller : c)
			controller.show();
		
		}
	}




  