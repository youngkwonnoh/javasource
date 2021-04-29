package ch4;

public class ReferenceEx1 {
	public static void main(String[] args) {
		// String strArr[] = new String[3];
		
		
		// 참조 타입 - null 할당(힙 영역의 객체를 참조하지 않음)
//		int intArr[] = null;
//		System.out.println(intArr.length);
//		
//		String strArr[] = null;
//		System.out.println(strArr.length); // Null pointer access
//		
		String strArr[] = new String[3];
		strArr[0] = "홍길동";
		strArr[1] = "홍길동";
		strArr[2] = new String("홍길동");
		
		// 문자열이 같은지 확인할 땐 == 보다는 equals를 사용한다. 
		System.out.println(strArr[0] == strArr[1]);
		System.out.println(strArr[0] == strArr[2]);
		System.out.println(strArr[0].equals(strArr[2]));
		
	}

}
