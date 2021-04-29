package ch3;

public class ForEx11 {
	public static void main(String[] args) {
		// 1 ~ 10 사이의 숫자로
		// 4x + 5y = 60의 모든 해를 구해서 (x,y) 형태로 출력하기
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				int result = 60;
				if(4*i + 5*j == result) {
				System.out.printf("(%d, %d)\n", i, j);
				}
			}
		}
	}
}