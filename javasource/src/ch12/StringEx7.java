package ch12;

public class StringEx7 {
	public static void main(String[] args) {
		
		String str1 = "abcdefghijkl";
		
		// 문자열 -> char[]
		char[] arr1 = str1.toCharArray();
		
		for(char ch:arr1) {
			System.out.println(ch);
		}
		
	}

}
