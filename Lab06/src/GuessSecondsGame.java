import java.util.Calendar;

import java.util.Scanner;

class Player {
	// Scanner ��ü ����
	Scanner scan = new Scanner(System.in);
	// �̸� ���� String type, private
	private String name;
	// Player ������ - param (�̸�)
	public Player(String name) {
		this.name = name;
	}
	// getName �Լ� (return String)
	public String getName() {
		return name;
	}

	public int turn() {
		// ��� (name + "���� <Enter> Ű>> ")
		System.out.print(name + "���� <Enter> Ű>>");
		// Ű �Է� nextLine()
		String key = scan.nextLine();
		// Ķ���� �޾ƿ���
		Calendar calendar = Calendar.getInstance();
		// Ķ�������� ���� �� �޾ƿ���
		int start = calendar.get(Calendar.SECOND);
		// ���� �� ��� (�޾ƿ� ��)
		System.out.println("\t���� �� �ð� = " + start);
		// 10�� ���� �� ���� Ű ���
		System.out.print("10�� ���� �� <Enter> Ű>>");
		// Ű �Է� nextLine()
		String endkey = scan.nextLine();
		// Ķ���� �ٽ� �޾ƿ���
		Calendar calendar2 = Calendar.getInstance();
		// Ķ�������� ���� �� �޾ƿ���
		int end = calendar2.get(Calendar.SECOND);
		// ���� �� �ð� ���
		System.out.println("\t���� �� �ð� = " + end);
		
		// ó�� ���� �ʿ��� ���� �ʿ��� ���� ��� �� ���� (getDiffTime �޼ҵ� ȣ��)
		
		return getDiffTime(start, end);
	}

	public int getDiffTime(int start, int end) {
		if (start <= end) // ���ᰡ ū ���
			// ���� �� ���ؼ� ����
			return end - start;
		else
			// ���ᰡ ���� ��쿡 �˸°� �ڵ� ���� (1�� - 60��)
			return end +60 - start;
	}
}

public class GuessSecondsGame {
	public void startGame() {
		// Player �迭 ���� - ũ�� 2
		Player[] player = new Player[2];
		// Player 1 = �ο�
		player[0] = new Player("�ο�");
		// Player 2 = ����
		player[1] = new Player("����");
		
		// ��� "10�ʿ� ����� ����� �̱�� �����Դϴ�."
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		// �� player ���� ���� ��� ���ϱ� (���� �� �޾ƿ���) 
		int diff1 = player[0].turn();
		int diff2 = player[1].turn();
		
		// �� player �� ���� ��� ���
		System.out.print(player[0].getName() + "�� ��� " + diff1 + ", " + player[1].getName() + "�� ��� " + diff2);
				
		// ���ڴ� ���
		// Math.abs(����) �̿��� 10�ʿ� �� ����� ����� �̸��� ��� + ������ ��� "���� ����" ���
		if (Math.abs(diff1-10) < Math.abs(diff2-10)) 
			System.out.print(", ���ڴ� �ο�");
		else if (Math.abs(diff1-10) > Math.abs(diff2-10))
			System.out.print(", ���ڴ� ����");
		else
			System.out.print(", ���� ����");
		
		
	}

	public static void main(String[] args) {
		GuessSecondsGame gsg = new GuessSecondsGame();
		gsg.startGame();
		System.out.print("\n2210701 ���ֿ�");
	}

}
