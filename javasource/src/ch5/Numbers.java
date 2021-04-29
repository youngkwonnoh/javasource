package ch5;

public class Numbers {
	
	int num[];
	
	public Numbers(int[] num) {
		super();
		this.num = num;
	}

	int getTotal() {
		int total = 0;
		for(int i:num) {
			total += i;
		}
	return total;
	}
	
	int getAverage() {
		return getTotal() / num.length;
	}
	
}
