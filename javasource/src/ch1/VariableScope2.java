package ch1;

// 변수의 유효 범위 : 선언된 블록 내에서만 사용 가능
public class VariableScope2 {
	public static void main(String[] args) {
		int value = 15;
		int v2 = 0; // not have been initialized : 할당된 값 없음(초기화 안함)
		if(value>10 ){
			// int v2 = value -5;
			v2 = value -5;
		}
		System.out.println(v2);
	}
}
