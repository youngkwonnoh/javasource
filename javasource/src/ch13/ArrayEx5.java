package ch13;

import java.util.Arrays;

public class ArrayEx5 {
	public static void main(String[] args) {
		char arr[] = {'ㅎ', 'ㅅ', 'ㄱ', 'ㄴ', 'ㅈ', 'ㄷ', 'ㅁ', 'ㄹ', 'ㅊ'};
		
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
