import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src); // ���� ��ȯ�� �̷������ �Լ�

	abstract protected String srcString(); // ���� ���� ��

	abstract protected String destString(); // �ٲپ��� ���� ��

	protected double ratio; // ����
	
	public void run() {
		Scanner scan = new Scanner(System.in); // ��ĳ�� ��ü ����
		System.out.println(srcString() + "�� " + destString() + "�� �ٲߴϴ�.");
		System.out.print(srcString() + "�� �Է��ϼ��� >> ");
		double val = scan.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ��� : " + res + destString() + "�Դϴ�.");
		scan.close();
	}
}
