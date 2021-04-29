package ch13;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayEx4 {
	public static void main(String[] args) {
		String arr[] = {"good", "height", "apple", "piano", "zero"};
		
		// 정렬 전
		for(String str : arr) { 
			System.out.print(str + " ");
		}
		System.out.println();
		
		Arrays.sort(arr);
			
		// 정렬 후
		for(String str : arr) { 
			System.out.print(str + " ");
		}
		
		System.out.println();
		
		// 내림차순 정렬
		Arrays.sort(arr, Comparator.reverseOrder());
		for(String str : arr) { 
			System.out.print(str + " ");
		}
		
	}

}
