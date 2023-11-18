import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MultiPanelFrame extends JFrame{ // JFrame ���

	public JPanel getNorthPanel() {
		//JPanel ����
		JPanel jp1 = new JPanel();
		//north panel �� �����ϴ� ��ư 3�� ����(����, �ݱ�, ������)
		jp1.add(new JButton("����"));
		jp1.add(new JButton("�ݱ�"));
		jp1.add(new JButton("������"));
		//panel �� ���̱�
		add(jp1);
		//panel return
		return jp1;
	}
	
	public JPanel getSouthPanel() {
		//JPanel ����
		JPanel jp2 = new JPanel();
		//button ���� - "Word Input"
		JButton btn = new JButton("Word Input");
		//size 15�� textField ����
		JTextField txt = new JTextField(15);
		//panel �� button, textfield ���̱� 
		jp2.add(btn);
		jp2.add(txt);

		//panel return
		return jp2;
	}
	
	public int getRandomLocation() {
		// return random �� �� 20~220
		Random random = new Random();
		return random.nextInt(200) + 20;
	}
	
	public JPanel getCenterPanel() {
		//JPanel ����
		JPanel jp3 = new JPanel(); 
		//layout null �� ����
		jp3.setLayout(null);
		//���� ������� ����
		setBackground(Color.WHITE);
		// size 5 �� JLabel list ����
		JLabel jl[] = new JLabel[5];
		//jlabel length for loop....
		for (int i=0; i<jl.length; i++) {
			//�� ��� �� JLabel ���� "*"
			JLabel label = new JLabel("*");
			//fontcolor - setForegroud �Լ� ���
			label.setForeground(Color.RED);
			//size 10*10
			label.setSize(10, 10);
			//location ���� - getRandomLocation ȣ��
			label.setLocation(getRandomLocation(), getRandomLocation());
			//panel �� label ���̱�
			jp3.add(label);
		}
		//return panel 
		return jp3;
	}
	
	public MultiPanelFrame() {
		
		//�θ� ������ ȣ��, parameter : �й� + �̸� + Ŭ���� �̸�;
		super("2210701 ���ֿ� - MultiPanelFrame");
		//DefaultCloseOperation- JFrame.EXIT_ON_CLOSE
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//panel �ϳ� ����
		JPanel panel = new JPanel();
		//BorderLayout ���� ����
		panel.setLayout(new BorderLayout());
		//�� ��ġ �� panel ���̱�(�Լ� ȣ�� getNorth...)
		panel.add(getNorthPanel(), "North");
		panel.add(getSouthPanel(), "South");
		panel.add(getCenterPanel(), "Center");
		//panel ���̱�
		add(panel);
		//visible ����
		setVisible(true);
		//size 350*350  
		setSize(350, 350);
	}

	public static void main(String[] args) {
		new MultiPanelFrame();
	}

}
