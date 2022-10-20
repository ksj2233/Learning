package assignmentTest04;

public class Korean implements Talkable {

	String s;
	
	Korean(){
		s = "안녕하세요!";
	}
	
	
	@Override
	public void talk() {
		System.out.println(s);
	}

}
