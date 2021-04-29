package shop;

public abstract class Product {
	// 추상 클래스 : 변수, 상수, 일반 메소드, 추상 메소드
	private String pname;
	private int price;
	
	public Product(String pname, int price) {
		super();
		this.pname = pname;
		this.price = price;
	}
	
	public void printDetail() {
		// 기본 정보인 상품 이름과 가격을 출력
		// 상세 정보 printExtra() 메소드 호출
		System.out.println("상품명 : " + pname);
		System.out.println("가격 : " + price);
		printExtra();
	}

	abstract void printExtra();
	
	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
