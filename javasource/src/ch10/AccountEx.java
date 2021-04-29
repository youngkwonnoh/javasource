package ch10;

public class AccountEx {
	public static void main(String[] args) {
		// Account account = new Account();
		
		Account account = new CheckingAccount();
		CheckingAccount checking = new CheckingAccount();
		
		// 익명구현
		Account account2 = new Account() {
			
			@Override
			public void test() {
				System.out.println("test");				
			}
			
			@Override
			public void print() {
				System.out.println("print");
			}
		};
		
		account2.test();
		account2.print();
	}

}
