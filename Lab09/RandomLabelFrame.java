import java.awt.Color;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RandomLabelFrame extends JFrame{ // JFrame 상속
	
	// Random 객체 생성
	Random random = new Random();
	// JPanel 생성
	JPanel jp = new JPanel();
	// 크기 20 인 JLable 배열 생성
	JLabel j1[] = new JLabel[20];
	
	public int getLabelLocation() {
		//return random 한 값 50 ~ 250
		return random.nextInt(200) + 50;
	}

	// RandomLabelFrame 생성자
	public RandomLabelFrame() {
		// 부모 생성자 호출, parameter : 학번 + 이름 + 클래스 이름;
		super("2210701 김주영 - RandomLabelFrame");
		// panel layout null로 설정
		jp.setLayout(null);
		// label list length for loop..
		for (int i=0; i<j1.length; i++) {
			// 각 요소에 JLabel 생성
			j1[i] = new JLabel(Integer.toString(i));
			// 배경색 노란색
			j1[i].setBackground(Color.YELLOW);
			// setOpaque true 로 설정
			j1[i].setOpaque(true);
			// size 15*10 
			j1[i].setSize(15, 10);
			// location 설정 -> getLabelLocation 호출
			j1[i].setLocation(getLabelLocation(), getLabelLocation());
			// panel 에 label 붙이기
			jp.add(j1[i]);
		}
		// panel 붙이기
		add(jp);
		// visible 설정
		setVisible(true);
		// size 300*300
		setSize(300, 300);
	}
	
	public static void main(String[] args) {
		new RandomLabelFrame();
	}

}
