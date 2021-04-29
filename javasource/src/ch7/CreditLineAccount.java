package ch7;

public class CreditLineAccount extends Account {
	private int creditLine; // 마이너스 한도 필드

	public CreditLineAccount(String ano, String owner, int balance, int creditLine) {
		super(ano, owner, balance);
		this.creditLine = creditLine;
	}
	
	public void setCreditLine(int creditLine) {
		this.creditLine = creditLine;
	}
	
	public int getCreditLine() {
		return creditLine;
	}
	
	// 출금한다 : 잔액 + 마이너스한도(천만원) - 출금액
	// 부모의 withdraw : 재 정의(=오버라이딩)
	@Override
	int withdraw(int amount) {

		if((super.getBalance() + creditLine) < amount) {
			System.out.println("인출 불가");
			return 0;
		}
		
		super.setBalance(super.getBalance() - amount);
		return super.getBalance();
	}
}
