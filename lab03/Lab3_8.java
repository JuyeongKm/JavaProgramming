package hw;

import java.util.Scanner;

public class Lab3_8 {

	public static void main(String[] args) {
		// Scanner ��ü ����
		Scanner scan = new Scanner(System.in);
		// ��� ("���� �? ")
		System.out.print("���� �?");
		// size �Է¹ޱ�
		int size = scan.nextInt();
		// size ũ���� �迭 ����
		int int_arr[] = new int[size];
		// new �����ڸ� ����ϸ� boolean �迭�� false�� �ʱ�ȭ ��
		boolean check[] = new boolean[101]; 
		
		// for�� ���{
		for(int i=0; i < size; i++) {
			// ���� ����
			int r;
			// check �迭�� ���� ���� ���� �ִ��� Ȯ��
			while (true) {
				r = (int)(Math.random()*100 + 1);
				if (check[r]== false) {
					check[r] = true;
					break;
				}
			}
				// �ִٸ� ���� ������ ���� �� ���� �� Ȯ��
			
			
			// �迭�� update
			int_arr[i] = r;
			// ������ ���� ���
			System.out.print(int_arr[i] + " ");
			// 10��° ���� �� new line ���ֱ�
			if ((i+1)%10 == 0)
				System.out.println();
		}
		// Scanner �ݱ�
		scan.close();
	}

}
