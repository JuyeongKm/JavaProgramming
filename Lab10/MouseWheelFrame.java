import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseWheelFrame extends JFrame{ //JFrame ���

	public MouseWheelFrame() {
		// title ���� (�й� �̸� - Ŭ���� �̸�)
		super("2210701 ���ֿ� - MouseWheelFrame");
		// default close operation
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ��ġ������ ���� -FlowLayout
		setLayout(new FlowLayout());
		// "Love Java" �ؽ�Ʈ ��
		JLabel la = new JLabel("Love Java");
		// add label
		add(la);
		// "Arial", plain, 15 �ȼ� ũ��
		la.setFont(new Font("Arial", Font.PLAIN, 15));
		// �󺧿�  mouseWheelListener �߰� �� �͸� Ŭ���� ����
		la.addMouseWheelListener(new MouseWheelListener() {
			// mouseWheelMoved(MouseWheelEvent e)
			public void mouseWheelMoved(MouseWheelEvent e) {
				// e.getWheelRotation() ���� ���� ������ ��������
				int n = e.getWheelRotation();
				// ������ �������� 0���� �۴ٸ� -> ���� �� ������
				if(n<0) //���� �� ������
				{
					// e.getSource�� �̺�Ʈ �߻��� JLabel ��������
					JLabel la = (JLabel)e.getSource();
					// label�� font �������� - getFont()
					Font f = la.getFont();
					// font �� ���� size �������� - getSize()
					int size = f.getSize();
					// 5�ȼ� ���Ϸ� �۾����� �ʵ��� return
					if(size <= 5)
						return;
					// �������� 5�ȼ� �۾������� ����
					la.setFont(new Font ("Arial", Font.PLAIN, size - 5));
				}
				// ������ �������� 0���� ũ�ٸ� -> �Ʒ� �� ������
				else {
					// e.getSource�� �̺�Ʈ �߻��� JLabel ��������
					JLabel la = (JLabel)e.getSource();
					// label�� font �������� - getFont()
					Font f = la.getFont();
					// font �� ���� size �������� - getSize()
					int size = f.getSize();
					// �������� 5�ȼ� Ŀ������ ����
					la.setFont(new Font ("Arial", Font.PLAIN, size + 5));
				}
			}
		});		
		
		// size 300*150
		setSize(300, 150);
		// visible true
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseWheelFrame();
	}

}
