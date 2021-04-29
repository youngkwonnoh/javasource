package ch3;

// switch : if ~ else if ~ else 구조를 간결하게 만들어줌
// 변수 값에 의해 실행문 결정

public class SwitchEx1 {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;
		
		switch (num) {
		case 1:
			System.out.println("1번");
			break;
		case 2:
			System.out.println("2번");
			break;
		case 3:
			System.out.println("3번");
			break;
		case 4:
			System.out.println("4번");
			break;
		case 5:
			System.out.println("5번");
			break;
		default:
			System.out.println("6번");
			break;
			
		}
	}

}