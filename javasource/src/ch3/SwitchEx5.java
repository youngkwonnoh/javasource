package ch3;

import java.util.Scanner;

public class SwitchEx5 {
	public static void main(String[] args) {
		// 가위바위보 게임
		// 사용자가 내는 가위(1), 바위(2), 보(3) 입력받기
		// 컴퓨터가 내는 부분 : math.random 추출
		// 누가 이겼는지 출력
		
		Scanner sc = new Scanner(System.in);
		int com = (int)(Math.random() * 3 + 1);
		System.out.println("가위(1)바위(2)보(3) 선택");
		int user = sc.nextInt();
		System.out.println(com);
				
//		switch(user) {
//		case 1:
//			if(com == 1) {
//				System.out.println("비겼다");
//			} else if(com == 2) {
//				System.out.println("컴퓨터 승");
//			} else {
//				System.out.println("유저 승");
//			} break;
//		case 2:
//			if(com == 1) {
//				System.out.println("유저 승");
//			} else if(com == 2) {
//				System.out.println("비겼다");
//			} else {
//				System.out.println("컴퓨터 승");
//			} break;
//		case 3:
//			if(com == 1) {
//				System.out.println("컴퓨터 승");
//			} else if(com == 2) {
//				System.out.println("유저 승");
//			} else {
//				System.out.println("비겼다");
//			} break;
//		default:
//			System.out.println("오류");
//			break;
//		}
		
		switch(user - com) {
		case 2 : case -1 :
			System.out.println("컴퓨터 승");
			break;
		case 1 : case -2 :
			System.out.println("컴퓨터 승");
			break;
		default :
			System.out.println("비겼다");
			break;
		}
	}
}