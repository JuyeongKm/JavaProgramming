
class Circle {
	// int �� x, y, ������ ���� (private)
	private int x, y, r;
	// Circle ������ - param (x, y, ������)
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	// toString �Լ� (return String)
	public String toString() {
		return "Circle(" + x + ", " + y + ") ������ " + r;
	}
	// equals �Լ� - param (other Circle) : ��ǥ�� ������ ������ ������ ��, xy��ǥ�� ���
	public boolean equals(Circle q) {
		if (x == q.x || y == q.y)
			return true;
		return false;
	}
}

public class CircleApp {

	public static void main(String[] args) {
		Circle a = new Circle(2, 3, 5);
		Circle b = new Circle(2, 3, 30);
		System.out.println("�� a : " + a.toString());
		System.out.println("�� b : " + b.toString());
		if (a.equals(b))
			System.out.println("���� ��");
		else
			System.out.println("�ٸ� ��");
		
		System.out.print("2210701 ���ֿ�");
	}

}
