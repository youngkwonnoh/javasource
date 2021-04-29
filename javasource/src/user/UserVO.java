package user;

public class UserVO {
//	no NUMBER(4),
//	username varchar2,
//	birthYear number(4),
//	addr varchar2(15),
//	mobile varchar2(12)
	
	private int no;
	private String userName;
	private int birthYear;
	private String addr;
	private String mobile;
	
	public UserVO() {
		super();
	}

	public UserVO(int no, String userName, int birthYear, String addr, String mobile) {
		super();
		this.no = no;
		this.userName = userName;
		this.birthYear = birthYear;
		this.addr = addr;
		this.mobile = mobile;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "UserVO [no=" + no + ", userName=" + userName + ", birthYear=" + birthYear + ", addr=" + addr
				+ ", mobile=" + mobile + "]";
	}
	
}
