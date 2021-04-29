package ch3;

import java.io.IOException;

public class WhileEx5 {
	public static void main(String[] args) throws Throwable {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		// while문의 조건이 true가 되면 무한반복이 되므로
		// false로 바꿔주는 명령문을 넣어주어야 한다.
		while(run) {
			if(keyCode != 13 && keyCode != 10) {
				System.out.println("=========================");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("=========================");
				System.out.println("선택 : ");
			}
			keyCode = System.in.read();
			
			if(keyCode==49) {
				speed++;
				System.out.println("현재속도 : " + speed);
			} else if(keyCode==50) {
				speed--;
				System.out.println("현재속도 : " + speed);
			} else if(keyCode==51) {
				run = false;
			}
			
		}
		System.out.println("시스템 종료");
	}

}
