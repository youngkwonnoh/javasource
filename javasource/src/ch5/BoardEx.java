package ch5;
import java.util.Scanner;

public class BoardEx {
	public static void main(String[] args) {
		// 속성 = 글번호(1, 2, 3 ...), 제목, 작성자, 내용
		// Board 객체 배열 3
		
		Board boardArr[] = new Board[3];
		
		for(int i=0; i<boardArr.length; i++) {
			boardArr[i] = new Board();
		}

		// 입력 후 출력
		
		Scanner sc = new Scanner(System.in);
		
		int i=1;
		for(Board board:boardArr) {
			System.out.print("글 번호 입력 : ");
//			board.bno = sc.nextInt();
			board.bno = Integer.parseInt(sc.nextLine());
			// nextInt로 정수를 받으면서 Enter에 관련된 버퍼가 남아있디
			// 제목부분에 갈 때 줄바꿈인 Enter 버퍼를 읽게된다.
			// 그래서 그 줄바꿈을 받은 후 바로 작성자로 넘어간다.
			System.out.print("제 목 : ");
			board.title = sc.nextLine();
			System.out.print("작성자 : ");
			board.writer = sc.nextLine();
			System.out.print("내 용 : ");
			board.contents = sc.nextLine();
		}
		
		for(Board board:boardArr) {
			System.out.println("글번호 : " + board.bno);
			System.out.println("제 목 : " + board.title);
			System.out.println("작성자 : "+ board.writer);
			System.out.println("내 용 : " + board.contents);
			
		}
	}

}
