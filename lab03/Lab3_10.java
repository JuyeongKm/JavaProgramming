package hw;

public class Lab3_10 {

	public static void main(String[] args) {
		// 4 x 4 �迭 ����
		int n[][] = new int[4][4];
		// for������ 10�� �ݺ�
		for (int i=0; i<10; i++) {
			
			// row�� �ش��ϴ� ���� ���� - 0~3
			int r = (int)(Math.random()*4);
			// column�� �ش��ϴ� ���� ���� - 0~3
			int c = (int)(Math.random()*4);
			// if : 0�� �ƴ϶�� - �̹� 2���� �迭 �ش� row,column�� ���ڰ� �����Ѵٸ�
			// �ϳ��� iteration �ٽ� �ݺ�
			if (n[r][c] != 0) {
				i--;
			}
			else
				n[r][c] = (int)(Math.random()*10+1);

		// ���� - ����ؼ� ���ڰ� �����ϴ� row, column�� ���� �� ������ ����
		// else

		// 1~10 ������ ���� ����
		}

		// 2�� for���� ����ؼ� ���
		for (int j=0; j<n.length; j++) {
			for (int k=0; k<n[j].length; k++) {
				System.out.print(n[j][k] + " ");
			}
			System.out.println();
		}

		// ��� : n[i][j] + "\t"

		// new line�� ����
		}

	}


