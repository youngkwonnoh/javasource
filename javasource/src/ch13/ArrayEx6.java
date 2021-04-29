package ch13;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayEx6 {
	public static void main(String[] args) {
		
		Integer arr[] = {37, 21, 56, 99, 88, 58, 62, 15, 36, 78};
		
		// 정렬 전
		for(int i : arr) {
			System.out.print(i + "\t");
		}
		
		// 정렬 - 내림차순
		// sort(T[], a, ...) : T[] : 참조타입으로 들어와야 한다.
		Arrays.sort(arr, Comparator.reverseOrder());
		System.out.println();
		
		for(int i : arr) {
			System.out.print(i + "\t");
		
		}
	}
}
