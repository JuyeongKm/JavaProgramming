package hw;

import java.util.Scanner;

public class Lab3_4 {

	public static void main(String[] args) {
		//Scanner ��ü ����
		Scanner scan = new Scanner(System.in);
		//��� ("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ� >> ")
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		//scan.next()�� ����Ͽ� ���ڿ� �Է¹ޱ�
		String string = scan.next();
		//string.charAt(0)�� ����Ͽ� ���ڿ��� ù ��° ����(�ҹ��� ���ĺ� �ϳ�)�� ������ ����
		char c = string.charAt(0);
		//if�� - string ���̰� 1�� �ƴϸ�
			//��� ("���ĺ� �ϳ��� �Է��ؾ� �մϴ�!")
		
		if (string.length() != 1) {
			System.out.println("���ĺ� �ϳ��� �Է��ؾ� �մϴ�!");
		}
		//else
		//if - character�� ���ĺ� �ҹ������� Ȯ��
			//2�� for���� ���ؼ� ������ ���� ���
		//else 
			//��� ("�ҹ��� ���ĺ��� �ƴմϴ�.")
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
				System.out.println("�ҹ��� ���ĺ��� �ƴմϴ�.");
		//Scanner ��ü �ݱ�
		scan.close();
	}

}
