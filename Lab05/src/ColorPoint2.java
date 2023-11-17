
public class ColorPoint2 extends Point{ // extends ��ӹ��� �θ� Ŭ����
	// ���� ���� ���� (private)
	private String color;
	// ������ parameter ����. default (0, 0) "BLACK"
	public ColorPoint2() {
		super(0,0);
		this.color = "BLACK";
	}
	
	// ������ -> x, y ����
	public ColorPoint2(int x, int y) {
		super(x,y);
		this.color = "BLACK";
	}
	
	// setXY -> x, y ���� ���� �Լ�
	public void setXY(int x, int y) {
		move(x,y);
		
	}
	
	// setColor -> ���� ���� �Լ�
	public void setColor(String color) {
		this.color = color;
	}
	
	// getColor �Լ� -> ���� ����
	public String getColor() {
		return color;
	}
	
	// toString �Լ� -> "������ ���� (x, y)"�� ��" return
	public String toString() {
		return getColor() + "���� (" + getX() + ", " + getY() + ")�� ��";
	}

	public static void main(String[] args) {
		ColorPoint2 zeroPoint = new ColorPoint2();
		System.out.println(zeroPoint.toString() + "�Դϴ�.");

		ColorPoint2 cp = new ColorPoint2(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "�Դϴ�.");
		System.out.println("2210701 ���ֿ�");
	}

}
