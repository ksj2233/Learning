package sec03;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo2 {

	public static void main(String[] args) {
		// 한국 출발 현지 시간 2022년 12월 9일 13시 20분
		ZonedDateTime seoul = ZonedDateTime.of(LocalDateTime.of(2022, 12, 9, 13, 20), null);
		System.out.println(seoul);

		// 파리 도착 시간 2022년 12월 9일 17시 15분

		// 비행에 걸린 시간은?

	}

}
