import java.util.Scanner;

public class RotationString {

	public static void main(String[] args) {
		// Scanner ��ü ����
		Scanner scan = new Scanner(System.in, "EUC-KR");
		// ���ڿ� �Է� .. �˴ϴ� ���.
		System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
		// ���ڿ� �Է� �ޱ� nextLine
		String text = scan.nextLine();
		// ���ڿ� ���� ���ؼ� �����ϱ�
		int num = text.length();
		// for 0 to ���ڿ� ���̸�ŭ
		for (int i=0; i<num; i++) {
		// ���� ���ڿ����� ù���� ��������
			String start = text.substring(0,1);
		// ������ ���� �� ��������
			String str = text.substring(1);
		// ���ڿ� = ���������� + ù����
			text = str + start;
		// ���ڿ� ���
			System.out.println(text);
		}
		// ��ĳ�� �ݱ�
		scan.close();
		
		System.out.print("2210701 ���ֿ�");

	}

}
