package sec06;

//익명 지역 클래스
public class Anonymous2Demo {
	public static void main(String[] args) {
		Bird b = new Bird() { // ----> b 는 main()메서드의 지역 변수이다.
			public void move() {
				System.out.println("독수리가 난다~~~.");
			}

		};
		b.move();
	}

}
