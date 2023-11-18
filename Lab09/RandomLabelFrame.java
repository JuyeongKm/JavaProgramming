import java.awt.Color;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RandomLabelFrame extends JFrame{ // JFrame ���
	
	// Random ��ü ����
	Random random = new Random();
	// JPanel ����
	JPanel jp = new JPanel();
	// ũ�� 20 �� JLable �迭 ����
	JLabel j1[] = new JLabel[20];
	
	public int getLabelLocation() {
		//return random �� �� 50 ~ 250
		return random.nextInt(200) + 50;
	}

	// RandomLabelFrame ������
	public RandomLabelFrame() {
		// �θ� ������ ȣ��, parameter : �й� + �̸� + Ŭ���� �̸�;
		super("2210701 ���ֿ� - RandomLabelFrame");
		// panel layout null�� ����
		jp.setLayout(null);
		// label list length for loop..
		for (int i=0; i<j1.length; i++) {
			// �� ��ҿ� JLabel ����
			j1[i] = new JLabel(Integer.toString(i));
			// ���� �����
			j1[i].setBackground(Color.YELLOW);
			// setOpaque true �� ����
			j1[i].setOpaque(true);
			// size 15*10 
			j1[i].setSize(15, 10);
			// location ���� -> getLabelLocation ȣ��
			j1[i].setLocation(getLabelLocation(), getLabelLocation());
			// panel �� label ���̱�
			jp.add(j1[i]);
		}
		// panel ���̱�
		add(jp);
		// visible ����
		setVisible(true);
		// size 300*300
		setSize(300, 300);
	}
	
	public static void main(String[] args) {
		new RandomLabelFrame();
	}

}
