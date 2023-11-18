import java.util.Scanner;
import java.util.Vector;

public class RainfallStatistics {
	public static void main(String[] args) {
		// Scanner ��ü ����
		Scanner scan = new Scanner(System.in);
		// Integer type Vector ���� ����
		Vector<Integer> v = new Vector<Integer>();
		while(true) {
			// ��¹� "������ �Է� (0 �Է½� ����) >> "
			System.out.print("������ �Է�(0 �Է� �� ����) >>");
			// ������ �Է¹ޱ�
			int rainfall = scan.nextInt();
			// �Է� ���� ������ == 0 --> ����������(while�� ���� ����)
			if (rainfall == 0)
				break;
			// ������ ���Ϳ� �߰�
			else
				v.add(rainfall);
			// �հ� ���� = 0
			double sum = 0;
			// ���� ������ ��ŭ ���鼭 �� ���� ���� ��� + ��� ���ϱ� ���� �հ� ���ϱ�
			for(int i=0; i<v.size(); i++) {
				System.out.print(v.get(i) + " ");
				sum += v.get(i);
			}
			
			// ���������� �հ踦 �̿��Ͽ� ��� ���ϱ�(������ size �Լ� �̿�) -> ���
			System.out.println("\n���� ��� " + sum / v.size());
			
		}
		// Scanner ��ü �ݱ�
		scan.close();
		System.out.print("2210701 ���ֿ�");
	}
}
