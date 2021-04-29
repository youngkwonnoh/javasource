package ch13;

import java.util.Arrays;

public class ArrayEx2 {
	public static void main(String[] args) {
		int arr[] = {37, 21, 56, 99, 88, 58, 62, 15, 36, 78};
		
		// 정렬 전
		for(int i : arr) {
			System.out.print(i + "\t");
		}
		
		// 정렬 - 오름차순
		Arrays.sort(arr);
		System.out.println();
		
		// 정렬 후
		for(int i : arr) {
			System.out.print(i + "\t");
		}
	}

}
