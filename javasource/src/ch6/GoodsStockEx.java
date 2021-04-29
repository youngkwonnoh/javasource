package ch6;

public class GoodsStockEx {
	public static void main(String[] args) {
		// 상품코드(p210135), 재고수량(100)
		GoodsStock goods1 = new GoodsStock("p210210", 100);
		
		// 메소드 호출 : 재고수량 추가
		goods1.addStock(20);
		
		// 재고수량 확인
		System.out.println("재고수량 : " + goods1.getQuantity());
		
		// 메소드 호출 : 재고수량 추가
		goods1.substrctStock(40);
		System.out.println("재고수량 : " + goods1.getQuantity());
		
		GoodsStock goods2 = new GoodsStock("p210234", 0);
	}

}
