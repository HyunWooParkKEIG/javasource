package ch5;

import java.util.Scanner;

public class BoardEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Board[] bds = new Board[3];
		
		for(int i = 0; i < bds.length; i++) {
			int id = Integer.parseInt(sc.nextLine());
			String title = sc.nextLine();
			String user = sc.nextLine();
			String body = sc.nextLine();
			
			bds[i] = new Board(id, title, user, body);
		}
		
		for(Board bd : bds) {
			System.out.println(bd.id + ":" + bd.title + ":" + bd.user + ":" + bd.body);
		}
	}

}
