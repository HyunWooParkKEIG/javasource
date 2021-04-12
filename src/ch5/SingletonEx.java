package ch5;

public class SingletonEx {

	public static void main(String[] args) {
		Singleton single1 = Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();
		Singleton single3 = Singleton.getInstance();
		Singleton single4 = Singleton.getInstance();
		
		System.out.println(single1 == single2);
		System.out.println(single3 == single4);
		System.out.println(single1 == single3);
		System.out.println(single2 == single4);
	}

}
