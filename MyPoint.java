
public class MyPoint {
	//int �� x, y ����(private)
	private int x,y;
	// MyPoint ������ - param(x, y)
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// equals �Լ� (return boolean) 
	public boolean equals(MyPoint q) {
		if (x == q.x && y == q.y)
			return true;
		return false;
	}
	// toString �Լ� (return String)
	public String toString() {
		return "Point(" + x + ", " + y + ")";
	}
	
	public static void main(String[] args) {
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);
		System.out.println(p);
		if (p.equals(q))
			System.out.println("������");
		else
			System.out.println("�ٸ���");
	}

}
