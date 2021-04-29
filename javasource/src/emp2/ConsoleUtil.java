package emp2;

import java.util.List;
import java.util.Scanner;

public class ConsoleUtil {
	// 화면출력과 화면에서 입력받는 부분에 대한 메소드
	public int getEmp(Scanner sc) {
		System.out.println("사원 번호를 입력하세요 : ");
		int empno = Integer.parseInt(sc.nextLine());
		
		return empno;
	}
	
	public void printEmp(EmpVO vo) {
		
			System.out.println("empno : " + vo.getEmpno());
			System.out.println("ename : " + vo.getEname());
			System.out.println("job : " + vo.getJob());
			System.out.println("hiredate : " + vo.getHiredate());
			System.out.println("comm : " + vo.getComm());
			System.out.println("deptno : " + vo.getDeptno());
	}
	public void printFailMessage(int empno) {
		System.out.println(empno + " 사원번호를 확인해 주세요");
	}
	
	public void printListEmp(List<EmpVO> list) {
		for(EmpVO vo1:list) {
			System.out.print("empno : " + vo1.getEmpno() + "\t");
			System.out.print("ename : " + vo1.getEname() + "\t");
			System.out.print("job : " + vo1.getJob() + "\t");
			System.out.print("hiredate : " + vo1.getHiredate() + "\t");
			System.out.print("comm : " + vo1.getComm() + "\t");
			System.out.println("deptno : " + vo1.getDeptno() + "\n");
		}
	}
	
	public void printListFailMessage() {
		System.out.println("가져올 EMP 목록이 없습니다.");
	}
	
	public EmpVO printAddMessage(Scanner sc) {
		System.out.println("\n사원 정보 입력");
		System.out.print("사원 번호 >> ");
		int empno = Integer.parseInt(sc.nextLine());
		System.out.print("사원명 >> ");
		String ename = sc.nextLine();
		System.out.print("직무 >> ");
		String job = sc.nextLine();
		System.out.print("매니저 번호 >> ");
		int mgr = Integer.parseInt(sc.nextLine());
		System.out.print("급여 >> ");
		int sal = Integer.parseInt(sc.nextLine());
		System.out.print("추가 수당 >> ");
		int comm = Integer.parseInt(sc.nextLine());
		System.out.print("부서 번호 >> ");
		int deptno = Integer.parseInt(sc.nextLine());
		
		EmpVO vo1 = new EmpVO();
		vo1.setEmpno(empno);
		vo1.setEname(ename);
		vo1.setJob(job);
		vo1.setMgr(mgr);
		vo1.setSal(sal);
		vo1.setComm(comm);
		vo1.setDeptno(deptno);
		
		return vo1;
	}
	
	public void printAddFailMessage() {
		System.out.println("EMP 사원 추가 실패");
	}
	
	public void printAddSuccessMessage() {
		System.out.println("EMP 사원 추가 성공");
	}
	
	public EmpVO printUpdateMessage(Scanner sc) {
		System.out.println("\n사원 정보 수정");
		System.out.println("수정할 사원 번호 >>");
		int empno = Integer.parseInt(sc.nextLine());
		System.out.println("수정할 추가 수당 >>");
		int comm = Integer.parseInt(sc.nextLine());
		
		EmpVO vo = new EmpVO();
		vo.setEmpno(empno);
		vo.setComm(comm);
		
		return vo;
	}
	
	public void printUpdateFailMessage() {
		System.out.println("EMP 사원 수정 실패");
	}
	public void printUpdateSuccessMessage() {
		System.out.println("EMP 사원 수정 성공");
	}
	
	public EmpVO printRemoveMessage(Scanner sc) {
		System.out.println("\n사원 정보 삭제");
		System.out.print("삭제할 사원 번호 >> ");
		int empno = Integer.parseInt(sc.nextLine());
		System.out.println("삭제할 사원 이름 >> ");
		String ename = sc.nextLine();
		
		EmpVO vo = new EmpVO();
		vo.setEmpno(empno);
		vo.setEname(ename);
		
		return vo;
	}
	
	public void printRemoveFailMessage() {
		System.out.println("EMP 사원 탈퇴 실패");
	}
	public void printRemoveSuccessMessage() {
		System.out.println("EMP 사원 탈퇴 성공");
	}
}
