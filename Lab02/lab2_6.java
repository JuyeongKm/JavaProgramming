package hw;

import java.util.Scanner;

public class lab2_6 {

	public static void main(String[] args) {
		// Scanner ��ü ����
		Scanner  scan = new Scanner(System.in);
		// ��� ("1~99 ������ ������ �Է��Ͻÿ� >> ")
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		int num = scan.nextInt();// ���� �Է�
		int ten = num/10;
		int one = num%10; // ���� �ڸ�, ���� �ڸ� �� ���� ���ϱ�
		
		if (ten%3 == 0)
			if(one%3 == 0)
				System.out.println("�ڼ� ¦¦");
			else
				System.out.println("�ڼ� ¦");
		else if (one%3 == 0)
			System.out.println("�ڼ� ¦");
		else
			System.out.println("�ڼ� ����");
		// ���� �ڸ�, ���� �ڸ� ��� 3, 6, 9 �� 1
		
			// ��� ("�ڼ� ¦¦")
		
		// ���� �ڸ�, ���� �ڸ� �� �ϳ��� 3, 6, 9 �� 1
		
			// ��� ("�ڼ� ¦")
		
		// �� ��
		
			// ��� ("�ڼ� ����")
		
		// scanner �ݱ�
		scan.close();
	}

}
