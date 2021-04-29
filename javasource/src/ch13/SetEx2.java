package ch13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		
		for(; set.size()<6;) {
			int lotto = (int)(Math.random()*45)+1;
			set.add(lotto);
			
		}
		
		System.out.println(set);
		
		// 정렬
		List<Integer> list = new ArrayList<Integer>(set);
		list.sort(Comparator.naturalOrder()); // 오름차순
		System.out.println(list);
		
		
		
		
	}

}
