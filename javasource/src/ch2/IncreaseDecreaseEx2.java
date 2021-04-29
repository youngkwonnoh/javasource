package ch2;

// 증감연산자 : ++ : +1, -- : -1
// ++a, a++, --a, a--
// ++a, --a(선행) : 다른 연산을 수행하기 전에 피연산자의 값을 +1, -1시킴
// a++, a--(후행) : 다른 연산을 수행한 후에 피연산자의 값을 +1, -1시킴
public class IncreaseDecreaseEx2 {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-------------");
		x++;
		++x;
		System.out.println("x = " + x);
		
		System.out.println("-------------");
		y--;
		--y;
		System.out.println("y = " + y);
		
		System.out.println("-------------");
		z = x++; // 대입연산자
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("-------------");
		z = ++x;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("-------------");
		z = ++x + y++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
	}

}
