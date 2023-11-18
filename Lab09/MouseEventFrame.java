import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventFrame extends JFrame {
	public MouseEventFrame() {
		// title ���� (�й� �̸� - Ŭ���� �̸�)
		super("2210701 ���ֿ� - MouseEventFrame");
		// default close operation
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Container ���� = getContentPane();
		Container c = getContentPane();
		
		// container flow layout ����
		c.setLayout(new FlowLayout());
		
		// Label - "Love Java" ����
		JLabel label = new JLabel("Love Java");
		// container �� label �߰�
		c.add(label);
		
		//label �� mouseListener �߰� (param - MouseAdapter()) => �͸�Ŭ���� ����
		label.addMouseListener(new MouseAdapter() {
			//mouseEntered(MouseEvent e)
			@Override
			public void mouseEntered(MouseEvent e) {
				// e.getSource�� �̺�Ʈ �߻��� JLabel ��������
				JLabel la = (JLabel) e.getSource();
				//label setText "Love Java" 
				la.setText("Love Java");
			}
			//mouseExited(MouseEvent e)
			@Override
			public void mouseExited(MouseEvent e) {
				// e.getSource�� �̺�Ʈ �߻��� JLabel ��������
				JLabel la = (JLabel) e.getSource();
				//label setText "�����" 
				la.setText("�����");
			}
		});
				
		// size 250 * 150
		setSize(250, 150);
		// visible true
		setVisible(true);
	}
	static public void main(String [] args) {
		new MouseEventFrame();
	}
}
