package assignmentTest05;

public class TV extends Controller{

	String name;
	
	public TV(boolean power){
		if (power == true) {
			name = "TV가 켜졌습니다."; 
		}
		else
			name = "TV가 꺼졌습니다.";
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
