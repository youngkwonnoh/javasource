package ch13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ListEx3 {
	public static void main(String[] args) {
		
		// 배열을 리스트로 바꾸는 방법
		
		String fruit[] = {"사과", "포도", "딸기", "자두", "수박"};
		
		List<String> list1 = Arrays.asList(fruit);
		
		System.out.println(list1);
		
//		// java.lang.UnsupportedOperationException : 런타임 exception
//		// 배열의 속성으로 되어있는데 list로 추가해서 에러가 생김
//		list1.add("메론");
//		System.out.println(list1);
		
		
		// 새로 리스트를 생성하며 값을 추가해주면 가능하다.
		List<String> list2 = new ArrayList<String>(Arrays.asList(fruit));
		list2.add("메론");
		System.out.println(list2);
		
		
	}
}
