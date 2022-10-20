package assignmentTest04;

public class TalkableTest {
	// 출력 값 
	// 안녕하세요!
	// Hello!
	static void speak(Talkable x) {
		x.talk();
	}
	
	
	
	public static void main(String[] args) {
		speak(new Korean());
		speak(new American());
	}

}
