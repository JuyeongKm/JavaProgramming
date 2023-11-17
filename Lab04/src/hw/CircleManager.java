package hw;

import java.util.Scanner;

class Circle{
	// double �� x, y ����
	private double x, y;
	// ������ ����
	private int r;
	
	// Circle ������ (�Ķ���� - x, y, ������)
	public Circle(double x, double y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	// show �Լ� ()
	public void show() {
		System.out.print("("+ x + "," + y + ") " + r);
	}
	
	// getArea() �Լ� : ���� ���ϴ� �Լ� �߰� ����
	public int getArea() {
		return r * r;
	}
	
}

public class CircleManager {

	public static void main(String[] args) {
		// Scanner ��ü ����
		Scanner scan = new Scanner(System.in);
		// 3���� Circle �迭 ����
		Circle c[] = new Circle[3];
		// ���� ū ������ ������ ����
		int max = 0;
		// ���� ū ������ ������ ��ü�� index�� ������ ����
		int maxidx = 0;
		
//		for(int i = 0; i<Circle �迭 ����; i++) {
//			System.out.print("x, y, radius >>");
		for(int i=0; i<c.length; i++) {
			System.out.print("x, y, radius >>");
			
			// x �� �б�
			double x = scan.nextDouble();
			// y �� �б�
			double y = scan.nextDouble();
			// ������ �б�
			int r = scan.nextInt();
			// c[i] = ... //  Circle ��ü ����(hint : ������)
			c[i] = new Circle(x, y, r);
		
		}
					
//		}
//		for(int i = 0; i<c.length; i++)
			//  getArea()�޼ҵ� ����Ͽ� ������ �ִ밪���� Ȯ�� �� max/maxidx update 
		for(int i=0; i<c.length; i++)
			if (c[i].getArea() > c[maxidx].getArea()) {
				maxidx = i;
				max = (int)c[maxidx].getArea();
			}
		
		// ������ ���� - show() �Լ��� getArea()�Լ� ����Ͽ� ���
		System.out.print("���� ������ ū ���� ");
		c[maxidx].show();
		System.out.println("�̸�, ������ " + max + "�Դϴ�.");
		System.out.println("2210701 ���ֿ�");
		// Scanner �ݱ�
		scan.close();
	}

}
