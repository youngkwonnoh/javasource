package ch6;

public class GoodsStockEx2 {
	public static void main(String[] args) {
		// 객체 생성
		GoodsStock2 goods1 = new GoodsStock2();
		goods1.setCode("p210125");
		goods1.setQuantity(100);
		
		// 메소드 호출 : 재고수량 추가
		goods1.addStock(20);
		// 재고수량 확인
		System.out.println("재고번호 : " + goods1.getCode() + " 재고수량 : " + goods1.getQuantity());
		
		// 메소드 호출 : 재고수량 추가
		goods1.substrctStock(40);
		
		// 재고수량 확인
		System.out.println("재고번호 : " + goods1.getCode() + " 재고수량 : " + goods1.getQuantity());
		
	}

}
