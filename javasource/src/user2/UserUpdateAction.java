package user2;

import java.util.Scanner;

public class UserUpdateAction implements Action {
	@Override
	public void execute(Scanner sc) {
		// 수정할 부서 받아오기
		ConsoleUtil util = new ConsoleUtil();
		UserVO vo = util.printUpdateMessage(sc);
		// 부서 수정
		UserUpdateService updateService = new UserUpdateService();
		boolean result = updateService.updateUser(vo.getMobile(), vo.getAddr(), vo.getNo());
		// 부서 수정 성공 여부
		if(result) {
			util.printUpdateSuccessMessage();
		} else {
			util.printUpdateFailMessage();
		}
		
	}

}
