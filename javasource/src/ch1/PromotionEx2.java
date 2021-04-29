package ch1;

// 자동 타입 변환(Promotion)
// byte < short < int < long < float < double
public class PromotionEx2 {
	public static void main(String[] args) {
		byte byteValue1 = 10, byteValue2 = 20;
		
		// 큰 타입(4byte) = 작은 타입(1byte)
		int intValue = byteValue1 + byteValue2;
		System.out.println(intValue);
		
		// byte byteResult = byteValue1 + byteValue2;
		// 자바 연산 시 자동적으로 형 변환이 일어남.
		
		double doubleValue = 5.5;
		double byteresult = intValue + doubleValue;
		System.out.println(byteresult);
		
		char charValue1 = 'A'; // 65
		char charValue2 = 1;
		int resultValue = charValue1 + charValue2;
		System.out.println(resultValue);
		
	}

}
