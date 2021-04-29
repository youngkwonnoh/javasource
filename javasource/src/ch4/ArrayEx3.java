package ch4;

public class ArrayEx3 {
	public static void main(String[] args) {
		// 배열 선언, 생성, 초기화
		int score[] = {97, 88, 67, 85, 75};
		String name[] = {"park", "Kim", "Choi", "Lee", "Kim"};

		// 사용
//		System.out.println("score.length " + score.length);
//		for(int i=0; i<score.length; i++) {
//			System.out.println(name[i] + "\t");
//			System.out.println(score[i]);
//		}
		
		// 향상된 for문
		// 타입 변수명:배열명
		for(int s:score) {
			System.out.println(s);
		}
		for(String str:name)
			System.out.println(str);
		
	}

}
