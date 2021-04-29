package ch4;

public class ArrayEx1 {
	public static void main(String[] args) {
		// 100명의 점수를 변수에 담아서 처리
		
		// 배열 선언
		int[] score;
		String name[];
		
		// 배열 생성
		score = new int[5];
		name = new String[5];
		
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
		
		// 배열 사용 : int의 기본값 : 0
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		
		// 배열 사용 : String의 기본값 : null
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		System.out.println(name[4]);
		
	}

}
