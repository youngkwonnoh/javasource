package ch2;

public class ArithmeticOperEx2 {
	public static void main(String[] args) {
		char c1 = 'A' + 1; // 65 + 1 => B
		char c2 = 'A';
		// char c3 = c2 + 1;
		// char는 2byte, int는 4byte 이므로 c3은 int가 되어야 한다.
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		// System.out.println("c3 : " + c3);
	}

}
