package ch7;

public class ComputerEx {
	public static void main(String[] args) {
		
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("Calculator 원 면적 : " + calculator.areaCircle(r));
		
		
		Computer computer = new Computer();
		System.out.println("Calculator 원 면적 : " + computer.areaCircle(r));
	}

}
