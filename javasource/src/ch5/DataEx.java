package ch5;

public class DataEx {
	public static void main(String[] args) {
		Data data = new Data();
		
		data.x = 10;
		System.out.println("main() : x = " + data.x );
		change(data);
//		change(data.x);
		System.out.println("After change(data.x)");
		System.out.println("main() : x = " + data.x);
		
	}
	
	static void change(Data obj) {
		obj.x = 1000;
		System.out.println("change() : x = " + obj.x);
	}
//	static void change(int x) {
//		x = 1000;
//		System.out.println("change() : x = " + x);
//	}

}
