package ch2;

public class Degrees {
	public static void main(String[] args) {
		// 화씨온도를 섭씨온도로 바꾸는 프로그램 작성
		// 임의의 화씨온도를 변수로 선언하고 변경하시오
		
		double x = 64;
		double Cdegree = (x - 32) * 5 / 9;
		
		System.out.println(x + "화씨 온도일 때 섭씨 온도는 " + Cdegree);
		
		
	}

}
