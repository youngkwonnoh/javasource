package ch5;
public class SubscriberInfo {
	// 가입자 정보 클래스
	// 속성 - 이름(홍길동), 아이디(hong123), 패스워드(HON123@@#@), 전화번호(01012345678), 주소(서울시 구로구)
	
	String name;
	String id;
	String password;
	String tel;
	String addr;
	
	
	// 기본 생성자
	public SubscriberInfo() {
	}
	// 이름, 아이디, 패스워드만 초기화하는 생성자

	public SubscriberInfo(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}
	
		
	// 전체 속성 초기화하는 생성자
	public SubscriberInfo(String name, String id, String password, String tel, String addr) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.tel = tel;
		this.addr = addr;
	}
	
	
	// 기능 - 비밀번호 변경 / 전화번호 등록 / 주소 등록
	
	// 비밀번호 변경(changPwd) - 변경할 비밀번호 매개변수 받기, 리턴타입 없음
	// 전화번호 등록(setTel) - 등록할 전화번호 매개변수 받기, 리턴타입 없음
	// 주소 등록(setAddr) - 등록할 주소 매개변수 받기, 리턴타입 없음
	
	void changePwd(String password) {
		this.password = password; 
	}
	void setTel(String tel) {
		this.tel = tel; 
	}
	void setAddr(String addr) {
		this.addr = addr; 
	}
	
	
}
