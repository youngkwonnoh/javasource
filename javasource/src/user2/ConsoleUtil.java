package user2;

import java.util.List;
import java.util.Scanner;

public class ConsoleUtil {
	public UserVO printAddMessage(Scanner sc) {
		UserVO vo = new UserVO();
		System.out.println("username >> ");
		vo.setUserName(sc.nextLine());
		System.out.println("birthYear >> ");
		vo.setBirthYear(sc.nextInt());
		System.out.println("addr >> ");
		vo.setAddr(sc.nextLine());
		System.out.println("mobile >> ");
		vo.setMobile(sc.nextLine());
		return vo;
	}
	
	public void printAddSuccesMessage() {
		System.out.println("입력 성공");
	}
	public void printAddFailMessage() {
		System.out.println("입력 실패");
	}
	
	public int getUser(Scanner sc) {
		System.out.println("조회할 회원 번호 >> ");
		return Integer.parseInt(sc.nextLine());
	}
	
	public void printGetMessage(UserVO vo) {
		System.out.println("\n번호\t이름\t태어난해\t주소\t모바일");
		System.out.print(vo.getNo()+"\t");
		System.out.print(vo.getUserName()+"\t");
		System.out.print(vo.getBirthYear()+"\t");
		System.out.print(vo.getAddr()+"\t");
		System.out.print(vo.getMobile()+"\n");
	}
	
	public void printSelectOneSuccessMessage() {
		System.out.println("조회 성공");
	}
	
	public void printSelectOneFailMessage() {
		System.out.println("조회 성공");
	}
	
	public void printListMessage(List<UserVO> list) {
		for(UserVO vo:list) {
			System.out.println("\n번호\t이름\t태어난해\t주소\t모바일");
			System.out.print(vo.getNo()+"\t");
			System.out.print(vo.getUserName()+"\t");
			System.out.print(vo.getBirthYear()+"\t");
			System.out.print(vo.getAddr()+"\t");
			System.out.print(vo.getMobile()+"\n");
		}
	}
	
	public void printListFailMessage() {
		System.out.println("요청하신 정보가 없습니다.");
	}
	
	public UserVO printUpdateMessage(Scanner sc) {
		UserVO vo = new UserVO();
		
		System.out.println("수정할 회원 번호 >> ");
		vo.setNo(Integer.parseInt(sc.nextLine()));
		System.out.println("수정 주소 >> ");
		vo.setAddr(sc.nextLine());
		System.out.println("수정 전화번호 >> ");
		vo.setMobile(sc.nextLine());
		
		return vo;
	}
	
	public void printUpdateSuccessMessage() {
		System.out.println("수정 성공");
	}
	public void printUpdateFailMessage() {
		System.out.println("수정 실패");
	}
	
	public int printDeleteMessage(Scanner sc) {
		System.out.println("탈퇴할 회원 번호 >> ");
		return Integer.parseInt(sc.nextLine());
	}
	public void printDeleteSuccessMessage() {
		System.out.println("탈퇴 성공");
	}
	public void printDeleteFailMessage() {
		System.out.println("탈퇴 실패");
	}
}
