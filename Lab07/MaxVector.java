import java.util.Scanner;
import java.util.Vector;

public class MaxVector {

	public static void main(String[] args) {
		// Scanner ��ü ����
		Scanner scan = new Scanner(System.in);
		// Integer type Vector ���� ����
		Vector<Integer> v = new Vector<Integer>();	//�÷��� ��������
		// ��� ("����(-1�� �Էµ� ������)>> ")
		System.out.print("����(-1�� �Էµ� ������)>>");
		while(true) {
			// �� �Է� �ޱ�
			int num = scan.nextInt();
			// �Է� ���� �� == -1 ? --> break;
			if (num == -1)
				break;
			// ���Ϳ� �Է� ���� �� �ֱ�
			else
				v.add(num);
		}
		// �ִ밪 ������ ���� ����
		int biggest = v.get(0);
		// ���� �����ŭ ���鼭 �ִ밪 ã��
		for(int i=0; i<v.size(); i++) {
			if (v.get(i) > biggest)
				biggest = v.get(i);
		}
			
		// �ִ밪 ���
		System.out.println("���� ū ����: " + biggest);
		// Scanner ��ü �ݱ�
		scan.close();
	}

}
