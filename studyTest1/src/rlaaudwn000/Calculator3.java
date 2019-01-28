package rlaaudwn000;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class Calculator3 extends JFrame implements KeyListener {
	
	JPanel mainPanel;
	JLabel explain;
	JLabel test;
	JTextArea inputArea;
	
	public Calculator3() {
		
		mainPanel = new JPanel();
		mainPanel.setBorder(new TitledBorder("panel"));
		mainPanel.setLayout(new BorderLayout());
		
		setContentPane(mainPanel);
		
		inputArea = new JTextArea("0");
		
		explain = new JLabel("설명창입니다.", JLabel.RIGHT);
		
		test = new JLabel("test입니다", JLabel.RIGHT);
		
		mainPanel.add(inputArea, BorderLayout.NORTH);
		mainPanel.add(explain, BorderLayout.CENTER);
		mainPanel.add(test, BorderLayout.SOUTH);
		
		inputArea.addKeyListener(this);
		
		setTitle("Calculator");
		setSize(300, 200);
		setLocationRelativeTo(null);	// 창을 가운데로
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Calculator3 cal = new Calculator3();
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {	// 키보드 눌렀을떄 가장 먼저 실행
		// TODO Auto-generated method stub
		System.out.println("1");
		int keynum = arg0.getKeyCode();
		char key = arg0.getKeyChar();
		
		System.out.println(key);
		System.out.println(keynum);
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {	// 키보드 누루고 떗을때 마지막 실행
		// TODO Auto-generated method stub
		System.out.println("2");
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {	// 키 타입에 따라.. 두번쨰 실행
		// TODO Auto-generated method stub
		System.out.println("3");
		
		char key = arg0.getKeyChar();
		int f = 0;
		int s = 0;
		int result = 0;
		
		if(key == 10) {
			explain.setText(inputArea.getText());
			inputArea.setText("");
		}
		
		if(key == 42 || key == 43 || key == 45 || key == 47 && key == 10) {
			if(key == 42) {
				result = f + s;
			}
		} else if( !Character.isDigit(key) ) {
			arg0.consume();
		}
		
		
	}
}
