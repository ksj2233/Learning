package sec03;

import java.time.Duration;
import java.time.LocalTime;

public class LocalTimeDemo2 {

	public static void main(String[] args) {
		// PC방의 이용 시작 시각
		LocalTime start = LocalTime.of(13, 25, 30);
		System.out.println("PC방 이용 시작 시간 : " + start);

		// PC방의 이용 종료 시각
		LocalTime end = LocalTime.of(17, 20, 38);
		System.out.println("PC방 이용 종료 시간 : ");

		// PC방 이용 시간 계산
		Duration between = Duration.between(start, end);
		System.out.println("PC방 이용 시간 : " + between);

	}

}
