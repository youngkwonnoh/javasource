package ch3;

public class BreakEx2 {
	public static void main(String[] args) {
		int num = 0;
		while(true) {
			num = (int)(Math.random()*6) + 1;
			System.out.println(num);
			if(num==6) {
				break;
			}
		}
		System.out.println("종료");
	}

}
