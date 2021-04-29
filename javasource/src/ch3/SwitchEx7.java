package ch3;

import java.util.Scanner;

public class SwitchEx7 {
	public static void main(String[] args) {
		// 사용자에게 점수 입력받기
		// 해당 점수에 따라 A ~ F등급 출력
		// 90점 이상 A, 80점 이상 B, 70점 이상 C, 나머지 F
		// 등급만 출력하니 점수 / 10을 통해 확인
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력");
		int score = sc.nextInt();
		
		int grade = (int)(score / 10);
		
		switch(grade) {
		case 10 : case 9 :
			System.out.println("A");
			break;
		case 8 :
			System.out.println("B");
			break;
		case 7 :
			System.out.println("C");
			break;
		default :
			System.out.println("F");
			break;

//		switch(score / 10) {
//		case 10 : case 9 :
//			System.out.println("A");
//			break;
//		case 8 :
//			System.out.println("B");
//			break;
//		case 7 :
//			System.out.println("C");
//			break;
//		default :
//			System.out.println("F");
//			break;
		}
		
	}
}