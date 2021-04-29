package ch3;
import java.util.Scanner;

public class DoWhileEx2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램 종료는 q 입력");
		
		String input;
		
		do {
			System.out.print(">>");
			input = sc.nextLine();
			
		} while(!input.equals("q"));
		
		System.out.println("프로그램 종료");

	}

}
