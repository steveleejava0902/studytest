package tmkim;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class Calculator2 extends JFrame implements KeyListener {
	
	JPanel mainPanel;
	JTextArea inputArea;
	JLabel explain, test;
	
	public Calculator2() {
		
		mainPanel = new JPanel();
		mainPanel.setBorder(new TitledBorder("panel"));
		mainPanel.setLayout(new BorderLayout());
		
		setContentPane(mainPanel);
		
		//JFrame안에 패널을 만들고 안에 컴포넌트들을 추가 함.
		
		inputArea = new JTextArea("");
		
		explain = new JLabel("설명창입니다.", JLabel.RIGHT);
		//explain에 있는 창에 Text를 바꾸고 싶을 때
		explain.setText("testexplain");
		
		test = new JLabel("test입니다",JLabel.RIGHT);
		
		//이제 얘네를 패널에다가 넣자.
		
		mainPanel.add(inputArea, BorderLayout.NORTH);	//레이아웃을 사용해서 5가지 위치에 쉽게 배치가 가능 함.
		mainPanel.add(explain,BorderLayout.CENTER);
		mainPanel.add(test,BorderLayout.SOUTH);
		
		//키보드 입력이 어디서 적용이 될지를 지정 해 줘야 함.
		inputArea.addKeyListener(this);	//해당 클래스에 구현 해 놓은 keyMethod가 inputArea에 적용이 되도록
		
		
		setTitle("calculator");
		setSize(300, 200);
		setLocationRelativeTo(null); // null을 주면 창을 가운데로 배치.
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Calculator2 c2 = new Calculator2();
	
	}
	//Pressed -> Typed -> Released
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	// + 61 , - 45 , * 56, /47
	
	@Override
	public void keyPressed(KeyEvent arg0) {

		// TODO Auto-generated method stub
		int keyNum = arg0.getKeyCode(); 
		System.out.println("keyNum:" + keyNum);
		
		char key = arg0.getKeyChar();
		System.out.println("key:" + key);

		if(keyNum == 10 ) {
			String str = inputArea.getText();
			explain.setText(str);
			inputArea.setText("");
		}
		
		if (key == 42 || key == 43 || key == 45 || key == 47) {
			
		} else if(!Character.isDigit(key)) {
			arg0.consume();//해석을 하면 소비 -> 입력 된 키값을 무시해라
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	
	

}
