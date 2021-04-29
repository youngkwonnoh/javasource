package ch5;

import java.util.Scanner;

public class StudentEx3 {
	public static void main(String[] args) {
		// 객체 배열 => List
		
		Student stuArr[] = new Student[3];
		
		for(int i=0; i<stuArr.length; i++) {
			stuArr[i] = new Student();
		}
		
//		stuArr[0].id = "1234";
//		stuArr[0].addr = "서울";
//		stuArr[0].mobile = "01098764561";
//		stuArr[0].name = "홍길동";
//		
//		stuArr[1].id = "1235";
//		stuArr[1].addr = "경기";
//		stuArr[1].mobile = "01065489632";
//		stuArr[1].name = "맹구";
		
		Scanner sc = new Scanner(System.in);
		
		// 정보 확인
//		for(int i=0; i<stuArr.length; i++) {
//			System.out.printf("[%d] 학생 정보 입력 \n", i);
//			
//			System.out.print("id : ");
//			stuArr[i].id = sc.nextLine();
//			
//			System.out.print("addr : ");
//			stuArr[i].addr = sc.nextLine();
//			
//			System.out.print("mobile : ");
//			stuArr[i].mobile = sc.nextLine();
//			
//			System.out.print("name : ");
//			stuArr[i].name = sc.nextLine();
//			
//		}
		
		// 정보 확인
//		for(int i=0; i<stuArr.length; i++) {
//			System.out.printf("[%d] 학생 정보 입력 \n", i);
//			System.out.println("아이디 : " + stuArr[i].id);
//			System.out.println("이름 : " + stuArr[i].name);
//			System.out.println("주소 : " + stuArr[i].addr);
//			System.out.println("전화번호 : " + stuArr[i].mobile);
//		}

		// 향상된 for문 : (타입 변수명:배열)
		
		int i=1;
		for(Student stu:stuArr) {
			
			System.out.printf("[%d] 학생 정보 입력 \n", i++);
			
			System.out.print("id : ");
			stu.id = sc.nextLine();
			
			System.out.print("addr : ");
			stu.addr = sc.nextLine();
			
			System.out.print("mobile : ");
			stu.mobile = sc.nextLine();
			
			System.out.print("name : ");
			stu.name = sc.nextLine(); 
			
		}
		i=1;
		for(Student str:stuArr) {
			System.out.printf("[%d] 학생 정보 입력 \n", i++);
			System.out.println("아이디 : " + str.id);
			System.out.println("이름 : " + str.name);
			System.out.println("주소 : " + str.addr);
			System.out.println("전화번호 : " + str.mobile);
		}
		
		
	}

}
