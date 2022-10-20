package sec06;

// 기명 지역 클래스
public class LocalDemo {

	public static void main(String[] args) {
		class Eagle extends Bird { // ----> 지역 클래스
			public void move() {
				System.out.println("독수리가 난다~~~.");
			}
		}

		Bird e = new Eagle(); // ----> e 는 main()메서드의 지역 변수이다.
		e.move();
	}

}
