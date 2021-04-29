package sequence;

import java.util.List;
import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		MemberDAO dao = new MemberDAO();
		
		while(run) {
			System.out.println("-----------------");
			System.out.println("1. 회원 등록");
			System.out.println("2. 회원 조회");
			System.out.println("3. 회원 전체 조회");
			System.out.println("4. 종료");
			System.out.println("-----------------");
			
			System.out.println("메뉴 선택 >> ");
			int menu = Integer.parseInt(sc.nextLine());
			switch(menu) {
			case 1:
				System.out.println("\n회원 등록");
				System.out.println("이름 >> ");
				String userName = sc.nextLine();
				System.out.println(dao.insert(userName)? "회원 등록 성공" : "회원 등록 실패");
				break;
			case 2:
				System.out.println("\n회원 조회");
				System.out.println("조회할 회원 번호 >> ");
				int userNo = Integer.parseInt(sc.nextLine());
				
				System.out.println("번호\t이름");
				MemberVO vo1 = dao.getRow(userNo);
				System.out.println(vo1.getUserNo()+"\t");
				System.out.println(vo1.getUserName());
				break;
			case 3:
				System.out.println("\n회원 전체 정보");
				System.out.println("번호\t이름");
				List<MemberVO> list = dao.getList();
				for(MemberVO vo:list) {
					System.out.print(vo.getUserNo()+"\t");
					System.out.println(vo.getUserName()+"\t");
				}
				break;
			case 4:
				
				break;
			default:
				System.out.println("메뉴 번호를 확인해 주세요");
				break;
			
			}
		}
	}

}
