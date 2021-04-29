package ch13;

import java.util.ArrayList;
import java.util.List;

public class ListEx4 {
	public static void main(String[] args) {
		Member member1 = new Member("hong12", "hong123");
		Member member2 = new Member("kong12", "kong123");
		Member member3 = new Member("jong12", "jong123");
		Member member4 = new Member("gong12", "gong123");
		
		
		List<Member> members = new ArrayList<Member>();
		
		members.add(member1);
		members.add(member2);
		members.add(member3);
		members.add(member4);
		
		// System.out.println(members);
		
		for(int i=0; i<members.size(); i++) {
			System.out.println("아이디 : " + members.get(i).getId());
			System.out.println("비밀번호 : " + members.get(i).getPassword());
			System.out.println();
		}
		
		for(int i=0; i<members.size(); i++) {
			Member member = members.get(i);
			System.out.println("아이디 : " + member.getId());
			System.out.println("비밀번호 : " + member.getPassword());
			System.out.println();
		}
		
		// 향상된 for문
		for(Member member:members) {
			System.out.println("아이디 : " + member.getId());
			System.out.println("비밀번호 : " + member.getPassword());
			System.out.println();
		}
		
	}

}
