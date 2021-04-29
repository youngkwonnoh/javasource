package ch4;

public class ArrayEx9 {

	public static void main(String[] args) {
		// 1 ~ 45를 가지고 있는 카드 배열 생성
		int card[] = new int[45];
		
		for(int i=0; i<card.length; i++) {
			card[i] = i + 1;
		}
		for(int no:card) {
			System.out.print(no + " ");
		}
		System.out.println();
		// 카드 섞기
		for(int i=0; i<card.length; i++) {
			// 무작위로 위치 추출
			int pos = (int)(Math.random()*45);
			int temp = card[i];
			card[i] = card[pos];
			card[pos] = temp;
		}
		// 섞은 후 출력
		for(int no:card) {
			System.out.print(no + " ");
		}
		
		
	}

}
