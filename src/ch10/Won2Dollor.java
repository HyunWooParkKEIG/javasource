package ch10;

public class Won2Dollor extends Converter {
	
	public Won2Dollor() {
		super();
	}
	
	@Override
	protected double convert(double src) {
		ratio = 1 / 1200;
		return src * ratio;
	}

	@Override
	protected String getSrcString() {
		return "원";
	}

	@Override
	protected String getDestString() {
		return "달러";
	}

}
