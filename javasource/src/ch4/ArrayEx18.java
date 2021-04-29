package ch4;

import java.util.Scanner;

public class ArrayEx18 {
	public static void main(String[] args) {
		// 학생들의 점수를 받아서 최고 점수 및 평균 점수를 구하기
		Scanner sc = new Scanner(System.in);
		int scores[] = null;
		
		// 몇 명의 학생? 입력
		int num = sc.nextInt();
		scores = new int[num];
		
		for(int i=0; i<scores.length; i++) {
			System.out.println("점수입력 : ");
			scores[i] = sc.nextInt();
		}
		
		
		// 확인
		// System.out.println(scores.length);
		for(int score:scores) {
			System.out.println(score);
		}
		
	}
}
