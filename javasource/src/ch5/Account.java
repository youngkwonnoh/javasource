package ch5;

public class Account {
	// 은행 계좌 클래스
	// 속성 - 계좌번호(123-45-67890), 이름(홍길동), 잔액(1,000,000)
	
	String AccNo;
	String name;
	int money;
	
	// 생성자 - 기본 생성자, 인자를 받는 생성자(속성 모두를 초기화할 수 있는)
	public Account() {}
	public Account(String AccNo, String name, int money){
		this.AccNo = AccNo;
		this.name = name;
		this.money = money;
	}
	
	
	// 기능(동작) - 입금한다, 출금한다.
	// 입금(deposit) - 정수 매개변수 하나(입금액), 현재잔액 += 입금액, 리턴은 없음
	void deposit(int bal) {
		money += bal;
	}
	// 출금(withdraw) - 정수 매개변수 하나(출금액), 현재잔액 -= 출금액, 현재 잔액 리턴
	int withdraw(int bal) {
		// return money -= bal;
		
		money -= bal;
		return money;
		
		
	}
	
	
	
}
