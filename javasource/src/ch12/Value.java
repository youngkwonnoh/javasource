package ch12;

public class Value {
	
	int value;
	
	public Value(int value) {
		this.value = value;
	}
	
	@Override
	public boolean equals(Object obj) {
		Value v = (Value) obj;
		if(this.value == v.value) {
			return true;
		}
		return false;
		
	}
	
	// 내가 원하는대로 출력하도록 만듦
	@Override
	public String toString() {
		// return "value = " + value;
		// String 형태로 변경
		return value + "";
	}
	
	
}
