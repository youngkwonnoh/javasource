package emp2;

import java.util.Scanner;

public class EmpSelectAction implements Action {
	@Override
	public void execute(Scanner sc) {
		// 사용자에게 조회할 empno 입력받기
		ConsoleUtil util = new ConsoleUtil();
		int empno = util.getEmp(sc);
		
		// empno를 넘겨서 서비스에게 요청하기
		EmpSelectOneService empOne = new EmpSelectOneService();
		// EmpVO vo = empOne.getEmp(empno);
		
		String ename = util.getEmpName(sc);
		EmpVO vo = empOne.getEmp(ename);
		
		// 서비스 요청결과로 받은 vo를 화면 출력해주기
		if(vo!=null) {
			util.printEmp(vo);
		} else {
			util.printFailMessage(empno);
		}
		
	}
}
