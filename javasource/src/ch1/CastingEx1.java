package ch1;

// 강제 타입 변환(Casting)
public class CastingEx1 {
	public static void main(String[] args) {
		// 작은 크기 타입 = (작은 크기 타입)큰 크기 타입
		int intValue = 103029;
		byte byteValue = (byte)intValue;
		System.out.println(byteValue);
	}

}