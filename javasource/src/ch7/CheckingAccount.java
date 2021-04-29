package ch7;

public class CheckingAccount extends Account {
	// 체크카드 번호
	private String cardNo;
	
	public CheckingAccount(String ano, String owner, int balance, String cardNo) {
		super(ano, owner, balance);
		this.cardNo = cardNo;
	}


	// 직불카드 사용액을 지불한다.
	// 직불카드 번호와 사용액을 매개변수로 받아서 은행잔고와
	// 비교한 후 인출한다.(단, 카드 번호가 일치한지 확인)
	public int pay(String cardNo, int amount) {
		if(!this.cardNo.equals(cardNo) || super.getBalance() < amount) {
			System.out.println("지불 불가");
			return 0;
		}
		// 사용액을 지불
		super.setBalance(super.getBalance() - amount);
		return withdraw(amount);
	}
	
}
