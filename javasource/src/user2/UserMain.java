package user2;

import java.util.Scanner;


public class UserMain {
	public static void main(String[] args) {
		boolean isStop = true;
		Scanner sc = new Scanner(System.in);
		UserVO vo = new UserVO();
		int no = 0;
		
		
		while(isStop) {

			System.out.println("==== 회원 관리 프로그램 ====");
			System.out.println("1. 회원등록");
			System.out.println("2. 특정 회원 조회");
			System.out.println("3. 전체 회원 조회");
			System.out.println("4. 회원 수정");
			System.out.println("5. 회원 탈퇴");
			System.out.println("6. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			int menu = Integer.parseInt(sc.nextLine());
			
			Action action = null;
			
			switch(menu) {
			case 1:
				action = new UserAddAction();
				break;
			case 2:
				action = new UserSelectOneAction();
				break;
			case 3:
				action = new UserListAction();
				break;
			case 4:
				action = new UserUpdateAction();
				break;
			case 5:
				action = new UserDeleteAction();
				break;
			case 6:
				isStop = false;
				break;
			}
			if(action!=null) {
				action.execute(sc);
			}
		}
	}

}
