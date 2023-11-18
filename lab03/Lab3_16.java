package hw;

import java.util.Scanner;

public class Lab3_16 {

	public static void main(String[] args) {
		// Scanner 객체 생성 (실행 시 콘솔에서 한글 입력 안 될 경우 new Scanner(System.in, "EUC-KR") 으로 수정)
		Scanner scan = new Scanner(System.in, "EUC-KR");
		//  { "가위", "바위", "보" } 로 문자열 배열 만들기
		String option[] = {"가위", "바위", "보"};
		// 무한 반복
		while (true) {
			
			// 출력 ("컴퓨터와 가위바위보 게임을 합니다")
			System.out.println("컴퓨터와 가위바위보 게임을 합니다");
			// 출력 ("가위 바위 보!>> ")
			System.out.print("가위 바위 보! >> ");
			// 사용자로부터 String 입력 받기
			String input = scan.next();
			// 사용자가 "그만"을 입력했으면
			if (input.equals("그만"))
				break;
				// 게임 끝 (반복문 끝)

			// 컴퓨터가 내는 것을 랜덤하게 선택하기 위해 0~2의 난수 생성
			int n = (int)(Math.random()*3);
			// 사용자의 선택과 컴퓨터의 선택 출력
			System.out.println("사용자 = " + input + "," + " 컴퓨터 = " + option[n] + ",");
			// if - 컴퓨터가 가위인 경우
			if (n == 0) 
				if (input.equals("가위")) {
					System.out.println("비겼습니다.");
				}
				else if (input.equals("바위")) {
					System.out.println("사용자가 이겼습니다.");
				}
				else
					System.out.println("컴퓨터가 이겼습니다.");
			
			else if (n == 1) 
				if (input.equals("가위")) {
					System.out.println("컴퓨터가 이겼습니다.");
				}
				else if (input.equals("바위")) {
					System.out.println("비겼습니다.");
				}
				else
					System.out.println("사용자가 이겼습니다.");
			else 
				if (input.equals("가위")) {
					System.out.println("사용자가 이겼습니다.");
				}
				else if (input.equals("바위")) {
					System.out.println("컴퓨터가 이겼습니다.");
				}
				else
					System.out.println("비겼습니다.");
			
				//사용자의 입력에 따라 게임의 승자 출력
			
			
			
			// else if - 컴퓨터가 바위인 경우
				//사용자의 입력에 따라 게임의 승자 출력
			
			
			
			
			// else - 컴퓨터가 보인 경우
				//사용자의 입력에 따라 게임의 승자 출력
		}

		//Scanner 닫기
		scan.close();
			
		
	}

}
