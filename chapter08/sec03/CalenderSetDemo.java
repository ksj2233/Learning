package sec03;

import java.util.Calendar;

public class CalenderSetDemo {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2022, 9, 24);
		System.out.println(toString(c));
		c.set(Calendar.YEAR, 2021);
		c.set(Calendar.MONTH, 9);
		c.set(Calendar.DATE, 24);
		System.out.println(toString(c));
		c.set(Calendar.HOUR_OF_DAY, 10);
		c.set(Calendar.MINUTE, 20);
		c.set(Calendar.SECOND, 30);
		System.out.println(toString(c));
		c.add(Calendar.DATE, 5); // 현재 Calendar의 DATE 값에 +5 을 한다.
		System.out.println(toString(c));
		c.add(Calendar.DATE, 15); // 현재 Calendar의 DATE 값에 +15 을 한다.
		System.out.println(toString(c));
		c.add(Calendar.DATE, -15); // 현재 Calendar의 DATE 값에 -15 을 한다.
		System.out.println(toString(c));
		c.add(Calendar.MONTH, -3); // 3개월 전
		System.out.println(toString(c));
		c.roll(Calendar.DATE, 10); // 자기 필드영역 내에서만 값이 변한다.
		System.out.println(toString(c));
	}

	public static String toString(Calendar c) {
		String date = c.get(Calendar.YEAR) + "년 " + (c.get(Calendar.MONTH) + 1) + "월 " + c.get(Calendar.DATE) + "일";
		String time = c.get(Calendar.HOUR_OF_DAY) + "시 " + (c.get(Calendar.MINUTE) + 1) + "분 " + c.get(Calendar.SECOND)
				+ "초 ";
		return date + " " + time;
	}
}
