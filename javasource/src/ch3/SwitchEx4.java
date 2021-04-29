package ch3;

public class SwitchEx4 {
	public static void main(String[] args) {
		// 8 ~ 11 정수 추출
		int time = (int)(Math.random() * 4) + 8;
		System.out.println("[현재 시간 : " + time + "]");
		
		switch(time) {
		case 8:
			System.out.println("출근");
			break;
		case 9:
			System.out.println("회의 진행");
			break;
		case 10:
			System.out.println("업무 진행");
			break;
		default:
			System.out.println("외근");
			break;
		}
	}
}