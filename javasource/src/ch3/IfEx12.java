package ch3;

import java.util.Scanner;

public class IfEx12 {
	public static void main(String[] args) {
		// 사용자로부터 키, 몸무게를 입력받고 사용자의 키에 알맞는 표준체중 계산.
		// 표준체중보다 많으면 "과체중", 적으면 "저체중", 동일하면 "표준"이라는 결과 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키를 입력");
		int height = sc.nextInt();
		System.out.println("몸무게를 입력");
		int weight = sc.nextInt();
		
		int standard = (int)((height - 100) * 0.9);
		
		if(weight > standard) {
			System.out.println("과체중");
		} else if(weight == standard) {
			System.out.println("표준");
		} else {
			System.out.println("저체중");	
		}
	}

}