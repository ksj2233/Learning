package assignment03;

import java.util.Calendar;

public class CalendarTest {
//	Calendar 클래스를 사용해 연월일을 비롯한 날짜 정보를 출력하려고 한다. 다음 프로그램을 완성하라.
	
//	<출력>
//	2017년 6월 15일
//	목요일 오후
//	3시 33분 40초
	
	
	public static void main(String[] args) {
		String[] weekName = {"일", "월","화","수","목","금","토"};
		String[] noonName = {"오전","오후"};
		Calendar c = Calendar.getInstance();
		
		
		c.set(2017, 5, 15);
		c.set(Calendar.HOUR, 3);
		c.set(Calendar.MINUTE, 33);
		c.set(Calendar.SECOND, 40);
		c.set(Calendar.AM_PM, 1);
		
		int year = c.get(Calendar.YEAR);
		int month = (c.get(Calendar.MONTH) + 1);
		int day = c.get(Calendar.DAY_OF_MONTH);
		String week;
		week = weekName[c.get(Calendar.DAY_OF_WEEK) - 1];
		String noon;
		noon = noonName[c.get(Calendar.AM_PM)];
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		System.out.println(year+ "년 " + month +"월 "+ day + "일");
		System.out.println(week + "요일 " + noon);
		System.out.print(hour + "시 " + minute + "분 " + second + "초");
	}

}
