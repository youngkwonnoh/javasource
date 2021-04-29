package shop;

public class User {
	
	private String name;
	private PayType paytype;

	public User(String name, PayType paytype) {
		super();
		this.name = name;
		this.paytype = paytype;
		
	}
	
	public String getName() {
		return name;
	}

	public PayType getPaytype() {
		return paytype;
	}
	
	
}
