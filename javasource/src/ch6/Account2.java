package ch6;

public class Account2 {
	
	// setter와 getter를 작성하기
	// 0 <= balance <= 1000000 범위의 값만 가짐
	// 0과 1000000은 MIN_BALANCE와 MAX_BALANCE 상수를 선언해서 이용
	// setter의 매개값이 음수이거나 백만원을 초과하면 현재 balance 값을 유지
	
	private int balance;
	
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE)
			this.balance = balance;
	}
	
	
}













