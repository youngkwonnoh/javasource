package user2;

import java.util.Scanner;

public class UserDeleteAction implements Action {
	@Override
	public void execute(Scanner sc) {
		// 탈퇴할 인원 조회
		ConsoleUtil util = new ConsoleUtil();
		int no = util.printDeleteMessage(sc);
		// 탈퇴할 인원 없애기
		UserDeleteService delete = new UserDeleteService();
		boolean result = delete.removeUser(no);
		if(result) {
			util.printDeleteSuccessMessage();
		} else {
			util.printDeleteFailMessage();
		}
//		if(delete.removeUser(no)) {
//			util.printDeleteSuccessMessage();
//		} else {
//			util.printDeleteFailMessage();
//		}
	}

}
