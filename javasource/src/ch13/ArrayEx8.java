package ch13;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayEx8 {
	public static void main(String[] args) {
		
		Student students[] = new Student[5];
		
		students[0] = new Student("송중기", 78);
		students[1] = new Student("정해원", 98);
		students[2] = new Student("박보검", 88);
		students[3] = new Student("송강호", 65);
		students[4] = new Student("조인성", 83);
		

		// 사용자 정의 클래스를 sort 시킬 때 java.lang.ClassCastException 발생
		// 예외를 막기 위해 Comparable 인터페이스를 구현한다.
		
		Arrays.sort(students, Comparator.reverseOrder());
		
		// Arrays.toString(배열명) => 객체가 가지고 있는 toString의 형태로 리턴시켜준다.
		System.out.println(Arrays.toString(students));
		
		
		
	}

}
