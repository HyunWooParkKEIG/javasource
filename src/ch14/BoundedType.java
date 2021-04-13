package ch14;

public class BoundedType {
	public static <T extends Number> double compare(T t1, T t2) {
		return (Double)t1 + (Double)t2;
	}
}
