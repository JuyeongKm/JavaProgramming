package hw;

import java.util.Scanner;

public class lab2_2 {

	public static void main(String[] args) {
		// Scanner ��ü ����
		Scanner scan = new Scanner(System.in);
		// ��� ("2�ڸ��� ���� �Է�(10~99) ")
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		int num = scan.nextInt();// ���� �Է¹ޱ�
		if (num/10 == num%10) 
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�");
		else
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�");
		
		// ���ǹ�
			// ���� �� ��¹�
		
			// �ٸ� �� ��¹�
		// scanner �ݱ�
		scan.close();
	}

}
