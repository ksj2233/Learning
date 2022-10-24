package sec03;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class LocalDateTimeDemo2 {

	public static void main(String[] args) {

		// 현재시각 2022.4.25 10:22
		LocalDateTime today = LocalDateTime.of(2022, 4, 25, 10, 22);
		System.out.println(today);

		// 항공1편의 출발 시간 2022.6.23 11:30
		LocalDateTime flight1 = LocalDateTime.of(2022, 6, 23, 11, 30);
		System.out.println(flight1);

		// 항공2편의 출발 시간 2022.6.22 17:30
		LocalDateTime flight2 = LocalDateTime.of(2022, 6, 22, 17, 30);
		System.out.println(flight2);

		// 빠른 항공편을 선택하는 과정
		LocalDateTime myFlight;
		if (flight1.isBefore(flight2)) {
			myFlight = flight1;
		} else {
			myFlight = flight2;

		}

		// 빠른 항공편의 비행 탑승시간까지 남은 날짜 계산
		Period day = Period.between(today.toLocalDate(), myFlight.toLocalDate());

		// 빠른 항공편의 비행 탑승까지 남은 시간 계산
		Duration time = Duration.between(today.toLocalTime(), myFlight.toLocalTime());

		// 비행 탑승까지 남은
		System.out.println(day);
		System.out.println(time);
		System.out.println();
		System.out.println(day.getMonths() + "월 " + day.getDays() + "일");
		System.out.println(time.toHours() + "시간 ");
	}

}
