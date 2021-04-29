package dept2;

import java.util.Scanner;

public class DeptUpdateAction implements Action {

	@Override
	public void execute(Scanner sc) {
		// 수정할 정보를 입력받기 => util
		ConsoleUtil util = new ConsoleUtil();
		DeptVO vo = util.printUpdateMessage(sc);
		
		DeptUpdateService service = new DeptUpdateService();
		boolean result = service.deptUpdate(vo.getLoc(), vo.getDeptno());
		
		if(result) {
			util.printUpdateSuccesMessage();
		} else {
			util.printUpdateFailMessage();
		}
	}

}
