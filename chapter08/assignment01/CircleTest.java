package assignment01;

public class CircleTest {
//	<문제>
//	반지름이 같은 Circle 객체를 모두 동일한 종류로 취급하는 Circle 클래스를 작성하고 다음 프로그램으로 검증하라.
	
	public static void main(String[] args) {
		Circle c1 = new Circle(3);
		Circle c2 = new Circle(3);
		
		if (c1.equals(c2))
			System.out.println("c1과 c2는 같다.");
		else
			System.out.println("c1과 c2는 다르다.");
		
	}

}
