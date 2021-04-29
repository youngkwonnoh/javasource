package ch4;

public class ArrayEx6 {
	public static void main(String[] args) {
		// 2차원 배열
		int scores[][] = new int[2][3];
		
		// 1행
		scores[0][0] = 15;
		scores[0][1] = 25;
		scores[0][2] = 35;
		
		// 2행
		scores[1][0] = 45;
		scores[1][1] = 55;
		scores[1][2] = 65;
		
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
			}
			System.out.println();
		}
		
		for(int score[]:scores) {
			for(int j:score) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
		
	}

}