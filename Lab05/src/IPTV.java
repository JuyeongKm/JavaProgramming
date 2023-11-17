
public class IPTV extends ColorTV { // extends ��ӹ��� �θ� Ŭ���� -- color tv
	// ip ������ ���� (private)
	private String iptv;

	// ������ -> ip, ũ��, ���� �� ����
	public IPTV(String iptv, int size, int color) {
		super(size, color);
		this.iptv = iptv;
	}
	
	// getIP �Լ� --> IP ����
	public String getIP() {
		return iptv;
	}
	
	// printProperty �Լ� --> "���� IPTV�� IP �ּ��� X ��ġ Y �÷�" return;
	public void printProperty() {
		System.out.println("���� IPTV�� " +getIP() + "�ּ��� " + getSize() + "��ġ " + getColor() + "�÷�");
	}
	
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.0.0.1", 32, 2048);
		iptv.printProperty();
		System.out.println("2210701 ���ֿ�");
	}

}
