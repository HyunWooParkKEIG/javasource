package ch5;

public class AccumulatorEx {

	public static void main(String[] args) {
		Accumulator acc1 = new Accumulator();
		acc1.accumulate(10);

		Accumulator acc2 = new Accumulator();
		acc1.accumulate(200);
	
		System.out.println(acc1.total + " " + Accumulator.grandTotal);;
		System.out.println(acc2.total + " " + Accumulator.grandTotal);;
	}

}
