package Homework;

public class Won2Dollar extends Converter {

	@Override
	protected double convert(double src) {
		double val = src/1200;
		return val;
		
		// return src/1200;
	}

	@Override
	protected String getSrcString() {
		String str = "원";
		return str;
		// return "원";
	}

	@Override
	protected String getDestString() {
		String str = "달러";
		return str;
		// return "달러";
	}

}
