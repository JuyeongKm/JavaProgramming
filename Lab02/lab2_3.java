package exercise;

import java.util.Scanner;

public class lab2_3 {

	public static void main(String[] args) {
		// Scanner ��ü ����
		Scanner scan = new Scanner(System.in); 
		// ��� ("�ݾ��� �Է��Ͻÿ� >> ")
		System.out.print("�ݾ��� �Է��Ͻÿ� >>");
		int money = scan.nextInt();// �� �Է� �ޱ�
		// �Է� ���� ���� �ùٸ� ���̶�� (���)
		if (money >= 0) {
			System.out.println("��������" + money/50000 + "��");
			money %= 50000;
			System.out.println("������" + money/10000 + "��");
			money %= 10000;
			System.out.println("õ����" + money/1000 + "��");
			money %= 1000;
			System.out.println("���" + money/100 + "��");
			money %= 100;
			System.out.println("���ʿ�" + money/50 + "��");
			money %= 50;
			System.out.println("�ʿ�" + money/10 + "��");
			System.out.println("�Ͽ�" + money%10 + "��");
		}
			// "/"�� "%" ����ؼ� Ǯ��
		
		// scanner �ݱ�
		scan.close();
		
	}

}
