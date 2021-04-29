package ch11;

public class AccountEx {
	public static void main(String[] args) {
		
		Account account = new Account();
		
		// 예금
		account.depoosit(100000);
		// 출금
		try {
			account.withdraw(300000);
		} catch (BalanceInsufficientException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
