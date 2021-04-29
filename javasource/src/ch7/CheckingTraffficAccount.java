package ch7;

public class CheckingTraffficAccount extends CheckingAccount {

	private boolean hasTrafficCard;
	
	public CheckingTraffficAccount(String ano, String owner, int balance, String cardNo, boolean hasTrafficCard) {
		super(ano, owner, balance, cardNo);
		this.hasTrafficCard = hasTrafficCard;
		// TODO Auto-generated constructor stub
	}
	
	// 교통비 지불 - 교통가드 기능이 있다면
	// 카드번호와 잔액 확인 후 교통비 지출
	int payTrafficCard(String cardNo, int amount) {
		if(!hasTrafficCard) {
			System.out.println("교통카드 기능이 없습니다.");
			return 0;
		}
		return pay(cardNo, amount);
	}
	
	
}
