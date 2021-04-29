package ch5;

public class NumbersEx {
	public static void main(String[] args) {
		
		// 기본 타입을 null로 초기화할 수 없다.
//		int a = 0;
//		int b = null;
		
		// 참조타입은 null로 초기화 가능
//		int[] arr = null;
//		System.out.println(arr);
//		System.out.println(arr.length);
		
		int arr[] = {75, 95, 69, 84, 23, 11, 25, 35};
		
		Numbers obj = new Numbers(arr);
		System.out.println("합계 : " + obj.getTotal());
		System.out.println("평균 : " + obj.getAverage());
		
		
	}

}
