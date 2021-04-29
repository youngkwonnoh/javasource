package ch7;

public class BonusPointAccount extends Account {
	// 보너스 포인트 - 정수
	private int bonusPoint;
	// 생성자(부모의 인자를 받는 생성자 호출)

	public BonusPointAccount(String ano, String owner, int balance, int bonusPoint) {
		super(ano, owner, balance);
		this.bonusPoint = bonusPoint;
	}
	
	// deposit 오버라이딩 => 예금한다 / 보너스포인트 = 예금액의 1%
	
	@Override
	void deposit(int amount) {
		super.deposit(amount); // 예금한다.
		bonusPoint = (int)(amount * 0.01); // 보너스포인트 = 예금액의 1%
		setBonusPoint(bonusPoint);
	}
	
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint += bonusPoint;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}
	
	
	
}
