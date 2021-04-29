package ch11;

public class CheckedException {
	public static void main(String[] args) throws ClassNotFoundException {
		// 컴파일 예외 - ckeckedException
		// ClassNotFoundException
		
		findClass();
		
	}
	
	static void findClass() throws ClassNotFoundException {
		Class.forName("");
	}
	
	
	
}
