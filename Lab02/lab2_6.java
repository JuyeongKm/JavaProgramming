package hw;

import java.util.Scanner;

public class lab2_6 {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner  scan = new Scanner(System.in);
		// 출력 ("1~99 사이의 정수를 입력하시오 >> ")
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int num = scan.nextInt();// 정수 입력
		int ten = num/10;
		int one = num%10; // 십의 자리, 일의 자리 수 각각 구하기
		
		if (ten%3 == 0)
			if(one%3 == 0)
				System.out.println("박수 짝짝");
			else
				System.out.println("박수 짝");
		else if (one%3 == 0)
			System.out.println("박수 짝");
		else
			System.out.println("박수 없음");
		// 십의 자리, 일의 자리 모두 3, 6, 9 중 1
		
			// 출력 ("박수 짝짝")
		
		// 십의 자리, 일의 자리 중 하나가 3, 6, 9 중 1
		
			// 출력 ("박수 짝")
		
		// 그 외
		
			// 출력 ("박수 없음")
		
		// scanner 닫기
		scan.close();
	}

}
