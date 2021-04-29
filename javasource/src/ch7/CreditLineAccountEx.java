package ch7;

public class CreditLineAccountEx {
	public static void main(String[] args) {

		CreditLineAccount obj = new CreditLineAccount("222-11", "홍길동" , 200000, 10000000);
		
		System.out.println("잔액 : " + obj.withdraw(500000));
		
		
	}

}
