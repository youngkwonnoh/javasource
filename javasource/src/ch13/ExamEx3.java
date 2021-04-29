package ch13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ExamEx3 {
	public static void main(String[] args) {
		// 한 어린이의 키를 2012~2020년 사이에 1년 단위로 입력받아
		// ArrayList에 저장. 가장 키가 많이 자란 연도 출력
		
		// 예시
		// 120 122 125 130 139 160 169 173 175
		// 가장 키가 많이 자란 년도는 2017년 21.0cm
		
		List<Integer> list1 = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키 입력");
		String input = sc.nextLine();
		
		StringTokenizer token = new StringTokenizer(input);
		while(token.hasMoreElements()) {
			list1.add(Integer.parseInt(token.nextToken()));
		}
		
		int pos=0, between=0;
		for(int i=0; i<list1.size()-1; i++) {
			int diff = list1.get(i+1) - list1.get(i);
			if(between < diff) {
				between = diff; 
				pos = i;
			}
			
		}
		
		System.out.println("가장 키가 많이 자란 년도는 " + (pos + 2012) + "년, " + between + "cm");

	}

}
