package ch4;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class EnumEx {

	public static void main(String[] args) {
		Week today = null;
		
		// 오늘 날짜
		LocalDate now = LocalDate.now();
		// System.out.println(now);

		// 오늘에 해당하는 숫자 확인
		DayOfWeek week = now.getDayOfWeek();
		// System.out.println(week.getValue()); // 1 : 월요일 ~ 7 : 일요일
		
		switch(week.getValue()) {
		case 1 :
			today = Week.MONDAY;
			break;
		case 2 :
			today = Week.MONDAY;
			break;
		case 3 :
			today = Week.TUESDAY;
			break;
		case 4 :
			today = Week.WEDNEDAY;
			break;
		case 5 :
			today = Week.THURSDAY;
			break;
		case 6 :
			today = Week.FRIDAY;
			break;
		default :
			today = Week.SUNDAY;
			break;
		}
		System.out.println("오늘 요일 : " + today);
		if(today==Week.SUNDAY) { 
			System.out.println("일요일에는 쉽니다.");
		} else {
			System.out.println("열심히 자바 공부를 합니다.");
		}
	}

}
