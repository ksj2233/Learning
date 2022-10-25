package sec03;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo2 {

	public static void main(String[] args) {
		// 한국 출발 현지 시간 2022년 12월 9일 13시 20분
		ZonedDateTime seoul = ZonedDateTime.of(LocalDateTime.of(2022, 12, 9, 13, 20), ZoneId.of("Asia/Seoul"));
		System.out.println("출발시간 : " + seoul);

		// 파리 도착 시간 2022년 12월 9일 17시 15분
		ZonedDateTime paris = ZonedDateTime.of(LocalDateTime.of(2022, 12, 9, 17, 15), ZoneId.of("Europe/Paris"));
		System.out.println("도착시간 : " + paris);

		// 비행에 걸린 시간은?
		Duration diff = Duration.between(seoul, paris);
		System.out.println(diff);

	}

}
