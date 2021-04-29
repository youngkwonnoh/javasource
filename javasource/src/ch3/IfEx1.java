package ch3;

public class IfEx1 {
	public static void main(String[] args) {
		
		int x = 0;
		
		if(x == 0) {
			System.out.println("x == 0");
		}
		if(x != 0) {
			System.out.println("x != 0");
		}
		if(!(x == 0)) {
			System.out.println("!(x == 0)");
		}
		if(!(x != 0)) {
			System.out.println("!(x != 0)");
		}
	}

}