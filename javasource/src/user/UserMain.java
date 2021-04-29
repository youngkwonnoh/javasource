package user;

import java.util.List;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		boolean isStop = true;
		Scanner sc = new Scanner(System.in);
		UserVO vo = new UserVO();
		int no = 0;
		
		while(isStop) {
			System.out.println("==== 회원 관리 프로그램 ====");
			System.out.println("1. 회원등록");
			System.out.println("2. 특정 회원 조회");
			System.out.println("3. 전체 회원 조회");
			System.out.println("4. 회원 수정");
			System.out.println("5. 회원 탈퇴");
			System.out.println("6. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1:
				System.out.println("username >> ");
				String userName = sc.nextLine();
				System.out.println("birthYear >> ");
				int birthYear = Integer.parseInt(sc.nextLine());
				System.out.println("addr >> ");
				String addr = sc.nextLine();
				System.out.println("mobile >> ");
				String mobile = sc.nextLine();
				
				vo.setUserName(userName);
				vo.setBirthYear(birthYear);
				vo.setAddr(addr);
				vo.setMobile(mobile);
				
				UserAddService addService = new UserAddService();
				boolean flag = addService.add(userName, birthYear, addr, mobile);
				System.out.println(flag ? "입력 성공" : "입력 실패");
				
				break;
			case 2:
				System.out.println("조회할 회원 번호 >> ");
				no = Integer.parseInt(sc.nextLine());
				
				UserSelectOneService one = new UserSelectOneService();
				vo = one.getUser(no);
				System.out.println("\n번호\t이름\t태어난해\t주소\t모바일");
				System.out.print(vo.getNo()+"\t");
				System.out.print(vo.getUserName()+"\t");
				System.out.print(vo.getBirthYear()+"\t");
				System.out.print(vo.getAddr()+"\t");
				System.out.print(vo.getMobile()+"\n");
				break;
				
			case 3:
				UserSelectAllService allService = new UserSelectAllService();
				List<UserVO> list = allService.listAll();
				for(UserVO vo1:list) {
					System.out.print(vo1.getNo()+"\t");
					System.out.print(vo1.getUserName()+"\t");
					System.out.print(vo1.getBirthYear()+"\t");
					System.out.print(vo1.getAddr()+"\t");
					System.out.print(vo1.getMobile()+"\n");
				}
				break;
			case 4:
				System.out.println("수정할 회원 번호 >> ");
				no = Integer.parseInt(sc.nextLine());
				System.out.println("수정 주소 >> ");
				addr = sc.nextLine();
				System.out.println("수정 전화번호 >> ");
				mobile = sc.nextLine();
				
				UserUpdateService updateService = new UserUpdateService();
				boolean result = updateService.updateUser(mobile, addr, no);
				System.out.println(result?"수정 성공" : "수정 실패");
				break;
			case 5:
				System.out.println("탈퇴할 회원 번호 >> ");
				no = Integer.parseInt(sc.nextLine());
				UserDeleteService delete = new UserDeleteService();
				System.out.println(delete.removeUser(no)? "탈퇴 성공" : "탈퇴 실패");
				break;
			case 6:
				System.out.println("프로그램 종료");
				isStop = false;
				break;
			}
		}
		
	}

}
