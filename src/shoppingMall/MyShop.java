package shoppingMall;

import java.util.Scanner;

public class MyShop implements IShop {
	Scanner sc = new Scanner(System.in);
	private String title;
	private Product[] carts = new Product[5];
	private Product[] products = new Product[5];
	private User[] users = new User[2];
	private String selUser;
	
	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		users[0] = new User("홍길동", PayType.CARD);
		users[1] = new User("박현우", PayType.CASH);
	}

	@Override
	public void genProduct() {
		// 제품 생성
//		CellPhone[] phones = new CellPhone[3];
//		CellPhone cellphone1 = new CellPhone("갤럭시", 1000000, "SKT");
//		CellPhone cellphone2 = new CellPhone("갤럭시", 1000000, "SKT");
//		CellPhone cellphone3 = new CellPhone("갤럭시", 1000000, "SKT");
//		phones[0]=cellphone1;
//		phones[1]=cellphone2;
//		phones[2]=cellphone3;
//		
//		SmartTV[] tv = new SmartTV[2];
//		SmartTV smartTV1 = new SmartTV("삼성울트라HD",2500000, "4K");
//		SmartTV smartTV2 = new SmartTV("삼성울트라HD",2500000, "4K");
//		tv[0]=smartTV1;
//		tv[1]=smartTV2;
		
		
//		Product pro1 = new CellPhone("갤럭시", 1000000, "SKT");
//		Product pro2 = new CellPhone("갤럭시", 1000000, "SKT");
//		Product pro3 = new CellPhone("갤럭시", 1000000, "SKT");
//		Product pro4 = new SmartTV("삼성울트라HD",2500000, "4K");
//		Product pro5 = new SmartTV("삼성울트라HD",2500000, "4K");
		products[0] = new CellPhone("갤럭시", 1000000, "SKT");
		products[1] = new CellPhone("LGX-500", 800000, "KT");
		products[2] = new CellPhone("아이폰12", 1200000, "LG");
		products[3] = new SmartTV("삼성울트라HD",2500000, "4K");
		products[4] = new SmartTV("LG스마트",1400000, "1080p");
	}

	@Override
	public void start() {
		System.out.println(this.title + ": 메인화면 - 계정 선택");
		System.out.println("=========================");
		
		for (int i = 0; i < users.length; i++) {
			System.out.println("["+i+"]" + users[i].getName() + "("+users[i].payType+")");
		}
		
		System.out.println("[x]"+ "종 료");
		System.out.print("선택 : ");
		String select = sc.nextLine();
		
		switch (select){
		case "0": case "1":
			System.out.println("## " + select + "선택 ##");
			selUser = select;
			productList();
			break;
		case "X": case "x":
			System.out.println(this.title + "을 종료합니다.");

		default:
			System.out.println("\n메뉴를 확인해 주세요.\n");
			start();
			break;
		}
		
	}
	
	public void productList() {
		System.out.println("\n" + this.title + ": 상품 목록 - 상품 선택");
		System.out.println("=========================");
		
		for (int i = 0; i < products.length; i++) {
			System.out.print("["+i+"]");
			products[i].printDetail();
		}
		
		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃");
		System.out.print("선택 : ");
		
		String select = sc.nextLine();
		
		switch (select) {
		case "h": case "H":
			start();
			break;
		case "c": case "C":
			checkOut();
			break;
		case "0": case "1": case "2": case "3": case "4":
			//System.out.println("cart check");
			for (int i = 0; i < carts.length; i++) {
				if (carts[i] == null) {
					carts[i] = products[Integer.parseInt(select)];
					//System.out.println(carts[i]);
					break;
				}
			}
			productList();
			break;
		default:
			System.out.println("\n번호를 확인해 주세요\n");
			productList();
			break;
		}
	}
	
	public void checkOut() {
		System.out.println("\n" + this.title + ": 체크아웃");
		System.out.println("=========================");
		
		System.out.println(carts[0]);
		for (int i = 0; i < carts.length; i++) {
			if (carts[i] != null) {
				System.out.print("["+i+"]");
				carts[i].printDetail();
			}
		}
		
		System.out.println("=========================");
		System.out.println("결제 방법 : " + users[Integer.parseInt(selUser)].payType);
		System.out.print("합계 : ");
		
		int sum = 0;
		for (int i = 0; i < carts.length; i++) {
			if (carts[i] != null) {
				sum += carts[i].getPrice();
			}
		}
		
		System.out.println(sum + " 원 입니다." );
		System.out.print("[p]이전, [q]결제 완료\n선택 :");
		
		String input = sc.nextLine();
		switch (input) {
		case "p": case "P":
			productList();
			break;
		case "q": case "Q":
			System.out.println("결제가 완료 되었습니다.");
		default:
			System.out.println("\n문자를 확인해 주세요\n");
			checkOut();
			break;
		}
	}

}
