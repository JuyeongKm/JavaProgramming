import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PhoneBookWriter {

	public static void main(String[] args) {
		// Scanner ��ü ����
		Scanner scan = new Scanner(System.in, "EUC-KR");
		// File ���� - "C:/classJava/2000000_JAVA/Lab08/phone.txt" --> ���� ��ũ�����̽��� �°� ����
		File file = new File("C:/classjava/2210701_JAVA/Lab08/phone.txt");
		// FileWriter ���� - �ʱ�ȭ:null
		FileWriter fw = null;
		try {
			// ��� "��ȭ��ȣ �Է� ���α׷��Դϴ�."
			System.out.println("��ȭ��ȣ �Է� ���α׷��Դϴ�.");
			// fileWriter ����ؼ� file �о����
			fw = new FileWriter(file);
			// while(true){
			while(true) {
			// ��� "�̸� ��ȭ��ȣ >>"
				System.out.print("�̸� ��ȭ��ȣ >>");
			// �Է� �ޱ� nextLine
				String str = scan.nextLine();
			// �Է� �� == "�׸�" --> break;
				if (str.equals("�׸�"))
					break;
			// fileWriter�� �޾ƿ� �� + "\n" ����
				fw.write(str + "\n");
			// }
			}
			// ��� "C:/classJava/2000000_JAVA/Lab08/phone.txt �� �����Ͽ����ϴ�." --> ���� ��ũ�����̽��� �°�
			System.out.println("C:/classJava/2210701_JAVA/Lab08/phone.txt �� �����Ͽ����ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// fileWriter != null --> fileWriter.close() & Scanner close()  with try&catch
			if (fw != null)
				try {
					fw.close();
					scan.close();
				}
			catch(IOException e) {
			
			}
		}
	}

}
