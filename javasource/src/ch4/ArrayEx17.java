package ch4;

import java.util.Scanner;

public class ArrayEx17 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;

		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-----------------------------------------------------");
			System.out.print("선택 : ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo==1) {
				// 사용자 입력값에 따라 배열 생성
				studentNum = sc.nextInt();
				scores = new int[studentNum];
				System.out.printf("학생 수 : %d\n", scores.length);
			} else if(selectNo==2) {
				// 생성된 배열에 초기화
				for(int i=0; i<scores.length; i++) {
					System.out.println("점수 입력 : ");
					scores[i] = sc.nextInt();
				}
			} else if(selectNo==3) {
				// 학생 점수 확인
				for(int i=0; i<scores.length; i++) {
					System.out.printf("[%d] 점수 : %d\n", (i+1), scores[i]);
				}
			} else if(selectNo==4) {
				// 최대값, 평균 구하기
				int max = scores[0];
				int sum = scores[0];
				for(int i=0; i<scores.length; i++) {
					sum += scores[i];
					if(max < scores[i]) {
						max = scores[i];
					}
				}
				System.out.printf("최고 점수 : %d\n", max);
				System.out.printf("평균 점수 : %d\n", sum/scores.length);
				

			} else if(selectNo==5) {
				run = false;
			}
			
		}
		System.out.println("프로그램 종료");
		
	}

}
