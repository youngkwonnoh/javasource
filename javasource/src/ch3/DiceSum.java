package ch3;

public class DiceSum {
	public static void main(String[] args) {
		// 주사위 두 개의 합을 구하기
		// while, Math.random()을 이용한다
		// (값1, 값2) 형태로 출력.
		// 두 개 주사위의 합이 5가 아니면 계속 주사위를 던지고
		// 합이 5이면 실행을 멈추는 코드 작성.
		
		int num1 = 0, num2 = 0;
		
		while(true) {
			num1 = (int)(Math.random()*6) + 1;
			num2 = (int)(Math.random()*6) + 1;
			
			System.out.printf("(%d, %d)\n", num1, num2);
			
			if(num1 + num2 == 5) {
				break;
			}
		}
		
	}

}

//package ch3;
//
//public class DiceSum {
//	public static void main(String[] args) {
//		
//		while(true) {
//			int dice1 = (int)(Math.random()*6) + 1;
//			int dice2 = (int)(Math.random()*6) + 1;
//			
//			System.out.printf("(%d, %d)\n", dice1, dice2);
//			
//			if(dice1 + dice2 == 5) {
//				break;
//			}
//		}
//		
//	}
//
//}
