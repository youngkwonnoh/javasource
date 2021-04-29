package ch2;

public class pencil {
	public static void main(String[] args) {
		// 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나눌 때
		// 학생 당 몇개를 가질 수 있고, 최종적으로 몇개가 남는지 출력하시오
		// 변수명은 임의로 설정 가능
		
		int pencil = 534;
		int student = 30;
		
		int division = pencil / student;
		int EA = pencil % student;
		
		System.out.println("학생 당 연필 갯수 = " + division);
		System.out.println("남은 연필 갯수 = " + EA);
		

		// int pencil = 534, student = 30;
		// System.out.println("학생 당 연필 갯수 = " + (pencil / student);
		// System.out.println("남은 연필 갯수 = " + (pencil % student);

		
	}

}
