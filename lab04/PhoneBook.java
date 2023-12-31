package hw;

import java.util.Scanner;

class Phone {
	// 이름, 전화번호 필드
	private String name, tel;
	// 생성자 (파라미터 : 이름, 전화번호)
	public Phone (String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	// get 함수 정의 (2개 : 이름, 전화번호 각각) - getName(), getTel()
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}
	
	
}

public class PhoneBook {
	// Scanner 객체 선언
	Scanner scan = new Scanner(System.in, "EUC-KR");
	// Phone 배열 선언
	Phone phone[];
	// input 함수
	private void input() {
		// 인원수 입,출력
		System.out.print("인원수>>");
		int p_size = scan.nextInt();
		
		// 인원수만큼의 Phone 배열 선언
		phone = new Phone[p_size];
		
		// 인원수만큼의 이름과 전화번호 입력받기
		for (int i=0; i<p_size; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String name = scan.next();
			String tel = scan.next();
			phone[i] = new Phone(name, tel);
		}
		
		
		// 저장되었습니다... 출력
		System.out.print("저장되었습니다...\n");
	}
	
	// search 함수
	private void search(String searchName) {
		// phone 배열 길이만큼 돌면서 해당 이름이 있는지 확인 후 출력
		for (int i=0; i<phone.length; i++) {
			// 이름이 있으면 '이름' + "의 전화번호는" + '전화번호'+"입니다."
			if (searchName.equals(phone[i].getName())) {
				System.out.println(searchName + "의 전화번호는 " + phone[i].getTel() + "입니다.");
				break;
			}
			// 이름이 없으면 '이름' + "이(가) 없습니다."
			if (i == phone.length-1)
				System.out.println(searchName + "이(가) 없습니다.");
			
		}
	}
	
	public void runCommand() {
		input();
		while (true) {
			// 검색할 이름 입력
			System.out.print("검색할 이름>>");
			String searchName = scan.next();
			// 입력한 단어가 "그만" 인지 확인
			if (searchName.equals("그만")) {
				break;
			}
			// "그만" 인 경우 종료;
			
			// 아닌 경우, search(searchName) 함수 실행
			else
				search(searchName);
			
		}
	}
	
	public static void main(String[] args) {
		PhoneBook phonebook = new PhoneBook();
		phonebook.runCommand();
		System.out.println("2210701 김주영");
	}

}
