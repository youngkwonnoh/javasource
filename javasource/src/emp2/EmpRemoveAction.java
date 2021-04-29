package emp2;

import java.util.Scanner;

public class EmpRemoveAction implements Action {

	@Override
	public void execute(Scanner sc) {
		// 탈퇴를 위한 회원정보 받기 => util
		
		ConsoleUtil util = new ConsoleUtil();
		EmpVO vo = util.printRemoveMessage(sc);
		
		EmpDeleteService deleteService = new EmpDeleteService();
		boolean isDelete = deleteService.empDelete(vo.getEmpno(), vo.getEname());
		
		if(isDelete) {
			util.printRemoveSuccessMessage();
		} else {
			util.printRemoveFailMessage();
		}

	}

}
