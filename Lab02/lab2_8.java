package hw;

import java.util.Scanner;

public class lab2_8 {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		// 출력 ("왼쪽 상단 모서리 x1, y1 >>")
		System.out.print("x1, y1 입력>>");
		int x1, y1;// x1, y1입력
		x1 = scan.nextInt();
		y1 = scan.nextInt();
		// 출력 ("오른쪽 하단 모서리 x2, y2  >>")
		System.out.print("x2, y2 입력>>");
		int x2, y2;// x2, y2 입력
		x2 = scan.nextInt();
		y2 = scan.nextInt();
		// (x1, y1) 또는(x2, y2) 가 (100, 100),(200,200) 외부에 있을 경우
		if (y2<100 || x2<100 || y1>200 || x1>200)
			System.out.println("충돌 없음");
		else
			System.out.println("충돌 발생");
		
			// "충돌 없음" 출력
		
		//
			// "충돌 발생" 출력
		
		// scanner 닫기
		scan.close();
	}

}
