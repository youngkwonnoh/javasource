package ch11;

public class CatchOrderEx {
	public static void main(String[] args) {
	// try : exception 나는 코드
	// catch : exception 받아서 처리
	// finally : 예외랑 상관없이 프로그램이 반드시 실행해야 하는 코드 위치
		
//		try {
//
//			String data1 = args[0];
//			String data2 = args[1];
//			System.out.println("data1 = " + data1);
//			System.out.println("data2 = " + data2);
//		
//		} catch (ArrayIndexOutOfBoundsException e) {
//			// 개발할 때 주로 사용
//			// e.printStackTrace();
//			
//			// 오류에 대한 메세지 확인
//			// System.out.println(e.getMessage());
//			
//			// 사용자 확인 메세지
//			System.out.println("배열의 갯수를 확인해 주세요");
//		}
	
		try {
		
		} finally {
			// TODO: handle finally clause
		}
	
	
		try {
			
			// ArrayIndexOutOfBoundsException
			String data1 = args[0];
			String data2 = args[1];
			// NumberFormatException
			int op1 = Integer.parseInt(data1);
			int op2 = Integer.parseInt(data2);
			System.out.println(op1 + op2);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("무조건 수행");
		}
		
	}

}
