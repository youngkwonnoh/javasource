package shop;
public class SmartTV extends Product {
	
	// 해상도
	private String resolution;
	
	public SmartTV(String pname, int price, String resolution) {
		super(pname, price);
		this.resolution = resolution;
	}


	@Override
	void printExtra() {
		System.out.println("해상도 : " + resolution);

	}

}
