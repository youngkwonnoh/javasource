package ch2;

// 논리 부정 연산 : ! => boolean 타입만 사용
public class DenyLogicOperatorEx1 {
	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);

	}

}
