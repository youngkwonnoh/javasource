package ch12;

public class StringEx8 {

	public static void main(String[] args) {
		
		String str = "12345";
		// 1+2+3+4+5  =  
		
		int sum = 0;
		for(int i=0; i<str.length(); i++) {
			
			// 문자열 12345를 문자 '1', '2', ~~'5'로 받는다.
			// 문자를 문자열 "1", "2", ~~"5"로 바꿔준다.
			// 그 후 integer로 문자열을 숫자로 받아준다.
			sum += Integer.parseInt(String.valueOf(str.charAt(i)));
			
		}
		
		System.out.println(sum);
	}
}
