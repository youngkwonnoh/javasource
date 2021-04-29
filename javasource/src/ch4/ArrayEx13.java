package ch4;

public class ArrayEx13 {
	public static void main(String[] args) {
		if(args.length !=2 ) {
			System.out.println("프로그램 사용법");
			System.out.println("java 클래스명 인자1 인자2");
			System.exit(0); // 프로그램 종료
		}
		
		// Run > Run Configurations > Arguments에서 Program Arguments에 숫자 10 20을 넣으면
		// args[0] = 10, args[1] = 20이 저장된다.
		
		int strNum1 = Integer.parseInt(args[0]);
		int strNum2 = Integer.parseInt(args[1]);
		
		System.out.println(strNum1 + " , " + strNum2);
	}

}