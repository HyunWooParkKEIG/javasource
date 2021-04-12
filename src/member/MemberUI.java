package member;

import java.util.Scanner;

public class MemberUI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberConsoleUtil util = new MemberConsoleUtil();
		Member[] members = new Member[3];
		
		boolean flag = true;
		
		while (flag) {
			System.out.println("==== 회원관리 프로그램 ====");
			System.out.println("1. 회원등록");
			System.out.println("2. 회원목록보기");
			System.out.println("3. 회원정보수정");
			System.out.println("4. 회원정보삭제");
			System.out.println("5. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			
			int selectNum = Integer.parseInt(sc.nextLine());
			
			switch (selectNum) {
			case 1:
				Member nM = util.getNewMember(sc);
				
				for (int i = 0; i < members.length; i++) {
					if (members[i] == null) {
						members[i] = nM;
						util.printAddSuccessMessage(nM);
						break;
					}
				}
				break;
			case 2:
				util.printMemberList(members);
				break;
			case 3:
				Member updateMember = util.getUpdateMember(sc, members);
				
				if (updateMember != null) {
					util.printModifySuccessMessage(updateMember);
				} else {
					util.printModifyFailMessage();
				}
				
				break;
			case 4:
				Member removeMember = util.removeMember(sc, members);
				
				if (removeMember != null) {
					util.printRemoveSuccessMessage(removeMember);
				} else {
					util.printRemoveFailMessage();
				}
				break;
			case 5:
				flag = false;
				System.out.println("프로그램 종료");
				break;

			default:
				break;
			}
		}
	}

}
