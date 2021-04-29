package ch6;

public class ProductEx {
	public static void main(String[] args) {
		// 상품 객체 생성
		Product product = new Product("p123", "모자", "나이키", 30000);
		
		// 할인율 변경
		product.setDiscount(15);
		
		// 판매가 확인
		System.out.println("판매가 : " + product.setPrice());

	}
}
