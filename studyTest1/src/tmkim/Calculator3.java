package tmkim;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class Calculator3 extends JFrame implements KeyListener{

	JPanel mainPanel;
	JTextArea inputArea;
	JLabel explain, test;
	static int count = 0;
	static String str = "";
	
	public Calculator3() {
		
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
		
		mainPanel.add(inputArea, BorderLayout.NORTH);	//레이아웃을 사용해서 5가지 위체에 쉽게 배치가 가능 함.
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
		Calculator3 c3 = new Calculator3();
	
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
		System.out.println("숫자만 입력 가능 한 순서입니다.");
		char key = arg0.getKeyChar();
		System.out.println("key2:" + key);
	
		System.out.println("count:" + count);
		
		str += inputArea.getText();
		
		if(count == 0 || count == 2) { //숫자만
			System.out.println("숫자만 입력 가능 한 순서입니다.");
			if(Character.isDigit(key)) {					//숫자들
				System.out.println("숫자네");
				
			}else {
				System.out.println("숫자만 입력 해 주세요.");
				inputArea.setText("");
			}
			
		} else if(count == 1) {			//연산자 차례
			if (key == 42 || key == 43 || key == 45 || key == 47) { //연산자
				System.out.println("연산자 입니다.");
			} else {
				System.out.println("연산자만 입력 해 주세요");
			}
			count++;
		}
		
		if(keyNum == 10 ) {
			explain.setText(str);
			inputArea.setText("");
			count++;
		}
		
		
/*		if (key == 42 || key == 43 || key == 45 || key == 47) { //연산자
			
		} else if(!Character.isDigit(key)) {					//숫자들
			arg0.consume();//해석을 하면 소비 -> 입력 된 키값을 무시해라
		}*/
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

}
