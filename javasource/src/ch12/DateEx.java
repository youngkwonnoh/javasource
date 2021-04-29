package ch12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		
		// 분단위가 있으므로 월은 대문자, 다른 것들은 소문자를 쓴다.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
		System.out.println(sdf.format(date));
		
		
	}

}
