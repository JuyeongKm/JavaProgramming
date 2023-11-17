import java.util.Scanner;

public class WordReplace {

	public static void main(String[] args) {
		//">>" ���
		System.out.print(">>");
		//Scanner ��ü ����
		Scanner scan = new Scanner(System.in, "EUC-KR");
		//�� ������ ���ڿ��� �б�
		String text = scan.nextLine();
		//StringBuffer ��ü ���� -> �Է� ���� ���ڿ�
		StringBuffer sb = new StringBuffer(text);
		
		//while��
		while(true) {
			//"���: " ���
			System.out.print("���: ");
			//�� ������ ���ڿ��� �б�
			String cmd = scan.nextLine();
			//"�׸�"�� �Է��ϸ� ����
			if (cmd.equals("�׸�")) {
				System.out.print("�����մϴ�.");
				break;
			}
		
		
			//�Է� ���� ���ڿ�(���)�� ! �������� split�ؼ� String �迭�� ���� (ù ��° token = ã�� ���ڿ�, �� ��° token = �ٲ� ���ڿ�)
			String [] tokens = cmd.split("!");
			//�迭�� ����� token�� 2���� �ƴϸ� "�߸��� ����Դϴ�!" ���
			if (tokens.length != 2)
				System.out.print("�߸��� ����Դϴ�!");

		
			//else
			else {			
				//ù ��° token�� ���̰� 0�̰ų� �� ��° token�� ���̰� 0�̸� "�߸��� ����Դϴ�!" ���
				if (tokens[0].length() == 0 || tokens[1].length() == 0) {
					System.out.print("�߸��� ����Դϴ�!\n");
					continue;
				}
				
				//indexOf �Լ� �̿� -> �Է� ���ڿ����� ù ��° token�� index ã�Ƽ� ���� 
				int index = sb.indexOf(tokens[0]);
				//ù ��° token�� ã�� �� ���ٸ� "ã�� �� �����ϴ�!" ���
				if (index == -1) {
					System.out.print("ã�� �� �����ϴ�!\n");
					continue;
				}
		
		
				//replace �Լ� �̿� -> index�� �̿��� ù ��° ��ū�� �� ��° token���� ��ü
				sb.replace(index, index+tokens[0].length(), tokens[1]);
				//�ٲ� �� ���ڿ� ���
				System.out.println(sb.toString());
			}
				
			
		}
		//scanner �ݱ�
		scan.close();
		

	}

}
