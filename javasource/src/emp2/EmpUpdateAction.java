package emp2;

import java.util.Scanner;

import emp.EmpUpdateService;

public class EmpUpdateAction implements Action {

	@Override
	public void execute(Scanner sc) {
		// 업데이트를 위한 정보 받기 =>
		ConsoleUtil util = new ConsoleUtil();
		EmpVO vo = util.printUpdateMessage(sc);
		
		EmpUpdateService updateService = new EmpUpdateService();
		boolean isUpdate = updateService.empUpdate(vo.getComm(), vo.getEmpno());
		
		if(isUpdate) {
			util.printUpdateSuccessMessage();
		} else {
			util.printUpdateFailMessage();
		}
		
	}

}
