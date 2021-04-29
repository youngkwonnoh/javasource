package ch13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ExamEx2 {
	public static void main(String[] args) {
		// Scanner를 사용하여 5개의 실수 값을 사용자로부터 받아서
		// ArrayList에 저장한후 검색하여 가장 큰 수를 출력
		
		// 예시
		// 3.14 2.2 -5.5 99.9 33.7
		// 가장 큰 수는 99.9

		List<Double> list1 = new ArrayList<Double>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실수 입력");
		String input = sc.nextLine();
		
		StringTokenizer token = new StringTokenizer(input);
		while(token.hasMoreElements()) {
			list1.add(Double.parseDouble(token.nextToken()));
		}
		
		double max = 0;
		for(Double value:list1) {
			if(max < value) {
				max = value;
			}
		}
		System.out.println("가장 큰 수는 " + max);
				
	}

}
