package ch7;

public class CaptionTV extends TV {
	boolean caption;
	
	public CaptionTV() {
		super();
		
		
		
	}
	
	
	
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
	

}
