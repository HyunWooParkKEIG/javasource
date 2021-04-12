package member;

import java.util.*;

public class MemberConsoleUtil {
	
	public MemberConsoleUtil() {
		// TODO Auto-generated constructor stub
	}
	
	public Member getNewMember(Scanner sc) {
		Member member = new Member();
		
		System.out.println("등록할 호원 정보를 입력하세요");
		System.out.print("아이디 : ");
		member.setId(Integer.parseInt(sc.nextLine()));
		System.out.print("이름 : ");
		member.setName(sc.nextLine());
		System.out.print("주소 : ");
		member.setAddr(sc.nextLine());
		System.out.print("이메일 : ");
		member.setEmail(sc.nextLine());
		System.out.print("국가 : ");
		member.setNation(sc.nextLine());
		System.out.print("나이 : ");
		member.setAge(Integer.parseInt(sc.nextLine()));
		
		return member;
	}
	
	public void printAddSuccessMessage(Member member) {
		System.out.println(member.getName() + " 회원 정보 추가 성공");
	}
	
	public void printModifySuccessMessage(Member member) {
		System.out.println(member.getId() + " 수정 성공");
	}
	
	public void printModifyFailMessage() {
		System.out.println("수정 실패");
	}

	public void printRemoveFailMessage() {
		System.out.println("삭제 실패");
	}

	public void printRemoveSuccessMessage(Member member) {
		System.out.println(member.getId() + " 삭제 성공");
	}
	
	public void printMemberList(Member[] members) {
		System.out.println("회원아이디  이름    주소     이메일            국가    나이");
		for (Member member : members) {
			if (member != null) {
				System.out.print("  " +  member.getId() + "    ");
				System.out.print(member.getName() + "  ");
				System.out.print(member.getAddr() + "  ");
				System.out.print(member.getEmail() + "  ");
				System.out.print(member.getNation() + "  ");
				System.out.println(member.getAge());
			}
		}
	}
	
	public Member getUpdateMember(Scanner sc, Member[] members) {
		
		System.out.print("수정할 회원의 아이디를 입력하세요. ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.print("수정할 주소를 입력하세요. ");
		String addr = sc.nextLine();

		System.out.print("수정할 이메일을 입력하세요. ");
		String email = sc.nextLine();
		
		Member newMember = null;
		
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) {
				if (members[i].getId() == id) {
					members[i].setAddr(addr);
					members[i].setEmail(email);
					
					newMember = members[i];
					break;
				}
			}
		}
		
		return newMember;
	}
	
	public Member removeMember(Scanner sc, Member[] members) {
		
		System.out.print("삭제할 회원의 아이디를 입력하세요 ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.print("정말로 삭제하겠습니까? 예(1) 아니오(2) ");
		int select = Integer.parseInt(sc.nextLine());
		
		Member newMember = null;
		
		if (select == 1) {
			for (int i = 0; i < members.length; i++) {
				if (members[i] != null) {
					if (members[i].getId() == id) {
						newMember = members[i];
						
						members[i] = null;
						break;
					}
				}
			}
		}
		
		
		
		return newMember;
	}
	
	
}
