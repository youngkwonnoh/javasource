package dept2;

import java.util.List;
import java.util.Scanner;

public class ConsoleUtil {
	public int deptGet(Scanner sc) {
		// 부서번호를 입력 받기
		System.out.println("부서 번호 입력 >> ");
		return Integer.parseInt(sc.nextLine());
//		int deptno = Integer.parseInt(sc.nextLine());
//		return deptno;
	}
	
	// vo 내용을 출력하는 메소드
	public void printGetMessage(DeptVO vo) {
		System.out.print("deptno\tdname\tloc\n");
		System.out.print(vo.getDeptno() + "\t");
		System.out.print(vo.getDname() + "\t");
		System.out.print(vo.getLoc() + "\n");
	}
	
	// vo가 null일 때 출력하는 메소드
	public void printGetFailMessage(int deptno) {
		System.out.println(deptno + "부서번호를 확인해주세요");
	}
	
	// list 비어 있을 때 출력
	public void printListFailMessage() {
		System.out.println("조회할 내용이 없음");
	}
	// list 내용이 있을 때 출력
	public void printListSuccessMessage(List<DeptVO> list) {
		for(DeptVO vo1:list) {
			System.out.print(vo1.getDeptno() + "\t");
			System.out.print(vo1.getDname() + "\t");
			System.out.print(vo1.getLoc() + "\n");
		}
	}
	
	public DeptVO printAddMessage(Scanner sc) {
		System.out.println("\n부서 정보 입력");
		System.out.print("부서번호 >> ");
		int deptno = Integer.parseInt(sc.nextLine()); 
		System.out.print("부서명 >> ");
		String dname = sc.nextLine(); 
		System.out.print("부서위치 >> ");
		String loc = sc.nextLine(); 
		
		DeptVO vo = new DeptVO();
		vo.setDeptno(deptno);
		vo.setDname(dname);
		vo.setLoc(loc);
		
		return vo;
		
//		DeptVO vo1 = new DeptVO();
//		System.out.println("\n부서 정보 입력");
//		
//		System.out.print("부서번호 >> ");
//		vo1.setDeptno(Integer.parseInt(sc.nextLine()));
//		
//		System.out.print("부서명 >> ");
//		vo1.setDname(sc.nextLine());
//		
//		System.out.print("부서위치 >> ");
//		vo1.setLoc(sc.nextLine()); 
//		
//		return vo1;
		
	}
	
	public void printAddSuccessMessage() {
			System.out.println("부서 입력 성공");
	}
	public void printAddFailMessage() {
		System.out.println("부서 입력 실패");
	}
	
	public DeptVO printUpdateMessage(Scanner sc) {
//		System.out.println("\n부서 정보 수정");
//		System.out.print("수정할 부서 번호 입력 >> ");
//		int deptno = Integer.parseInt(sc.nextLine());
//		System.out.println("수정할 지역명 입력 >> ");
//		String loc = sc.nextLine();
//		
//		// 객체 생성
//		DeptVO vo = new DeptVO();
//		vo.setDeptno(deptno);
//		vo.setLoc(loc);
		
		DeptVO vo = new DeptVO();
		System.out.println("\n부서 정보 수정");
		System.out.print("수정할 부서 번호 입력 >> ");
		vo.setDeptno(Integer.parseInt(sc.nextLine()));
		System.out.println("수정할 지역명 입력 >> ");
		vo.setLoc(sc.nextLine());
		return vo;
	}
	
	
	public void printUpdateSuccesMessage() {
		System.out.println("수정 성공");
	}
	public void printUpdateFailMessage() {
		System.out.println("수정 실패");
	}
	
	
	public int printRemoveMessage(Scanner sc) {
		System.out.println("\n부서 정보 삭제");
		System.out.print("삭제할 부서 번호 입력 >> ");
		return Integer.parseInt(sc.nextLine());
		
	}
	
	public void printRemoveSuccesMessage() {
		System.out.println("삭제 성공");
	}
	public void printRemoveFailMessage() {
		System.out.println("삭제 실패");
	}
	
	
	
	
}
