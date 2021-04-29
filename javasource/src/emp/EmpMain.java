package emp;

import java.util.List;
import java.util.Scanner;

public class EmpMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("1.특정 사원 조회 | 2. 전체 사원 조회 | 3. 사원 입력 | 4. 사원 정보 수정 | 5. 사원 정보 삭제 | 6. 종료");
			System.out.println("--------------------------------------------------------------------------------------");
			
			System.out.println("번호입력 >> ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 1:
				System.out.println("사원 번호를 입력하세요 : ");
				int empno = Integer.parseInt(sc.nextLine()); // 7521 or 7566 ~~
				EmpSelectOneService empOne = new EmpSelectOneService();
				EmpVO vo = empOne.getEmp(empno);
				if(vo != null) {
					System.out.println("empno : " + vo.getEmpno());
					System.out.println("ename : " + vo.getEname());
					System.out.println("job : " + vo.getJob());
					System.out.println("hiredate : " + vo.getHiredate());
					System.out.println("comm : " + vo.getComm());
					System.out.println("deptno : " + vo.getDeptno());
				} else {
					System.out.println("사원 번호를 확인해 주세요");
				}
				break;
				
			case 2:
				// emp 테이블 전체 내용 출력
				EmpSelectService empService = new EmpSelectService();
				List<EmpVO> list = empService.getEmpList();
				
				for(EmpVO vo1:list) {
					System.out.print("empno : " + vo1.getEmpno() + "\t");
					System.out.print("ename : " + vo1.getEname() + "\t");
					System.out.print("job : " + vo1.getJob() + "\t");
					System.out.print("hiredate : " + vo1.getHiredate() + "\t");
					System.out.print("comm : " + vo1.getComm() + "\t");
					System.out.println("deptno : " + vo1.getDeptno() + "\n");
				}
				break;
				
			case 3:
				System.out.println("\n사원 정보 입력");
				System.out.print("사원 번호 >>");
				empno = Integer.parseInt(sc.nextLine());
				System.out.print("사원명 >>");
				String ename = sc.nextLine();
				System.out.print("직무 >>");
				String job = sc.nextLine();
				System.out.print("매니저 번호 >>");
				int mgr = Integer.parseInt(sc.nextLine());
				System.out.print("급여 >>");
				int sal = Integer.parseInt(sc.nextLine());
				System.out.print("추가 수당 >>");
				int comm = Integer.parseInt(sc.nextLine());
				System.out.print("부서 번호 >>");
				int deptno = Integer.parseInt(sc.nextLine());
				
				EmpVO vo1 = new EmpVO();
				vo1.setEmpno(empno);
				vo1.setEname(ename);
				vo1.setJob(job);
				vo1.setMgr(mgr);
				vo1.setSal(sal);
				vo1.setComm(comm);
				vo1.setDeptno(deptno);
				
				EmpInsertService insertService = new EmpInsertService();
				boolean isInsert = insertService.empInsert(vo1);
				System.out.println(isInsert ? "입력 성공":"입력 실패");
				break;
			
			case 4: // empno, comm(수정)
				System.out.println("\n사원 정보 수정");
				System.out.println("수정할 사원 번호 >>");
				empno = Integer.parseInt(sc.nextLine());
				System.out.println("수정할 추가 수당 >>");
				comm = Integer.parseInt(sc.nextLine());
				
				EmpUpdateService updateService = new EmpUpdateService();
				boolean isUpdate = updateService.empUpdate(comm, empno);
				System.out.println(isUpdate ? "수정 성공" : "수정 실패");
				break;
				
			case 5:
				System.out.println("\n사원 정보 삭제");
				System.out.print("삭제할 사원 번호 >> ");
				empno = Integer.parseInt(sc.nextLine());
				System.out.println("삭제할 사원 이름 >> ");
				ename = sc.nextLine();
				
				EmpDeleteService deleteService = new EmpDeleteService();
				boolean isDelete = deleteService.empDelete(empno, ename);
				
				System.out.println(isDelete ? "삭제 성공" : "삭제 실패");
				break;
				
			case 6:
				run = false;
				break;

			default:
				System.out.println("번호를 확인해 주세요");
				break;
			}
			
		}
		
	}

}
