import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CustomerPoint {
	public static void main(String[] args) {
		// Scanner ��ü ����
		Scanner scan = new Scanner(System.in, "EUC-KR");
		// ȸ�� �̸�(string), ȸ���� ����Ʈ ��(integer) type �� HashMap ����
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		// set �̿��Ͽ� HashMap �� Ű �� �޾ƿ� set ����
		Set<String> set = map.keySet();
		// Iterator �̿��Ͽ� ���ʴ�� Ű �� �޾ƿ� �غ�
		Iterator<String> it = set.iterator();
		// ��� "** ����Ʈ ���� ���α׷��Դϴ� **"
		System.out.println("**����Ʈ ���� ���α׷��Դϴ�**");
		
		while (true) {
			// ��¹� "\n�̸��� ����Ʈ �Է� >> "
			System.out.print("\n�̸��� ����Ʈ �Է� >> ");
			// �̸� �޾ƿ���
			String name = scan.next();
			// �̸� == "�׸�" ? --> break;
			if(name.equals("�׸�"))
				break;
			// ����Ʈ �Է�
			int point = scan.nextInt();
			// �ش� �̸� ���� ���� �ִ��� HashMap ���� ã��
				// ���� �����Ѵٸ� --> HashMap�� �ش� ���� ���� ����Ʈ���� �Է¹��� ����Ʈ�� ������
			if(map.containsKey(name))
				map.put(name, map.get(name) + point);
			
			// ���� �������� �ʴ´ٸ� --> HashMap�� ���� �̸�, ���� ����Ʈ �� �߰����ֱ�.
			else
				map.put(name, point);
			
			// HashMap ���� Key �� �޾ƿ��� -> ������ �������� Set ���� ����ϱ�
			set = map.keySet();
			// iterator ���� ������ ������ ������ �ٽ� �������ֱ�
			it = set.iterator();
			
			while(it.hasNext()) { // iterator �� ���� ���� ���� �ٸ� -> hasNext() �̿�
				// iterator �� ���� Key ��(�̸�) �޾ƿ���
				String key = it.next();
				// HashMap ���� ���� Key ��(�̸�) �̿��ؼ� ����Ʈ �� ��������
				int value = map.get(key);
				// (�̸�, ����Ʈ) ���·� ���
				System.out.print("(" + key + ", " + value + ")");
			}
		}
		// Scanner ��ü �ݱ�
		scan.close();
		System.out.print("2210701 ���ֿ�");
	}
}
