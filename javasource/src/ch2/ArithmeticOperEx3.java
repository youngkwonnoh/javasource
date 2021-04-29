package ch2;

public class ArithmeticOperEx3 {
	public static void main(String[] args) {
		// int x = 1000000;
		long  x = 1000000;
		int y = 1000000;
		
		// int z = x * y;
		long z = x * y;
		System.out.println("z = " + z);
		// int 타입에 저장될 수 있는 값의 범위를 초과하게 됨.
		// 쓰레기 값이 나옴
		// 값이 제대로 나오려면 x 또는 y의 타입을 변환해야 한다.
		// z 는 이미 변환된 타입의 값을 기준으로 가지고 있기 때문에 z의 타입만 바꿔봤자 쓰레기값의 타입을 바꾼 것만 된다. 
	}

}
