import java.util.Random;
import java.util.Scanner;

class Person {
	// �̸� ���� String, private
	private String name;
	// Person ������ - param (�̸�)
	public Person(String name) {
		this.name = name;
	}
	// getName �Լ� - return String;
	public String getName() {
		return name;
	}
}

public class GamblingGame {
	// Scanner ��ü ����
	Scanner scan = new Scanner(System.in, "EUC-KR");
	// Person �迭 ���� - ũ�� 2
	Person[] person = new Person[2];
	// ���� ��ü ����
	int num = (int)(Math.random()*3 + 1);
	

	public void setting() {
		// "1��° ���� �̸� >> " ���
		System.out.print("1��° ���� �̸� >>");
		// �̸� �Է�
		String name1 = scan.next();
		// ������ �̿��ؼ� ù��° ���� �̸� ����
		person[0] = new Person(name1);
		// "2��° ���� �̸� >> " ���
		System.out.print("2��° ���� �̸� >>");
		// �̸� �Է�
		String name2 = scan.next();
		// ������ �̿��ؼ� �ι�° ���� �̸� ����
		person[1] = new Person(name2);
		String key = scan.nextLine();
	}

	public void run() {
		setting();
		// �¸��� �ǹ��ϴ� boolean ���� ����
		boolean victory = false; //�ʱ�ȭ
		while (true) {
			// for 0 to person ���̸�ŭ{
			for (int i=0; i<person.length; i++) {
				// �̸� + ���� ���
				System.out.print("[" + person[i].getName() + "]:<Enter>");
				// Ű �Է¹ޱ� nextLine
				String key = scan.nextLine();
				// ������ ���� ���� ����
				int a = (int)(Math.random()*3 + 1);
				int b = (int)(Math.random()*3 + 1);
				int c = (int)(Math.random()*3 + 1);
			
				// ���� ���� ���
				System.out.print("\t" + a + " " + b + " " + c + " ");
				// �� ���� ��� �����ϴٸ�
				if (a == b && b == c) {
					// �¸� ��� & ǥ�� for ����������.
					System.out.print(person[i].getName() + "��(��) �̰���ϴ�.");
					victory = true;
					break;
				}
				// �ƴ϶��
				else
					//�ƽ�����! ���
					System.out.println("�ƽ�����!");
			}
			// if - for ���� �¸��� ���
			if (victory == true) {
				// ��ĳ�� �ݰ� while ������
				scan.close();
				break;
			}
		}
	}
	public static void main(String[] args) {
		GamblingGame gg = new GamblingGame();
		gg.run();
		System.out.print("\n2210701 ���ֿ�");
	}

}
