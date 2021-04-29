package ch13;

import java.util.Arrays;

public class ArrayEx3 {
	public static void main(String[] args) {
		char arr[] = {'a', 'q', 'c', 'r', 'z', 'o', 'b', 'f', 'g', 's'};
		
		
		// 정렬 전
		for(char ch : arr) { 
			System.out.print(ch + " ");
		}
		System.out.println();
		
		
		Arrays.sort(arr);
		
		// 정렬 후
		for(char ch : arr) { 
			System.out.print(ch + " ");
		}
		
		
		
	}

}
