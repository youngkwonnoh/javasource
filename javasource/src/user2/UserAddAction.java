package user2;

import java.util.Scanner;

public class UserAddAction implements Action {
	
	@Override
	public void execute(Scanner sc) {
		// 새로운 사용자 정보를 입력받기 => ConsoleUtil
		ConsoleUtil util = new ConsoleUtil();
		UserVO vo = new UserVO();
		
		// 사용자 정보 추가 서비스 요청 => UserAddService
		UserAddService addService = new UserAddService();
		boolean flag = addService.add(vo.getUserName(), vo.getBirthYear(), vo.getAddr(), vo.getMobile());
		
		// 요청 결과에 따라 메세지 출력 => ConsoleUtil
		if(flag) {
			util.printAddSuccesMessage();
		} else {
			util.printAddFailMessage();
		}
	}

}
