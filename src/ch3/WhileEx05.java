package ch3;

import java.io.IOException;

public class WhileEx05 {

	public static void main(String[] args) throws IOException{
		boolean run = true;
		int speed = 0, keyCode = 0 ; 
		
		while (run) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("choose");
			}
			keyCode = System.in.read();
			
			if (keyCode == 49) {
				speed++;
				System.out.println(speed);
			} else if (keyCode == 50) {
				speed--;
				System.out.println(speed);
			} else if (keyCode == 51) {
				run = false;
			}
			
			
		}
		System.out.println("end");
	}

}
