package user2;

import java.util.Scanner;

public class UserSelectOneAction implements Action {
	@Override
	public void execute(Scanner sc) {
		// 조회할 회원 정보 입력받기
		ConsoleUtil util = new ConsoleUtil();
		int no = util.getUser(sc);
		// 특정 회원 정보 조회 요청
		UserSelectOneService one = new UserSelectOneService();
		UserVO vo = one.getUser(no);
		// 요청받은 후 결과 조회
		util.printGetMessage(vo);
	}
}
