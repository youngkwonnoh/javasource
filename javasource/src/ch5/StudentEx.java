package ch5;

public class StudentEx {

	public static void main(String[] args) {
		// 객체 생성
		Student student = new Student();
		
		// 초기화
		student.name = "홍길동";
		student.id = "20170012";
		student.mobile = "010-1234-5678";
		student.addr = "인천시 동구";
		
		// 확인
		System.out.println("학번 : " + student.id);
		System.out.println("이름 : " + student.name);
		System.out.println("주소 : " + student.addr);
		System.out.println("전화번호 : " + student.mobile);
		
		// 전화번호 변경
		student.changeMobile("010-6543-2109");
		System.out.println("전화번호 : " + student.mobile);
		
		
		
		
	}

}
