package assignmentTest05;

public class Radio extends Controller {

	String name;
	
	public Radio(boolean power){
		if (power == true) {
			name = "라디오가 켜졌습니다."; 
		}
		else
			name = "라디오가 꺼졌습니다.";
	}

	@Override
	String getName() {
		return name;
	}
	void show() {
		System.out.println(name);
		
		// 켜짐 꺼짐을 말해줘야 함
	}
}

