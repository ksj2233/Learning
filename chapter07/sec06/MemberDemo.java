package sec06;

// 기명 멤버 클래스
public class MemberDemo {
	class Eagle extends Bird { // ----> 맴버클래스
		public void move() { // ----> Bird 클래스의 move()를 오버라이딩 한 메서드.
			System.out.println("독수리가 난다~~~.");
		}

		public void sound() { // ----> Eagle 클래스에 추가한 메서드이다.
			System.out.println("휘익~~~.");
		}
	}

	Eagle e = new Eagle(); // ----> MemberDemo 클래스의 맴버 필드이다.

	public static void main(String[] args) {
		MemberDemo m = new MemberDemo();
		m.e.move(); // ----> MemberDemo 클래스의 객체인 m 의 맴버필드 e 객체의 move() 호출
		m.e.sound(); // ---> MemberDemo 클래스의 객체인 m 의 맴버필드 e 객체의 sound()호출
	}

}
