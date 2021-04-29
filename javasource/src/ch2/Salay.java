package ch2;

public class Salay {
	public static void main(String[] args) {
		// 한달 저축액 3000000 일 때 10년 저축 금액을 출력하시오
		
		int money = 3000000;
		int month = 12;
		int year = 10;
		
		int save = money * month * year;
		
		System.out.println("10년 저축 금액 = " + save);
		
	}

}
