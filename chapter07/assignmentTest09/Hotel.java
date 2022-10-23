package assignmentTest09;

public class Hotel {

	class Room{
		String[] str = new String[10];
		// 방번호
		
	}
	
	Room r =new Room();
	
	void add(int num,String name){
		r.str[num-1] = name;
		
	}
	
	void show() {
		for (int i = 0 ; i < r.str.length ; i++) {
			if (r.str[i] == null)
				continue;
			else
				System.out.printf("%d번 방을 %s가 예약했습니다.\n", i+1,r.str[i]);
			
			
			
		}
			
	}
	
}
