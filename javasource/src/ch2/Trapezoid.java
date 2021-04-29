package ch2;

public class Trapezoid {
	public static void main(String[] args) {
		// 사다리꼴의 넓이를 구한 후 출력하시오
		// 윗변 : 5, 아랫변 : 10, 높이 : 7
		
		double top = 5;
		double bottom = 10;
		double height = 7;
		
		double area = (top + bottom) * height / 2;
		
		// int top = 5;
		// int bottom = 10;
		// int height = 7;
		
		// double area = (double)(top + bottom) * height / 2;
		
		System.out.println("사다리꼴의 넓이 = " + area);
	}

}
