package ch3;

public class ForEx13 {
	public static void main(String[] args) {
		// 구구단 2 ~ 9단 출력
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%dx%d=%2d\t", i, j, i * j);
				// %2d, %3d등 출력물의 자리값을 정해줄 수 있다.
				// 줄에 맞춰 보기 쉽게 정렬 가능.
			} 
			System.out.println();
		}
	}

}
