import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MultiPanelFrame extends JFrame{ // JFrame 상속

	public JPanel getNorthPanel() {
		//JPanel 생성
		JPanel jp1 = new JPanel();
		//north panel 에 존재하는 버튼 3개 생성(열기, 닫기, 나가기)
		jp1.add(new JButton("열기"));
		jp1.add(new JButton("닫기"));
		jp1.add(new JButton("나가기"));
		//panel 에 붙이기
		add(jp1);
		//panel return
		return jp1;
	}
	
	public JPanel getSouthPanel() {
		//JPanel 생성
		JPanel jp2 = new JPanel();
		//button 생성 - "Word Input"
		JButton btn = new JButton("Word Input");
		//size 15인 textField 생성
		JTextField txt = new JTextField(15);
		//panel 에 button, textfield 붙이기 
		jp2.add(btn);
		jp2.add(txt);

		//panel return
		return jp2;
	}
	
	public int getRandomLocation() {
		// return random 한 값 20~220
		Random random = new Random();
		return random.nextInt(200) + 20;
	}
	
	public JPanel getCenterPanel() {
		//JPanel 생성
		JPanel jp3 = new JPanel(); 
		//layout null 로 설정
		jp3.setLayout(null);
		//배경색 흰색으로 설정
		setBackground(Color.WHITE);
		// size 5 인 JLabel list 생성
		JLabel jl[] = new JLabel[5];
		//jlabel length for loop....
		for (int i=0; i<jl.length; i++) {
			//각 요소 별 JLabel 생성 "*"
			JLabel label = new JLabel("*");
			//fontcolor - setForegroud 함수 사용
			label.setForeground(Color.RED);
			//size 10*10
			label.setSize(10, 10);
			//location 설정 - getRandomLocation 호출
			label.setLocation(getRandomLocation(), getRandomLocation());
			//panel 에 label 붙이기
			jp3.add(label);
		}
		//return panel 
		return jp3;
	}
	
	public MultiPanelFrame() {
		
		//부모 생성자 호출, parameter : 학번 + 이름 + 클래스 이름;
		super("2210701 김주영 - MultiPanelFrame");
		//DefaultCloseOperation- JFrame.EXIT_ON_CLOSE
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//panel 하나 생성
		JPanel panel = new JPanel();
		//BorderLayout 으로 설정
		panel.setLayout(new BorderLayout());
		//각 위치 별 panel 붙이기(함수 호출 getNorth...)
		panel.add(getNorthPanel(), "North");
		panel.add(getSouthPanel(), "South");
		panel.add(getCenterPanel(), "Center");
		//panel 붙이기
		add(panel);
		//visible 설정
		setVisible(true);
		//size 350*350  
		setSize(350, 350);
	}

	public static void main(String[] args) {
		new MultiPanelFrame();
	}

}
