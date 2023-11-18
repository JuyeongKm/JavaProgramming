import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class MouseDraggingFrame extends JFrame{ // JFrame ���
	
	public MouseDraggingFrame() { //MouseDraggingFrame ������
		// title ���� (�й� �̸� - Ŭ���� �̸�)
		super("2210701 ���ֿ� - MouseDraggingFrame");
		// Container ���� = getContentPane();
		Container c = getContentPane();
		// container �� ���� ���� - default Green
		c.setBackground(Color.green);
		
		// MyMouseListener ����
		MyMouseListener ml = new MyMouseListener();
		// container �� mouseListener �߰�
		c.addMouseListener(ml);
		// container �� mouseMotionListener �߰�
		c.addMouseMotionListener(ml);
		// size 400 * 200
		setSize(400, 200);
		// default close operation
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// visible true
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter{ //MouseAdapter ���
		public void mouseDragged(MouseEvent e) {
			// Container ���� = e.getSource();
			Container c = (Container) e.getSource();
			// ���� ���� - yellow
			c.setBackground(Color.yellow);
		}

		public void mouseReleased(MouseEvent e) {
			// Container ����;
			Container c = (Container) e.getSource();
			// ���� ���� - green
			c.setBackground(Color.green);
		}
	}
	
	public static void main(String[] args) {
		new MouseDraggingFrame();
	}

}
