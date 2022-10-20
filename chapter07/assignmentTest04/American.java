package assignmentTest04;

public class American implements Talkable{

	String s;
	
	American(){
		s = "Hello!";
	}
	
	@Override
	public void talk() {
		System.out.println(s);
	}

}
