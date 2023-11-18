import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneFinder {

	public static void main(String[] args) {
		// Scanner ��ü ����
		Scanner scan = new Scanner(System.in, "EUC-KR");
		// HashMap ��ü ���� 
		HashMap<String, String> map = new HashMap<String, String>();
		// File - "C:/classJava/2000000_JAVA/Lab08/phone.txt" ����
		File file = new File("C:/classjava/2210701_JAVA/Lab08/phone.txt");
		// FileReader ���� - �ʱ�ȭ:null
		FileReader fr = null;
		
		try {
			// fileReader �� file �о����
			fr = new FileReader(file);
			// Scanner �̿��ؼ� File �ٷ� �о����
			// hint --> System.in to fileReader
			Scanner fileScanner = new Scanner(fr);
			// while ... scanner ��.hasNext() {
			while (fileScanner.hasNext()) {
				// name = scanner.next() �� �ޱ�
				String name = fileScanner.next();
				// tel = scanner.next() �� �ޱ�
				String tel = fileScanner.next();
				// hashMap �� �ֱ� (name, tel)
				map.put(name, tel);
			// }
			}
			// scanner �ݱ�
			fileScanner.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// ��� "�� " + hashMap.size() + "���� ��ȭ��ȣ�� �о����ϴ�."
			System.out.println("��" + map.size() + "���� ��ȭ��ȣ�� �о����ϴ�.");
		}

		// while(true){
		while (true) {
			// ��� "�̸� >> "
			System.out.print("�̸� >> ");
			// �̸� �Է�
			String name = scan.next();
			
			// �̸� == "�׸�" ? break;
			if (name.equals("�׸�")) {
				System.out.print("2210701 ���ֿ�");
				break;
			}
			// hashMap���� �޾ƿ� �̸����� �˻� != null
			if ((map.get(name)) != null)
				// hashMap���� ���� �޾ƿͼ� ��� "��ȭ��ȣ : " + hashMap.get(name)
				System.out.println("��ȭ��ȣ : " + map.get(name));
			// else (==null)
			else
				// ��� "ã�� �̸��� �����ϴ�."
				System.out.println("ã�� �̸��� �����ϴ�.");
		//}
		}
		// scanner �ݱ�
		scan.close();
			
	}
}