package exercise;

import java.util.Scanner;

public class lab2_5 {

	public static void main(String[] args) {
		// Scanner ��ü ����
		Scanner scan = new Scanner(System.in);
		// ��� ("���� 3���� �Է��Ͻÿ�>>")
		System.out.print("���� 3���� �Է��Ͻÿ�>>");
		int a, b, c;
		// ���� 3�� �Է�
		a = scan.nextInt(); b = scan.nextInt();	c = scan.nextInt();
		int max = Math.max((Math.max(a,b)), c);// ���� �� ���� ū �� ã��
		int left = (a + b + c) - max;// ������ �� ���� ���� ��
		// ���� ū ���� ���� < �ٸ� �� ���� ���� ��
		if (max < left)
			System.out.println("�ﰢ���� �˴ϴ�");
			// ���
		else
			System.out.println("�ﰢ���� ���� �� �����ϴ�");
			// ���
		// scanner �ݱ�
		scan.close();
	}

}
