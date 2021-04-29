package ch6;

import java.util.Scanner;

public class BankApplication {
	// 속성(인스턴스 필드, 프로퍼티..)
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-------------------------------------------------");
			System.out.println("선택 > ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			switch(selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run = false;
				break;
			}
			
		}
		
	}
	
	// 출금하기
	private static void withdraw() {
		System.out.println("출금할 계좌번호 입력");
		String ano = sc.nextLine();
		Account acc = findAccount(ano);
		
		if(acc != null) {
			// 출금액 입력받기
			System.out.println("출금액 : ");
			int balance = Integer.parseInt(sc.nextLine());
			// 잔액 = 잔액 - 출금액
			if(acc.getBalance() < balance) {
				System.out.println("출금 가능액이 부족합니다.");
			} else {
				acc.setBalance(acc.getBalance() - balance);
			}
		} else {
			System.out.println("계좌번호를 확인해 주세요");
		}
	}
	
	
	// 예금하기
	private static void deposit() {
		// 사용자에게 계좌번호 입력 받기
		System.out.println("입금할 계좌번호 입력");
		String ano = sc.nextLine();
		Account acc = findAccount(ano);
		
		if(acc != null) {
			// 예금액 입력받기
			System.out.println("예금액 : ");
			int balance = Integer.parseInt(sc.nextLine());
			// 잔액 = 잔액 + 예금액
			acc.setBalance(acc.getBalance() + balance);
		} else {
			System.out.println("계좌번호를 확인해 주세요");
		}
		
	}
	
	// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		// ano와 일치하는 Account 가 배열의 어디에 존재하는지 확인하고
		// return
		Account findAcc = null;
		for(Account acc:accountArray) {
			if(acc != null) {
				if(acc.getAno().equals(ano)) {
					findAcc = acc;
				}
			}
		}
		return findAcc;
	}
	
	
	static void accountList() {
		// accountArray 계좌 목록 보기
		System.out.println("-------------------------");
		System.out.println("계좌목록");
		System.out.println("-------------------------");
		for(Account arrArr:accountArray) {
				if(arrArr != null) {
					System.out.printf("계좌 번호 : %s\n", arrArr.getAno());
					System.out.printf("계좌주 : %s\n", arrArr.getOwner());
					System.out.printf("잔액 : %d\n", arrArr.getBalance());
					System.out.println();
				} 
		}
		
		
	}
	
	
	static void createAccount() {
		// 계좌번호, 계좌주, 잔액 입력 받기
		System.out.println("계좌번호 입력 : ");
		String ano = sc.nextLine();
		System.out.println("계좌주 입력 : ");
		String owner = sc.nextLine();
		System.out.println("잔액 입력 : ");
		int balance = Integer.parseInt(sc.nextLine());
		
		// Account 객체 생성
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, balance);
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
		}
		
		// accountArray에 생성된 객체 담기
	
	}
}
