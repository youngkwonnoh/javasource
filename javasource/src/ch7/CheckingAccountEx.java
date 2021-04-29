package ch7;

public class CheckingAccountEx {
	
	public static void main(String[] args) {
		CheckingAccount obj = new CheckingAccount("111-11", "홍길동", 1000000, "555-666");
	
		// 예금하다
		obj.deposit(100000);
		// 잔액 확인
		System.out.println("잔액 확인 : " + obj.getBalance());
		// 잘못된 체크카드 사용 : 카드번호, 계좌
		obj.pay("444-333", 100000);

		// 체크카드
		System.out.println("잔액 : " + obj.pay("555-666", 20000));
		
		
	}
}
