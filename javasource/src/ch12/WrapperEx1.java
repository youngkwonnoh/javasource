package ch12;

import java.util.Scanner;

public class WrapperEx1 {
	public static void main(String[] args) {
		
		// 기본타입 - int,     byte, short, long, char,      float, double, boolean
		// 참조타입 - Integer, Byte, Short, Long, Character, Float, Double, Boolean
		
		// Integer i = new Integer(10);
		
		int val = 10;
		
		Integer i = Integer.valueOf(val); // String.valueOf(10.4)
		Integer i2 = Integer.valueOf("10"); // String.valueOf(10.4)
		
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt("10");
		
		double d = Double.parseDouble("3.141592");
		
		Character c = Character.valueOf('c');
		
		Boolean b = Boolean.valueOf("ture");
		
		Integer i3 = 10; // auto boxing
		int val2 = i3; // auto boxing
		
	}

}
