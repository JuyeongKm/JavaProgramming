
public class ColorPoint extends Point { // extends ��ӹ��� �θ� Ŭ����
	// ���� ���� ���� (private)
	private String color;
	// ������ -> x, y, ���� ����
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	// setXY -> x, y ���� ���� �Լ�
	public void setXY(int x, int y) {
		move(x, y);
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
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "�Դϴ�.");
	}

}
