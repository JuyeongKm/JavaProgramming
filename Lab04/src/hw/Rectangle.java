package hw;

public class Rectangle {
	// private ���� - int Ÿ���� x, y, width, height
	private int x, y, width, height;
	// x, y, width, height ���� �Ű������� �޾� �ʵ带 �ʱ�ȭ �ϴ� ������
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
	}
	
	// int square() : �޼ҵ� - �簢���� ���� ����
	public int square() {
		int a;
		a = width * height;
		return a;
	}
	
	// void show(): �޼ҵ� -   �簢���� ��ǥ�� ���̸� ȭ�鿡 ���
	public void show() {
		System.out.println("(" + x + "," + y + ")���� ũ�Ⱑ " + width*height + "�� �簢��");
	}
	
	//boolean contains(Rectangle r): �Ű������� ���� r�� �� �簢�� �ȿ� ������ true ����
	public boolean contains(Rectangle r) {
		if (x < r.x && y < r.y) {
			if (x + width > r.x + r.width && y + height > r.y + r.height) {
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		// �ǽ� �ڷ��� ���� �Լ��� ����
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s�� ������" + s.square());
		if (t.contains(r))
			System.out.println("t�� r�� �����մϴ�.");
		if (t.contains(s))
			System.out.println("t�� s�� �����մϴ�.");
		System.out.println("2210701 ���ֿ�");
	}

}
