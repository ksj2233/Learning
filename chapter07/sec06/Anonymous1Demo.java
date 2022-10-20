package sec06;

// 익명 멤버 클래스
public class Anonymous1Demo {
	Bird e = new Bird() { // ----> Anonymous1Demo 클래스의 맴버 필드이다.
		public void move() { // ----> Bird 클래스의 move()를 오버라이딩 한 메서드.
			System.out.println("독수리가 난다~~~.");
		}

		public void sound() { // ----> Bird 타입에 없는 메서드이므로 Bird타입의 객체로는 접근x
			System.out.println("휘익~~~.");
		}
	}; // ----> ; 으로 마무리한다!!!!!

	public static void main(String[] args) {
		Anonymous1Demo a = new Anonymous1Demo();
		a.e.move(); // ----> 다형성으로 오버라이딩한 메서드를 호출한다.
		// a.e.sound(); // ---> a.e 객체가 Bird 타입이므로 sound()메서드는 호출할수 없다.
	}

}
