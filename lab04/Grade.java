package exercise;

import java.util.Scanner;

public class Grade {
	// ����, ����, ���� ���� ���� ����
	private int math, science, english;
	
	// Grade ������ (�Ķ���ͷ� ����, ����, ���� ����)
	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	// ��� ���ϴ� �Լ� ����
	public double average() {
		double a;
		a = (double)(math + science + english) / 3;
		return a;
	}
	
	public static void main(String[] args) {
		// �ǽ� �ڷ��� ���� �Լ��� ����
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = scan.nextInt();
		int science = scan.nextInt();
		int english = scan.nextInt();
		// ������� �Է����κ��� �޾ƿ� ������ ������ ��ü ����
		Grade me = new Grade(math, science, english);
		// Grade Ŭ������ �޼ҵ带 ������ ��� ���
		System.out.println("����� " + me.average());
		
		scan.close();
		
	}

}
