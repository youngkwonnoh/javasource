package ch11;

public class NemberException {
	public static void main(String[] args) {
		
		String data1 = "100";
		String data2 = "100a";

		
		// Integer.parseIne("100") => money;
		int value1 = Integer.parseInt(data1);
		
		int value2 = Integer.parseInt(data2);
		
		
		System.out.println(value1 + value2);
		
		
	}
}
