package hw;

import java.util.Scanner;

public class lab2_8 {

	public static void main(String[] args) {
		// Scanner ��ü ����
		Scanner scan = new Scanner(System.in);
		// ��� ("���� ��� �𼭸� x1, y1 >>")
		System.out.print("x1, y1 �Է�>>");
		int x1, y1;// x1, y1�Է�
		x1 = scan.nextInt();
		y1 = scan.nextInt();
		// ��� ("������ �ϴ� �𼭸� x2, y2  >>")
		System.out.print("x2, y2 �Է�>>");
		int x2, y2;// x2, y2 �Է�
		x2 = scan.nextInt();
		y2 = scan.nextInt();
		// (x1, y1) �Ǵ�(x2, y2) �� (100, 100),(200,200) �ܺο� ���� ���
		if (y2<100 || x2<100 || y1>200 || x1>200)
			System.out.println("�浹 ����");
		else
			System.out.println("�浹 �߻�");
		
			// "�浹 ����" ���
		
		//
			// "�浹 �߻�" ���
		
		// scanner �ݱ�
		scan.close();
	}

}
