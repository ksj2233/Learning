package challengeAssignment;

import java.time.LocalDate;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car("그랜저");
		Car youCar = new Car("그랜저");

		LocalDate model_Date = LocalDate.of(2017, 06, 07);

		// 객체 2개를 비교하는 코드
		if (myCar.equals(youCar) == true) {
			System.out.printf("자동차 모델이 둘다[%s]로 동일하다.\n", myCar.toString());
		} else {
			System.out.printf("내 자동차는 [%s], 너 자동차는 [%s]로 모델이 다르다.\n", myCar.toString(), youCar.toString());
		}

	}

}
