package shop;

import java.util.Scanner;

public class MyShop implements Ishop {
	
	private String title;
	
	Scanner sc = new Scanner(System.in);
	
	// 장바구니 용도
	Product[] carts = new Product[5];
	// 제품 생성
	Product[] products = new Product[5];
	User[] users = new User[2];
	// 선택된 user값 담기
	String selUser;

	@Override
	public void setTitle(String title) {
		// set함수는 대부분 변경의 의미
		this.title = title;
	}

	@Override
	public void genUser() {
		// user 2명 생성
//		User user1 = new User("홍길돌", PayType.CARD);
//		User user2 = new User("고라니", PayType.CASH);
//
//		users[0] = user1;
//		users[1] = user2;
		
		users[0] = new User("홍길돌", PayType.CARD);
		users[1] = new User("고라니", PayType.CASH);

	}

	@Override
	public void genProduct() {
		
		products[0] = new CellPhone("갤럭시S21", 1000000, "SKT");
		products[1] = new CellPhone("아이폰", 1500000, "KT");
		products[2] = new CellPhone("Lg 벨벳", 900000, "LG");
		products[3] = new SmartTV("삼성 벽걸이", 5000000, "4K");
		products[4] = new SmartTV("LG TV", 4000000, "Full HD");
		
		// 아래와 같은 방법은 수량이 많아지면 불편하여 위처럼 배열로 생성한다.
		// CellPhone cellphone1 = new CellPhone("갤럭시", 100, "SKT");
		// SmartTV smartTV1 = new SmartTV("삼성 TV", 100, "4K"); 
		
	}

	@Override
	public void start() {
		
		System.out.println(title + " : 메인 화면 - 계정 선택");
		System.out.println("=============================");
	
		for(int i=0; i<users.length; i++) {
			System.out.printf("[%d] %s(%s)\n", i, users[i].getName(), users[i].getPaytype());
		}
		
//		int i = 0;
//		for(User user:users) {
//		System.out.printf("[%d] %s(%s)\n", i++, user.getName(), user.getPaytype());
//		}
		
		System.out.println("[x] 종 료");
		System.out.print("선택 : ");
	
		// int num = Integer.parseInt(sc.nextLine());
		String input = sc.nextLine();
	
		// 사용자가 0, 1번을 입력했다면
	
		switch(input) {
		case "0": case "1":
			System.out.println("## " + input + " 선택 ##");
			selUser = input;
			productList();
			break;
		// X를 입력했다면 프로그램 종료
		case "x": case "X":
			System.out.println("프로그램 종료");
			break;
		// 메뉴가 제시하는 값 이외의 다른 값을 입력했다면
		// 메뉴를 확인해주세요 메세지 출력한 후
		// 다시 메뉴화면이 보여지도록 하기
		default:
			System.out.println("\n메뉴를 확인해주세요\n");
			start();
			break;
		}
	}
		
	public void productList() {
		// 판매중인 상품
		System.out.println(title + " : 상품 목록 - 상품 선택");
		System.out.println("=============================");
		
//		for(int i=0; i<products.length; i++) {
//			System.out.printf("[%d]", i);
//			products[i].printDetail();
//		}
		
		int i = 0;
		
		for(Product p:products) {
			System.out.printf("[%d]", i++);
			p.printDetail();
		}
		
		System.out.println("[h] 메인 화면");
		System.out.println("[c] 체크 아웃");
		System.out.print("선택 : ");
		
		String input = sc.nextLine();
		
		switch(input) {
		// input => 상품 번호 => 선택된 상품을 장바구니(carts)에 담기, 상품 목록 보여주기 
		case "0": case "1": case "2": case "3": case "4":
			for(i=0; i<carts.length; i++) {
				if(carts[i] == null) {
					carts[i] = products[Integer.parseInt(input)];
					break;
				}
			}
//			int j = 0;
//			for(j = 0; carts[j] != null; j++) {
//			}
//			carts[j] = products[Integer.parseInt(input)];
			productList();
			break;
		// input => h => 메인화면 보여주기
		case "h":
			start();
			break;
		// input => c => checkOut() 메소드를 호출
		case "c":
			System.out.println("## c 선택 ##");
			checkOut();
			break;
		default:
			System.out.println("\n번호를 확인해주세요\n");
			productList();;
			break;
		}
	}
	
	public void checkOut() {
		
		System.out.println(title + " : 체크아웃");
		System.out.println("=============================");
		
		int i = 0;
		int sum = 0;
		for(Product cart:carts) {
			if(cart != null) {
				System.out.printf("[%d] %s (%d)\n", i++, cart.getPname(), cart.getPrice());
				sum += cart.getPrice();
				
			}
		}
		
		System.out.println("=============================");
		System.out.println("결제 방법 : " + users[Integer.parseInt(selUser)].getPaytype());
		System.out.println("합계 : " + sum + "원 입니다.");
		System.out.println("[p]이전, [q]결제 완료");
		System.out.print("선택 : "); 
		
		String input = sc.nextLine();
		
		switch(input) {
		// input=> p : 이전화면
		case "p":
			productList();
			break;
		// input => q : 결제완료 되었습니다. 메세지 출력 후 종료
		case "q":
			System.out.println("결제 완료");
			break;
		// 다른 입력 시 다시 화면 호출
		default :
			checkOut();
			break;
		}
		
	}
	

}
