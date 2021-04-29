package ch13;

import java.util.LinkedList;
import java.util.List;

public class ListEx6 {
	public static void main(String[] args) {
		
		List<String> list1 = new LinkedList<String>();
		
		list1.add("사과");
		list1.add("포다");
		list1.add("메론");
		list1.add("수박");
		list1.add("바나나");
		
		for(String str:list1) {
			System.out.println(str);
		}
	}

}
