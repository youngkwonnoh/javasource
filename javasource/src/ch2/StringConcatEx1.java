package ch2;

public class StringConcatEx1 {
	public static void main(String[] args) {
		// 문자 => 'C'
		// 문자열 => "AC"
		// 문자열과 만나는 + => 연결
		
		String str1 = "JDK" + 11.0;
		String str2 = str1 + "특징";
		
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 30;
		String str4 = 3 + 3.0 + "JDK";
		System.out.println("str3");
		System.out.println("str4");
		
	}

}
