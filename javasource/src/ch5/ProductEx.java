package ch5;

public class ProductEx {
	public static void main(String[] args) {
		// 속성 - 상품코드, 상품명, 제조사, 제조단가, 할인율
		// 생성자 - 모든 필드를 파라메터로 받는 생성자 / 할인율을 뺀 나머지 필드를 받는 생성자
		// 기능 - 할인율을 변경한다. 판매가를 계산한다.(판매가 : 제조단가 * (100 - 할인율) / 100)
		Product product1 = new Product("ABC123", "초코파이", "오리온", 500);
		
		System.out.println("가격 : " + product1.money());
		
		product1.changeDis(20);
		System.out.println("가격 : " + product1.money());
	}

}
