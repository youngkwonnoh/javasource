package ch1;

// 변수의 유효 범위 : 선언된 블록 내에서만 사용 가능
public class VariableScope1 {
	public static void main(String[] args) {
		int value = 15;
		int v2;
		{
			v2 = value + 20;
		}
		System.out.println(v2);
	}
}
