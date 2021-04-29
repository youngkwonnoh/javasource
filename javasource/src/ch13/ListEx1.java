package ch13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ListEx1 {
	public static void main(String[] args) {
		
		// E : 담아야 할 타입(참조타입)
		// int => integer
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		// 요소 추가
		list1.add(1);
		list1.add(10);
		list1.add(100);
		list1.add(1000);
		list1.add(10000);
		list1.add(100000);
		
		// 확인
		// System.out.println(list1);
		
		for(Integer i:list1) {
			System.out.println(i);
		}
		
		list1.sort(Comparator.reverseOrder());
		
		for(Integer i:list1) {
			System.out.println(i);
		}
		
	}
}
