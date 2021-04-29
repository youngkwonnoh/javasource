package ch5;

public class AccountEx {
	public static void main(String[] args) {
		// 속성 - 계좌번호(123-45-67890), 이름(홍길동), 잔액(1,000,000)
		Account account = new Account("123-45-67890", "홍길동", 100000);
		
		account.deposit(5000);
		System.out.println("잔액 : " + account.money);
		
		// 출금한다.
		// System.out.println("잔액 : " + account.withdraw(10000));
		// account.withdraw(100000);
		// System.out.println("잔액 : " + account.money);
		
		int money = account.withdraw(10000);
		System.out.println("잔액 : " + money);
		
	}

}
