package ch6;

public class GoodsStock2 {
	// 상품 재고 관리를 위한 클래스
	// 속성 - 상품코드(p210135), 재고수량(100)
	
	private String code;
	private int quantity;
	
	
	// 기능 - 재고를 더한다. 재고를 뺀다.
	// 재고를 더한다(addStock) : 정수형 매개변수(재고수량), 현재재고수량+=재고수량, 리턴타입 없음
	void addStock(int num) {
		quantity += num; 
	}
	
	// 재고를 뺀다(subractStock) : 정수형 매개변수(재고수량), 현재재고수량-=재고수량, 리턴타입 없음
	void substrctStock(int num) {
		quantity -= num; 
	}
	
	
	// setter 메소드
	public void setCode(String code) {
		this.code = code;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	// getter 메소드
	public String getCode() {
		return code;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
}
