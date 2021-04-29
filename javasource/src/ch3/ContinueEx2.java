package ch3;

// continue : 반복문에서 사용, 블록 내부에서 continue 문이 실행되면
// 반복문의 조건식으로 이동하게 함
public class ContinueEx2 {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
