package ch5;

public class PrintEx {
	public static void main(String[] args) {
		// 기본생성자 호출
		Printer printer = new Printer();
		
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		printer.println('A');
	}

}
