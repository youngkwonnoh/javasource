package ch4;

public class ArrayEx12 {
	public static void main(String[] args) {
		int oldArray[] = {10, 20, 30};
		
		// int newArray[] = new int[oldArray.length];
		int newArray[] = new int[5];
		// oldArray => newArray copy
		// System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		System.arraycopy(oldArray, 0, newArray, 1, oldArray.length);
		
		for(int i:newArray) {
			System.out.print(i + "\t");
		}
		
	}

}