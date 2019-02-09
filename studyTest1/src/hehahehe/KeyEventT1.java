package hehahehe;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class KeyEventT1 extends JFrame implements KeyListener {
	
		
	JPanel mainPanel;
	JTextField inputDisplay;
	JLabel explainDisplay;
	//0- first, 1- operation, 2- second, 3- result
	static int MODE = 0;
	String firstNum = ""; 
	String operation = "";
	String secondNum = "";
	String result = "";
	
	public KeyEventT1() {
		setSize(300, 200);
		setTitle("key test");
		setLocationRelativeTo(null);

		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());

		inputDisplay = new JTextField();
		inputDisplay.setBorder(new TitledBorder("input"));
		inputDisplay.addKeyListener(this);

		explainDisplay = new JLabel("입력해주세요");
		explainDisplay.setBorder(new TitledBorder("output"));

		mainPanel.add(inputDisplay, BorderLayout.NORTH);
		mainPanel.add(explainDisplay, BorderLayout.CENTER);

		setContentPane(mainPanel);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
	
	
	public static void main(String[] args){
		KeyEventT1 t1 = new KeyEventT1(); 
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		char key = e.getKeyChar();
		if( MODE == 0 && !Character.isDigit(e.getKeyChar())   ){
			e.consume();			
		}else if (MODE == 1 && 
				!( key == 45 || key == 47 || key == 61 || key == 10) ){
			e.consume();
		}
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char key = e.getKeyChar();
		int keyNum = e.getKeyCode();
		
		System.out.println(keyNum);
		System.out.println(key);
		
		result = firstNum + operation+ secondNum;
		if (keyNum == 10 ){
			if( MODE == 0 ){
				firstNum = inputDisplay.getText();
				MODE = 1;
			}
			if( MODE == 1 ) {
				operation = inputDisplay.getText();
				MODE = 2;
			}
			if( MODE == 2 ){
				secondNum = inputDisplay.getText();
				MODE = 3;
			}
			
			explainDisplay.setText(result);
			inputDisplay.setText("");
		}
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}