package hw;

import java.util.Scanner;

public class Lab3_4 {

	public static void main(String[] args) {
		//Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		//출력 ("소문자 알파벳 하나를 입력하시오 >> ")
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		//scan.next()를 사용하여 문자열 입력받기
		String string = scan.next();
		//string.charAt(0)을 사용하여 문자열의 첫 번째 문자(소문자 알파벳 하나)를 변수에 저장
		char c = string.charAt(0);
		//if문 - string 길이가 1이 아니면
			//출력 ("알파벳 하나만 입력해야 합니다!")
		
		if (string.length() != 1) {
			System.out.println("알파벳 하나만 입력해야 합니다!");
		}
		//else
		//if - character가 알파벳 소문자인지 확인
			//2중 for문을 통해서 예제와 같이 출력
		//else 
			//출력 ("소문자 알파벳이 아닙니다.")
		else
			if (c - 'a' >= 0) {
				for (int i=0; i <= c-'a'; i++) {
					for(char c2 = 'a'; c2 <= c-i; c2++) {
						System.out.print(c2);
					}
					System.out.println();
				}	
			}
			else
				System.out.println("소문자 알파벳이 아닙니다.");
		//Scanner 객체 닫기
		scan.close();
	}

}
