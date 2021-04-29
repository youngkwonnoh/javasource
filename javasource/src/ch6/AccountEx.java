package ch6;

public class AccountEx {
	public static void main(String[] args) {
		// Account2 객체 생성 - 기본 생성자로
		Account2 account = new Account2();
		
		// setBalance를 이용해 잔액 변경하기 => 10000
		// 현재 잔고 출력하기 : getBalance() 이용
		account.setBalance(10000);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		// setBalance를 이용해 잔액 변경하기 => -100으로
		// 현재 잔고 출력하기
		account.setBalance(-100);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		// setBalance를 이용해 잔액 변경하기 => 2000000
		// 현재 잔고 출력하기
		account.setBalance(2000000);
		System.out.println("현재 잔고 : " + account.getBalance());

		// setBalance를 이용해 잔액 변경하기 => 300000
		// 현재 잔고 출력하기
		account.setBalance(300000);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		
		
	}

}
