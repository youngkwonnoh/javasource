package ch5;

public class AccountEx3 {
	public static void main(String[] args) {
		// Account 배열 객체
		
		Account accArr[] = new Account[10];
		
		for(int i=0; i<5; i++) {
			
			accArr[i] = new Account();
			
		}
		print(accArr);
	}		
		
	static void print(Account accArr[]) {
		System.out.println("-----------------------------");
		// for(배열타입 변수명:배열명)
		for(Account account:accArr) {
			System.out.print("계좌번호 : " + account.AccNo);
			System.out.print(" 이 름 : " + account.name);
			System.out.print(" 잔 액: " + account.money);
			System.out.println();
		}
		
	}
	
}
