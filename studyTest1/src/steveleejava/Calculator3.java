package steveleejava;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Calculator3 extends JFrame implements KeyListener {

	String OPERATION="",FIRSTNUM="",SECONDNUM="",RESULT="";
	
	/*
	 * MODE = 0 FIRSTNUM입력준비 MODE = 1연산기호입력준비 MODE = 2 SECONDNUM입력준비 MODE = 3 계산하기
	 */	
	
	static int MODE=0;

	JPanel mainPanel;
	JLabel operationArea, explainLabel;
	JTextField inputLabel;
	// JFormattedTextField inputLabel;

	public static void main(String[] arg) {
		Calculator3 t1 = new Calculator3();

	}

	public Calculator3() {

		mainPanel = new JPanel();
		mainPanel.setBorder(new TitledBorder("panel"));
		mainPanel.setLayout(new BorderLayout());

		// inputLabel = new JFormattedTextField(new NumberFormatter());
		inputLabel = new JTextField();
		inputLabel.setBorder(new TitledBorder("input"));
		
		operationArea = new JLabel();
		operationArea.setBorder(new TitledBorder("operation"));
		

		explainLabel = new JLabel();
		explainLabel.setBorder(new TitledBorder("explain"));

		mainPanel.add(inputLabel, BorderLayout.NORTH);
		mainPanel.add(operationArea, BorderLayout.CENTER);
		mainPanel.add(explainLabel, BorderLayout.SOUTH);

		inputLabel.addKeyListener(this);

		setContentPane(mainPanel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setTitle("calculator");
		setSize(300, 300);
		setVisible(true);
		setLocationRelativeTo(null);

		inputLabel.requestFocus();
		

	}


	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		int keyNum = e.getKeyCode();
		char key = e.getKeyChar();

		System.out.println("MODE:" + MODE + " / KEY:"+key);
		//숫자이면 true , 숫자가 아니면 consume 즉 이벤트를 그냥 소비해 버린다.
		if((MODE == 1 ) && (key == 42 || key == 43 || key == 45 || key == 47 || key == 61 || key == 10)) {
			System.out.println("1");
		}else if((MODE == 0 || MODE == 2) && !Character.isDigit(key) ) { 
			System.out.println("2");
			e.consume(); return; 			
		}else if((MODE == 1 )  ) { 
			System.out.println("3");
			e.consume(); return;
		}
		 

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int keyNum = e.getKeyCode();
		if(keyNum == 10 && MODE == 0) {
			FIRSTNUM = inputLabel.getText();
			inputLabel.setText(""); 
			MODE = 1;
		}else if(keyNum == 10 && MODE == 1) {
			OPERATION = inputLabel.getText();
			inputLabel.setText(""); 
			MODE = 2;
		}else if(keyNum == 10 && MODE == 2) {
			SECONDNUM = inputLabel.getText();
			inputLabel.setText(""); 
			MODE = 3;
			
		}
		
		if(MODE == 3) {
			operationArea.setText(FIRSTNUM+OPERATION+SECONDNUM+"=");
			MODE = 0;
			OPERATION="";
			FIRSTNUM="";
			SECONDNUM="";
		}else {
			operationArea.setText(FIRSTNUM+OPERATION+SECONDNUM);
		}
		

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
