package ch3;

import java.util.Scanner;

public class BankEx1 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int money = 0;
		
		while(run) {
			System.out.println("==================================");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("==================================");
			System.out.print("선택 : ");
			
			// 1번 : 예금액 입력 받기
			// 잔액 = 잔액 + 예금
			
			// 2번 : 출금액 입력받기
			// 잔액 = 잔액 - 출금
			
			// 3번 : 현재 잔액 출력
			
			// 4번 : 프로그램 종료
			
			num = sc.nextInt();
			
			if(num==1) {
				System.out.println("금액을 입력하세요");
				money = sc.nextInt();
				balance += money;
				System.out.println("입금 완료");
			} else if(num==2) {
				System.out.println("금액을 입력하세요");
				money = sc.nextInt();
				if(balance == 0) {
					System.out.println("출금 가능 금액이 없습니다.");
					continue;
				} else if(money > balance) {
					System.out.println("잔액이 부족합니다.");
					System.out.println("현재 잔액 : " + balance + "원");
					continue;
				}
				balance -= money;
				System.out.println("출금 완료");
			} else if(num==3) {
				System.out.println("현재 잔액입니다.");
				System.out.println(balance + "원");
			} else if(num==4) {
				System.out.println("프로그램을 종료합니다.");
				run = false;
			} else {
				System.out.println("값을 다시 입력하세요");
				continue;
			}
			
		}
		System.out.println("종료");
	}

}


//package ch3;
//
//import java.util.Scanner;
//
//public class BankEx1 {
//	public static void main(String[] args) {
//		boolean run = true;
//		int balance = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		int menu = 0;
//		
//		while(run) {
//			System.out.println("==================================");
//			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
//			System.out.println("==================================");
//			System.out.print("선택 : ");
//
//			menu = sc.nextInt();
//			switch(menu) {
//			case 1:
//				System.out.println("예금액 >>");
//				balance += sc.nextInt();
//				break;
//			case 2:
//				System.out.println("출금액 >>");
//				balance -= sc.nextInt();
//				break;
//			case 3:
//				System.out.println("잔액 >> " + balance);
//				break;
//			case 4:
//				run = false;
//				break;
//			}
//			
//		}
//		System.out.println("종료");
//	}
//
//}
