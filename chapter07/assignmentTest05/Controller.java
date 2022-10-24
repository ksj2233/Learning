package assignmentTest05;

public abstract class Controller {

	boolean power;

	abstract String getName();

	void show() {
		if (power == false) {
			System.out.println(getName() + "가 꺼졌습니다.");
		} else {
			System.out.println(getName() + "가 켜졌습니다.");
		}
	}

}
