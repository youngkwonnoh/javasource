package ch4;

public class ArrayEx2 {
	public static void main(String[] args) {
		// 배열 선언 및 생성
		int score[] = new int[5];
		String name[] = new String[5];
		
		// 초기화
		score[0] = 97;
		score[1] = 88;
		score[2] = 67;
		score[3] = 85;
		score[4] = 75;    
		
		name[0] = "park";
		name[1] = "Kim";
		name[2] = "Choi";
		name[3] = "Lee";
		name[4] = "Kim";
		
		// 배열 사용
		// length는 배열의 공간을 나타낸다.
		System.out.println("score.length " + score.length);
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
		}
		
	}

}
