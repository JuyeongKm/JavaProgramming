package hw;

import java.util.Scanner;

public class Lab3_16 {

	public static void main(String[] args) {
		// Scanner ��ü ���� (���� �� �ֿܼ��� �ѱ� �Է� �� �� ��� new Scanner(System.in, "EUC-KR") ���� ����)
		Scanner scan = new Scanner(System.in, "EUC-KR");
		//  { "����", "����", "��" } �� ���ڿ� �迭 �����
		String option[] = {"����", "����", "��"};
		// ���� �ݺ�
		while (true) {
			
			// ��� ("��ǻ�Ϳ� ���������� ������ �մϴ�")
			System.out.println("��ǻ�Ϳ� ���������� ������ �մϴ�");
			// ��� ("���� ���� ��!>> ")
			System.out.print("���� ���� ��! >> ");
			// ����ڷκ��� String �Է� �ޱ�
			String input = scan.next();
			// ����ڰ� "�׸�"�� �Է�������
			if (input.equals("�׸�"))
				break;
				// ���� �� (�ݺ��� ��)

			// ��ǻ�Ͱ� ���� ���� �����ϰ� �����ϱ� ���� 0~2�� ���� ����
			int n = (int)(Math.random()*3);
			// ������� ���ð� ��ǻ���� ���� ���
			System.out.println("����� = " + input + "," + " ��ǻ�� = " + option[n] + ",");
			// if - ��ǻ�Ͱ� ������ ���
			if (n == 0) 
				if (input.equals("����")) {
					System.out.println("�����ϴ�.");
				}
				else if (input.equals("����")) {
					System.out.println("����ڰ� �̰���ϴ�.");
				}
				else
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			
			else if (n == 1) 
				if (input.equals("����")) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}
				else if (input.equals("����")) {
					System.out.println("�����ϴ�.");
				}
				else
					System.out.println("����ڰ� �̰���ϴ�.");
			else 
				if (input.equals("����")) {
					System.out.println("����ڰ� �̰���ϴ�.");
				}
				else if (input.equals("����")) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}
				else
					System.out.println("�����ϴ�.");
			
				//������� �Է¿� ���� ������ ���� ���
			
			
			
			// else if - ��ǻ�Ͱ� ������ ���
				//������� �Է¿� ���� ������ ���� ���
			
			
			
			
			// else - ��ǻ�Ͱ� ���� ���
				//������� �Է¿� ���� ������ ���� ���
		}

		//Scanner �ݱ�
		scan.close();
			
		
	}

}
