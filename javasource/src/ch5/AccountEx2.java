package ch5;

public class AccountEx2 {
	public static void main(String[] args) {
		Account account = new Account("123-45-6789", "홍길동", 100000);
		// 입금
		account.deposit(50000);
		accountPrint(account);
		// 출금
		account.withdraw(50000);
		accountPrint(account);
		
		Account account2 = new Account("123-65-9874", "맹구", 200000);
		// 입금
		account2.deposit(50000);
		accountPrint(account2);
		// 출금
		account2.withdraw(50000);
		accountPrint(account2);
	}
	
	static void accountPrint(Account obj) { // 잔액확인
		// Account는 각각의 배열 주소들을 가리킨다.
		System.out.println(obj.name + "잔액확인 : " + obj.money);
	}

}
