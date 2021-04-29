package ch2;

// 삼항연산자 => 조건식 ? 값 또는 연산식 : 값 또는 연산식
// 조건이 참이면 물음표 뒤에 구문 실행
// 거짓이면 콜론 뒤 구문 실행
public class ConditionalOperEx2 {
	public static void main(String[] args) {
		int score = 85;
		
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println("등급 : " + grade);
		
	}

}
