package ch9;

public class CalculatorEx {
	public static void main(String[] args) {
		Calculator adder = new Adder();
		adder.run();
		
		Calculator substracter = new Substracter();
		substracter.run();
	}

}
