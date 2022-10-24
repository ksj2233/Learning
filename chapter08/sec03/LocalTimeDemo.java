package sec03;

import java.time.LocalTime;

public class LocalTimeDemo {

	public static void main(String[] args) {

		// 현재시각
		LocalTime now = LocalTime.now();
		System.out.println("지금 시각 : " + now);

		// 2시간 10분 뒤
		LocalTime mt = now.plusHours(2);
		mt = mt.plusMinutes(10);

		// 미팅시각
		System.out.println("미팅 시각 : " + mt);

	}

}
