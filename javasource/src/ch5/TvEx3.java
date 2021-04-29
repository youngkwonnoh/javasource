package ch5;

public class TvEx3 {
	public static void main(String[] args) {
		
		int a = 10, b = 20;
		System.out.printf("a = %d, b = %d\n", a, b);
		a = b;
		System.out.printf("a = %d, b = %d\n", a, b);
		
		
		// 참조 타입
		TV tv1 = new TV();
		TV tv2 = new TV();
		
		System.out.println("tv1 = " + tv1);
		System.out.println("tv2 = " + tv2);
		
		System.out.println("tv1 channel = " + tv1.channel);
		System.out.println("tv2 channel = " + tv2.channel);
		
		tv2 = tv1;
		tv1.channel = 7;
		System.out.println("tv1 = " + tv1);
		System.out.println("tv2 = " + tv2);
		System.out.println("tv1 channel = " + tv1.channel);
		System.out.println("tv2 channel = " + tv2.channel);
	}
}