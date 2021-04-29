package dept2;

import java.util.List;
import java.util.Scanner;

public class DeptSelectAction implements Action {

	@Override
	public void execute(Scanner sc) {
		// 부서 정보를 모두 조회하는 서비스 요청
		DeptSelectService service = new DeptSelectService();
		List<DeptVO> list = service.getList();
		
		// 요청 결과에 따라 적절하게 출력
		ConsoleUtil util = new ConsoleUtil();
		if(list.isEmpty()) { // 출력x
			util.printListFailMessage();
		} else {
			util.printListSuccessMessage(list);
		}
			
	}

}
