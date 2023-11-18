import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MoveStringFrame extends JFrame{ //JFrame ���

	public MoveStringFrame() { //MoveStringFrame ������
		// title ����
		super("2210701 ���ֿ� - MoveStringFrame");
		// Panel ����
		JPanel panel = new JPanel();
		// Label ���� - default "Love Java"
		JLabel jl = new JLabel("Love Java");
		// panel �� label ���̱�
		panel.add(jl);
		
		// label �� keyListener �߰� (param - KeyAdapter()) => �͸�Ŭ���� ����
		jl.addKeyListener(new KeyAdapter() {
			// keyPressed (KeyEvent e)
			public void keyPressed(KeyEvent e) {
				// e.getKeyCode() == ����Ű ���� (VK_LEFT) �� ���,
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {					
					// label = e.getSource �޾ƿ���
					JLabel label = (JLabel)e.getSource();
					// label text ��������
					String text = label.getText();
					// ù����, ������ ���� ������
					String fir = text.substring(0,1);
					String str = text.substring(1);
					
					// label setText
					jl.setText(str + fir);
				}
			}
		});
			
		// label setFocusable(true) ����
		jl.setFocusable(true);
		// requestFocus ���� (������Ʈ�� ��Ŀ�� ����)
		jl.requestFocus();
		// Panel �߰�
		this.add(panel);
		// size 400 * 200
		setSize(400,200);
		// default close operation
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// visible true
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MoveStringFrame();
	}

}
