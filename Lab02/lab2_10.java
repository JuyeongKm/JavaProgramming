package hw;

import java.util.Scanner;

public class lab2_10 {

	public static void main(String[] args) {
	      // Scanner ��ü ����
	      Scanner scan = new Scanner(System.in);
	      // ��� ("���� �߽� x1, y1, ������ radius1 >> ")
	      System.out.print("���� �߽� x1, y1, ������ radius1 >>");
	      
	      int x1 = scan.nextInt();
	      int y1 = scan.nextInt();
	      int r1 = scan.nextInt();// x1, y1, r1 �Է�
	      
	      // ��� ("���� �߽� x2, y2, ������ radius2 >> "
	      System.out.print("���� �߽� x2, y2, ������ radius2 >>");
	      int x2 = scan.nextInt();
	      int y2 = scan.nextInt();
	      int r2 = scan.nextInt();// x2, y2, r2 �Է�
	      
	      // �� ���� �߽� ������ �Ÿ� ���ϱ� (Math.sqrt, Math.pow Ȱ��)
	      double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	      // ������ �հ� �߽� ������ �Ÿ� �̿�
	      if (distance < r1 + r2)
	    	  System.out.println("�� ���� ���� ��ģ��.");
	      else
	    	  System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
	         // ���
	      
	         // ���
	      // scanner �ݱ�
	      scan.close();
	}

}
