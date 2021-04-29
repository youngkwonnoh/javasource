package ch13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ExamEx1 {
	public static void main(String[] args) {
		// Scanner를 사용하여 학점(A, B ,C ,D F)을 5개만 문자로 입력받아
		// ArrayList에 저장한다. 다시 ArrayList를 검색하여 5개의 학점을
		// 점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0.0)로 변환하여 출력
		
		// 출력 예시
		// 빈칸으로 분리하여 5개의 학점을 입력(A/B/C/D/F) >> B A F C D
		// 3.0 4.0 0.0 2.0 1.0
		
		List<String> list1 = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("빈칸으로 분리하여 5개의 학점을 입력(A/B/C/D/F) >> ");
		String input = sc.nextLine(); // B A F C D
		
		StringTokenizer token = new StringTokenizer(input);
		
		while(token.hasMoreElements()) {
			list1.add(token.nextToken());
		}
		
		String grade = null;
		for(String g:list1) {
			switch (g) {
			case "A":
				grade = "4.0";
				break;
			case "B":
				grade = "3.0";
				break;
			case "C":
				grade = "2.0";
				break;
			case "D":
				grade = "1.0";
				break;
			case "F":
				grade = "0.0";
				break;
			}
			System.out.print(grade + "\t");
		}
		
	}

}
