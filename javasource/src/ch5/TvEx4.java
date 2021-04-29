package ch5;

public class TvEx4 {
	public static void main(String[] args) {
		// 배열 : 타입 배열명[] = new 타입[갯수];
		// 초기화 : 배열명[0] = 숫자;
		
		int arr[] = new int[5];
		arr[0] = 78;
		
		int arr2[] = {78, 88, 98};
		
		TV tvArr[] = new TV[5];
		
		// 초기화
//		tvArr[0] = new TV();
//		tvArr[1] = new TV();
//		tvArr[2] = new TV();
//		tvArr[3] = new TV();
//		tvArr[4] = new TV();
		
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i] = new TV();
			tvArr[i].channel = i + 10;
		}
		
		for(int i=0; i<tvArr.length; i++) {
			System.out.printf("tvArr[%d].channel = %d\n", i, tvArr[i].channel);
		}
		
	}

}
