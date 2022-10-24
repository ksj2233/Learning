package sec03;

import java.time.LocalDate;
import java.time.Period;

public class LocalDatePeriodDemo {

	public static void main(String[] args) {
		// 오늘
		LocalDate today = LocalDate.now();
		System.out.println("오늘 : " + today);

		// 올해의 크리스마스
		LocalDate xmas = LocalDate.of(today.getYear(), 12, 25);
		System.out.println("올해의 크리스마스 : " + xmas);

		// 크리스마스까지의 날짜
		Period left = Period.between(today, xmas);
		System.out.println("크리스마스까지 앞으로 : " + left);
		System.out.println("크리스마스까지 앞으로 : " + left.getMonths() + "월 " + left.getDays() + "일");

		// 올해의 수는 날짜 11/17
		LocalDate exam = LocalDate.of(today.getYear(), 11, 17);
		System.out.println("올해의 수능 날짜 : " + exam);

		// 수능까지 며칠
		left = Period.between(today, exam);
		System.out.println("수능 앞으로 : " + left.getDays() + "일");

	}

}
