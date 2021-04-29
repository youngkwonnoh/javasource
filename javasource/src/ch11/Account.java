package ch11;

public class Account {
	private long balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public long getBalance() {
		return balance;
	}
	
	public void depoosit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			// throw new Exception("잔고부족 : " + (money - balance) + " 부족함");
			throw new BalanceInsufficientException("잔고부족 : " + (money - balance) + " 부족함");
		}
		balance -= money;
	}
}
