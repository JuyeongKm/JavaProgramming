package exercise;

public class TV {
	// ������, �����⵵, ������ ���� ����
	private String product;
	private int year, size;
	
	public TV(String product, int year, int size/*������, �����⵵, ������*/) {
		//�Ķ���� ���� ������ �Ҵ�
		this.product = product;
		this.year = year;
		this.size = size;
	}
	
	public void show() {
		// "������" ���� ���� "�����⵵"���� "��ġ" TV
		System.out.println(product + "���� ���� " + year + "���� " + size + "��ġ TV");
	}
	
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2023, 32);
		TV myTV2 = new TV("Samsung", 2022,40);
		myTV.show();
		myTV2.show();
		System.out.println("���ֿ� 2210701");
	}

}
