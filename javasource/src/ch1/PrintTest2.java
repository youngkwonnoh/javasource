package ch1;

//이스케이프(escape)문자 : \ 다음에 오는 문자
// \t(탭 한번), \n(줄바꿈), \"(쌍따옴표 출력), \'(홑따옴표 출력)
// \\(\ 한번의 의미)
public class PrintTest2 {
	public static void main(String[] args) {
		System.out.println("\n");
		System.out.println("\"Hello\"");
		System.out.println("안녕하세요\t반갑습니다.");
		System.out.println("c:\\");
		System.out.println("프로그래밍 언어 활용\n");
		System.out.println("재미있는\\자바");
	}

}
