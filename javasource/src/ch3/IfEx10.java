package ch3;

import java.util.Scanner;

public class IfEx10 {
	public static void main(String[] args) {
		// 사용자에게 년도를 입력받아 그 년도가 윤년인지 평년인지 출력
		// 윤년 : 해당년도를 4로 나눈 나머지가 0과 같다
		// 100으로 나눈 나머지가 0이 아니거나 400으로 나눈 나머지가 0이면 윤년
		
		Scanner sc = new Scanner(System.in);
		System.out.println("연도 입력 : ");
		
		int year = sc.nextInt();
		
//		if(year % 4 == 0) {
//			if(year % 100 != 0) {
//				System.out.println("윤년입니다.");
//			} else if(year % 400 == 0) {
//				System.out.println("윤년입니다.");
//			}
//		} else {
//			System.out.println("윤년이 아닙니다.");	
//		}
		
		if(year %4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}
		
	}
}