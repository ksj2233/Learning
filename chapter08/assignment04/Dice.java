package assignment04;

public class Dice {
//	<문제>
//	주사위 게임용 Dice 클래스를 작성하라.
//	주사위를 굴리면 1~6 사이의 정수만 임의로 반환하므로 Math 클래스의 random()
//	메서드를 사용해 숫자를 임의로 반환하면 된다.
	
	int num;
	
	Dice(){
		num = (int)Math.random()*6 + 1;
	}
	public int roll() {
		return num;
	}
	
}
