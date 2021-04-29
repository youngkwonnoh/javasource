package dept2;

import java.util.Scanner;

public class DeptMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("1.특정 부서 조회 | 2. 전체 부서 조회 | 3. 부서 입력 | 4. 부서 정보 수정 | 5. 부서 정보 삭제 | 6. 종료");
			System.out.println("-------------------------------------------------------------------------------------");
			
			System.out.println("번호입력 >> ");
			int menu = Integer.parseInt(sc.nextLine());
			
			Action action = null;
			
			switch (menu) {
			case 1:
				action = new DeptGetAction();
				break;
			case 2:
				action = new DeptSelectAction();
				break;
			case 3:
				action = new DeptAddAction();
				break;
			case 4:
				action = new DeptUpdateAction();
				break;
			case 5:
				action = new DeptRemoveAction();
				break;
			case 6:
				run = false;
				break;
			}
			if(action!=null) {
				action.execute(sc);
			}
		}

	}
}
