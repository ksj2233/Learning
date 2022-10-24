package sec03;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo1 {

	public static void main(String[] args) {
		// 현재 서울의 날짜 시간
		ZonedDateTime here = ZonedDateTime.now();
		System.out.println(here);

		// 현재 파리의 날짜 시간
		ZonedDateTime paris = ZonedDateTime.of(here.toLocalDateTime(), ZoneId.of("Europe/Paris"));
		System.out.println(paris);

		// 시차
		Duration diff = Duration.between(here, paris);
		System.out.println(diff);
	}

}
