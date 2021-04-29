package ch12;

public class SystemEx {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println(i + "\t");
			
			if(i == 5) {
				// 현재 프로그램 종료
				// 0 : 정상 종료
				// 0이 아닌 경우 : 비정상 종료
				System.exit(0);
			}
		}
	}

}
