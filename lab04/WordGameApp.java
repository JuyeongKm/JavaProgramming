package hw;

import java.util.Scanner;

class Player {
	// �̸� ���� ����
	String name;
	// ������ (�Ķ���� : �̸�)
	public Player () {}

	// getName() �Լ�
	public String getName() {
		return name;
	}
}

public class WordGameApp {
	// Scanner ��ü
	Scanner scan = new Scanner(System.in, "EUC-KR");
	// Player �迭 ����
	Player player[];
	// ���� �ܾ� �����ϴ� ���� ����(�����ձ� ���۴ܾ�) ex : String currentWord="�ƹ���"
	String currentWord = "�ƹ���";
	
	// beforSetting() �Լ� ����	
	public void beforeSetting() {
		// �����ձ� ���� ���� ... ���
		System.out.println("�����ձ� ���� ����");
		// ���� ���� �ο� ��,���
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�>>");
		int num = scan.nextInt();
		
		// Player �迭 ����
		Player[] player = new Player[num];
		
		// �Է¹��� �ο� �� ��ŭ �̸� �Է� ���� ���� player ���� ���� -> ������ �̿�
		for (int i=0; i<num; i++) {
			System.out.print("�������� �̸��� �Է��ϼ���");
			player[i] = new Player();
			player[i].name = scan.next();
			
		}
		
		
	}
	
	// start �Լ� ����
	public void start() {
		// ���� ��츦 ��Ÿ���� boolean ����(lose)
		boolean lose = false;
		
		while(true) {
			// player �� �����ư��鼭 ����
			for (int i=0; i<player.length; i++) {
			System.out.println(player[i].getName() + ">>");
				// getName ����Ͽ� ���� �̸� ���
			
				// �ܾ� �Է�
				String nextWord = scan.next();
				// if(...) --> ���� �ܾ�� �Է� ���� �ܾ��� ù���ڿ� �������� -> substring() ���
				if (currentWord == nextWord.substring(nextWord.length()-1)) {
					// �����ϴٸ� ���� �ܾ �Է¹��� �ܾ�� ����
					currentWord = nextWord;
				}
				// else
				else
					// �����ϴ�. ���
					System.out.println("�����ϴ�.");
			
					// lose �� true �� ����
					lose = true;
					// for ����������
					break;
			}
			// lose �� true �̸�  while loop break��  scanner �ݱ�
			if (lose == true ) {
				scan.close();
				break;
			}
			
		}
	
	}
	
	public static void main(String[] args) {
		WordGameApp wordGameApp = new WordGameApp();
		wordGameApp.beforeSetting();
		wordGameApp.start();
	}

}
