package Member;

import java.util.Scanner;

public class MemberConsoleUtil {
	
	
	Member getNewmember(Scanner sc) {
		// 사옹자로부터 회원 정보를 입력박은 후 입력받은 회원을 리턴
		System.out.println("등록할 회원 정보를 입력하세요");
		System.out.print("아이디 : ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("주소 : ");
		String addr = sc.nextLine();
		
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		
		System.out.print("국가 : ");
		String nation = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = Integer.parseInt(sc.nextLine());
		
		// 6개의 데이터 => 1개의 객체(Member) => 객체 생성
		return new Member(id, name, addr, email, nation, age);
	}
	
	void printAddSuccessMessage(Member newMember) {
		System.out.println(newMember.getName() + " 회원 정보 추가 성공");
		
	}
	
	void printModifySuccessMessage(Member updateMember) {
		System.out.println(updateMember.getName() + " 회원 정보 수정 성공");
	}
	
	void printModifyFailMessage(Member updateMember) {
		System.out.println(updateMember.getName() + " 회원 정보 수정 실패");
		
	}
	
	void printRemoveFailMessage() {
		System.out.println("회원 정보 삭제 실패");
	}
	
	void printRemoveSuccessMessage() {
		System.out.println("회원 정보 삭제 실패");
	}
	
	void printMemberList(Member[] members) {
		System.out.println("회원아이디\t이름\t 주소\t이메일\t\t국가\t나이");
		for(Member member:members) {
			if(member != null) {
				System.out.printf("%5d", member.getId());
				System.out.printf("%7s", member.getName());
				System.out.printf("%8s", member.getAddr());
				System.out.printf("%18s", member.getEmail());
				System.out.printf("%6s", member.getNation());
				System.out.printf("%8d\n", member.getAge());
			}
		}
	}
	
	Member getUpdateMember(Scanner sc, Member[] memArr) {
		System.out.println();
		System.out.println("수정할 외원의 아이디를 입력하세요 ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("수정할 주소를 입렵하세요");
		String addr = sc.nextLine();
		System.out.println("수정할 이메일을 입렵하세요");
		String email = sc.nextLine();
			
		// 수정 => 회원 아이디가 같은 member 찾기
		//     => 주소, 이메일, => setter 메소드 이용
		
		// new Member(id, name, addr, nation, email, age)
		// ① 생성자 호출
		for(Member member:memArr) {
			if(member.getId() == id) {
				member.setAddr(addr);
				member.setEmail(email);
				// 수정된 Member 리턴
				return member;
			}
		}
		return null;
	}
	
	Member removeMember(Scanner sc, Member[] members) {
		// 동일한 아이디 찾아서 삭제
		System.out.println();
		System.out.print("삭제할 회원의 아이디를 입력하세요 ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("정말로 삭제하시겠습니까? 예(1) 아니오(2)");
		int no = Integer.parseInt(sc.nextLine());
		
		Member deleteMember = null;
		if(no == 1) {
			for(int i=0; i<members.length; i++) {
				if(members[i].getId() == id) {
					deleteMember = members[i];
					members[i] = null;
					// 삭제된 Member 리턴
					return deleteMember;
				}
			}
		}
		return null;
	}
	
	
}
