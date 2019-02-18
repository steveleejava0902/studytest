package tmkim;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Swing extends JFrame{
	//창만 띄우는 건 Frame만으로 가능 함. 
	JPanel mainPanel;
	JTextField inputDisplay;
	JLabel operationDisplay, explainDisplay;
	
	public Swing() {
		setSize(300, 200);
		setTitle("계산기");
		setLocationRelativeTo(null);						// center로 배치시키는 방법은 많음 그 중 하나임.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// javaw.exe가 프로세스에서 종료가 되도록 swing에서 쓰는 창은 직접 close시켜줘야 함. 
		
		mainPanel = new JPanel();							// 1. Panel을 추가한다.
		mainPanel.setLayout(new BorderLayout());			//    Panel의 레이아웃을 설정 한다.
		
		setContentPane(mainPanel);							//    Frame에 panel을 부여한다.
		
		inputDisplay = new JTextField();					// 2. 값을 입력 할 수 있는 TextField를 생성한다.
		mainPanel.add(inputDisplay,BorderLayout.NORTH);		// 	  add의 인잣 값이 두개면 컴포넌트 + 위치 설정 
		
		
		operationDisplay = new JLabel("입력창에 입력 하시오.",JLabel.RIGHT);
		mainPanel.add(operationDisplay,BorderLayout.CENTER);
		
		explainDisplay = new JLabel("설명창 입니다.",JLabel.RIGHT);
		mainPanel.add(explainDisplay,BorderLayout.SOUTH);
		
		setVisible(true); //화면에 보여지게 하기 위해서 

	}
}
