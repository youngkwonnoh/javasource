package ch4;

public class ArrayEx4 {
	public static void main(String[] args) {
		// 선언, 생성
		int score[] =  new int[5];
		
		int total = 0;
		
		for(int i=0; i<score.length; i++) {
			score[i] = i * 10; // 초기화
			total += score[i]; // 배열 사용
			System.out.println(score[i]);
		}
				
		System.out.println("score 합 : " + total);
		System.out.println("score 평균 : " + (total / score.length));
		
	}

}
