package ch5;

public class CardEx {
	public static void main(String[] args) {
		Card card1 = new Card(7, "heart");
		// print(변수명)을 통해 클래스에 저장한다.
		print(card1);
		Card card2 = new Card(6, "spade");
		print(card2);
	}
	static void print(Card card) {
		System.out.println("card number : " + card.number);
		System.out.println("card 종류 : " + card.kind);
		// card1.width => 특정 객체에 속한 필드가 아님.
		// System.out.println("card 가로 길이 : " + card.width);
		// static이 있는 모든 것들은 class이름.변수로 접근한다.
		System.out.println("card 가로 길이 : " + Card.width);
		System.out.println("card 세로 길이 : " + Card.height);
	}
}
