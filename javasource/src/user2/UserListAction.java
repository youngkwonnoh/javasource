package user2;

import java.util.List;
import java.util.Scanner;

public class UserListAction implements Action {
	@Override
	public void execute(Scanner sc) {
		UserSelectAllService service = new UserSelectAllService();
		List<UserVO> list = service.listAll();
		// 조회할 전체 부서 불러오기
		ConsoleUtil util = new ConsoleUtil();
		if(list.isEmpty()) {
			util.printListFailMessage();
		} else {
			util.printListMessage(list);
		}
	}
}
