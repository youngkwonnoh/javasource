package ch5;

import java.util.Scanner;

public class SubscriberInfoEx {
	public static void main(String[] args) {
		//이름(홍길동), 아이디(hong123), 패스워드(HON123@@#@), 전화번호(01012345678), 주소(서울시 구로구)
		SubscriberInfo person1 = new SubscriberInfo();
		SubscriberInfo person2 = new SubscriberInfo("김가나", "kim", "kim123");
		SubscriberInfo person3 = new SubscriberInfo("홍길동", "hong", "hong123", "01012345678", "인천");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀먼호를 입력하세요 : ");
		String str = sc.nextLine();
		person2.changePwd(str);
		System.out.println("변경 된 비밀번호 : " + person2.password);
		
		
		person3.changePwd("asdf4567");
		person3.setTel("01023567894");
		person3.setAddr("서울");
		
		System.out.println("번경된 전화번호 : " + person3.tel);
		System.out.println("번경된 전화번호 : " + person3.addr);
		
	}
	
}
