package ch12;

public class StringEx2 {
	public static void main(String[] args) {
		String str1 = "자바 프로그래밍";
		
		// 문자열에 '프'가 있는지 확인하기.
//		for(int i=0; i<str1.length(); i++) {
//			if(str1.charAt(i) == '프') {
//				System.out.println("프는 [" + i + "]열에 있습니다");
//				System.out.println(str1.charAt(i));
//			}
//		}
		
		boolean flag = false;
		for(int i=0; i<str1.length(); i++) {
			if(str1.charAt(i) == '프') {
				flag = true;
				// i가 다 돌기를 기다리지 않고 찾자마자 끝내려면 break를 준다.
				break;
			}
		}
		System.out.println(flag?"들어있음":"없음");
	}

}
