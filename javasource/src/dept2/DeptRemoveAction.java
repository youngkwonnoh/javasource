package dept2;

import java.util.Scanner;

public class DeptRemoveAction implements Action {

	@Override
	public void execute(Scanner sc) {
		// 삭제할 부서정보 입력받기 => null
		ConsoleUtil util = new ConsoleUtil();
		int deptno = util.printRemoveMessage(sc);
		// 부서 삭제 서비스 요청
		DeptDeleteService service = new DeptDeleteService();
		boolean result = service.deptDelete(deptno);
		// 결과에 따라 메세지 출력
		if(result) {
			util.printRemoveSuccesMessage();
		} else {
			util.printRemoveFailMessage();
		}
	}

}
