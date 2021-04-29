package ch12;

public class Member {
	
	private String id;
	
	public Member(String id) {
		super();
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		Member member = (Member) obj;
		
		if(this.id.equals(member.id)) {
			return true;
		}
		
		return false;
		
		
	}
	
	
}
