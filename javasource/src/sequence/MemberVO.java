package sequence;

public class MemberVO {
	// 레코드 하나를 처리할 수 있는 구조
	private int userNo;
	private String userName;
	
	public MemberVO() {
		super();
	}
	
	public MemberVO(int userNo, String userName) {
		super();
		this.userNo = userNo;
		this.userName = userName;
	}
	
	public int getUserNo() {
		return userNo;
	}
	
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		return "MemberVO [userNo=" + userNo + ", userName=" + userName + "]";
	}
	
}
