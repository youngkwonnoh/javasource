package ch2;

// 논리연산자 : &&(and), ||(or), ^(xor), !(not)
public class LogicalOperEx1 {
	public static void main(String[] args) {
		
		int charCode = 'A';

		if((charCode >= 65) && (charCode <= 90)) {
			System.out.println("대문자");
		}

		if(!(charCode < 48) && !(charCode > 57)) {
			System.out.println("0 ~ 9 숫자");
		}

		int value = 6;
		if((value %2 == 0) || (value %3 == 0)) {
			System.out.println("2 혹은 3의 배수");
		}
	}

}