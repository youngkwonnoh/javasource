package ch4;

public class ArrayEx14 {
	public static void main(String[] args) {
		String data[] = {"abc",  "def", "hijkl"};
		
		for(int i=0; i<data.length; i++ ) {
			// "abc" => chArr[] = {'a', 'b', 'c'}
			char[] chArr = data[i].toCharArray();
			for(int j=0; j<chArr.length; j++) {
				System.out.print(chArr[j] + " ");
			}
			System.out.println();
		}
	}

}