package emp2;

import java.util.List;
import java.util.Scanner;

public class EmpListAction implements Action {
	// Service 호출
	@Override
	public void execute(Scanner sc) {
		EmpSelectService empService = new EmpSelectService();
		List<EmpVO> list = empService.getEmpList();
		
		// 받은 리스트를 화면 출력 = util 부탁
		ConsoleUtil util = new ConsoleUtil();
		if(!list.isEmpty()) {
			util.printListEmp(list);
		} else {
			util.printListFailMessage();
		}
		
	}
	
}
