package ch3;

public class IfEx5 {
	public static void main(String[] args) {
		// 점수에 따라서 등급 구현
		// 100 ~ 90: A, 89 ~ 80 : B, 79 ~ 70 : C, 69 ~ 60 : D, 나머지 F
		// if ~ else if ~ else
		
		int score = 75;
		char grade = ' '; // 초기화
		
		if(score >= 90) {
			System.out.println("점수가 100 ~ 90");
			grade = 'A';
		} else if(score >= 80) {
			System.out.println("점수가 89 ~ 80");
			grade = 'B';
		} else if(score >= 70) {
			System.out.println("점수가 79 ~ 70");
			grade = 'C';
		} else if(score >= 50) {
			System.out.println("점수가 69 ~ 60");
			grade = 'D';
		} else {
			System.out.println("점수가 60 미만");
			grade = 'F';
		}
		System.out.println("등급은 " + grade + " 입니다.");
		System.out.printf("등급은 %c입니다.", grade);
		// char : %c, int : %d, float, double : %f, String : %s
	}

}