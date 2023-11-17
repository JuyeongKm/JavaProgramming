package hw;

import java.util.Scanner;

class Phone {
	// �̸�, ��ȭ��ȣ �ʵ�
	private String name, tel;
	// ������ (�Ķ���� : �̸�, ��ȭ��ȣ)
	public Phone (String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	// get �Լ� ���� (2�� : �̸�, ��ȭ��ȣ ����) - getName(), getTel()
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}
	
	
}

public class PhoneBook {
	// Scanner ��ü ����
	Scanner scan = new Scanner(System.in, "EUC-KR");
	// Phone �迭 ����
	Phone phone[];
	// input �Լ�
	private void input() {
		// �ο��� ��,���
		System.out.print("�ο���>>");
		int p_size = scan.nextInt();
		
		// �ο�����ŭ�� Phone �迭 ����
		phone = new Phone[p_size];
		
		// �ο�����ŭ�� �̸��� ��ȭ��ȣ �Է¹ޱ�
		for (int i=0; i<p_size; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			String name = scan.next();
			String tel = scan.next();
			phone[i] = new Phone(name, tel);
		}
		
		
		// ����Ǿ����ϴ�... ���
		System.out.print("����Ǿ����ϴ�...\n");
	}
	
	// search �Լ�
	private void search(String searchName) {
		// phone �迭 ���̸�ŭ ���鼭 �ش� �̸��� �ִ��� Ȯ�� �� ���
		for (int i=0; i<phone.length; i++) {
			// �̸��� ������ '�̸�' + "�� ��ȭ��ȣ��" + '��ȭ��ȣ'+"�Դϴ�."
			if (searchName.equals(phone[i].getName())) {
				System.out.println(searchName + "�� ��ȭ��ȣ�� " + phone[i].getTel() + "�Դϴ�.");
				break;
			}
			// �̸��� ������ '�̸�' + "��(��) �����ϴ�."
			if (i == phone.length-1)
				System.out.println(searchName + "��(��) �����ϴ�.");
			
		}
	}
	
	public void runCommand() {
		input();
		while (true) {
			// �˻��� �̸� �Է�
			System.out.print("�˻��� �̸�>>");
			String searchName = scan.next();
			// �Է��� �ܾ "�׸�" ���� Ȯ��
			if (searchName.equals("�׸�")) {
				break;
			}
			// "�׸�" �� ��� ����;
			
			// �ƴ� ���, search(searchName) �Լ� ����
			else
				search(searchName);
			
		}
	}
	
	public static void main(String[] args) {
		PhoneBook phonebook = new PhoneBook();
		phonebook.runCommand();
		System.out.println("2210701 ���ֿ�");
	}

}
