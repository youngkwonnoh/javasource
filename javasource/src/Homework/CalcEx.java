package Homework;

import java.util.Scanner;

public class CalcEx {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int result = 0;
		
		System.out.print("Input Num 1 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("Input Num 2 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		System.out.print("Input Operator : ");
		String str = sc.nextLine();
		
		Calc calc = null;
		switch(str) {
		
		case "+":
			calc = new Add();
			break;
		case "-":
			calc = new Sub();
			break;
		case "*":
			calc = new Mul();
			break;
		case "/":
			calc = new Div();
			break;
		}
		
		calc.setValue(num1, num2);
		System.out.println(calc.calculate());
		}
}

