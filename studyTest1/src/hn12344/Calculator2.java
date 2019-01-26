package hn12344;

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
          Calculator2 c2 = new Calculator2();
	}
	
	public Calculator2(){
		
		mainPanel = new JPanel();
		mainPanel.setBorder(new TitledBorder("panel"));
		mainPanel.setLayout(new BorderLayout()); // BorderLayout을 통해 컴포넌트들을 위치 시킬 수 있다.
		
		setContentPane(mainPanel);
		
		inputArea = new JTextArea("0"); //초기값을 0을로 주어 한줄을  차지한다.
		
		explain = new JLabel("설명창입니다.", JLabel.RIGHT);
		
		
		test = new JLabel("test입니다",JLabel.RIGHT);
		
		mainPanel.add(inputArea, BorderLayout.NORTH);  //패널에 추가한다.
		mainPanel.add(explain, BorderLayout.CENTER);
		mainPanel.add(test, BorderLayout.SOUTH);
		
		inputArea.addKeyListener(this);
		
		
		setTitle("calculator"); //타이틀
		setSize(300, 300);  //실했을때 사이즈
		setLocationRelativeTo(null); //창을 가운데로 간다.
		setVisible(true); //현재만든 프레임을 보여달라.
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("2");
        char key = e.getKeyChar();  //무엇을 눌렀는지 확인 가능.
		
		if(key == 10){
			explain.setText(inputArea.getText());
			inputArea.setText("");
		}
		
	}

	//키보드 눌렀을때 반응
	@Override
	public void keyPressed(KeyEvent e) { 
		// TODO Auto-generated method stub
		System.out.println("1");
		
		int keyNum = e.getKeyCode();
		
		/*char key = e.getKeyChar();  //무엇을 눌렀는지 확인 가능.
		
		if(key == 10){
			explain.setText(inputArea.getText());
			inputArea.setText("");
		}*/
		/*System.out.println(key);*/
		System.out.println(keyNum);
		
	}

	//키보드를 손에서 떼엇을때
	@Override
	public void keyReleased(KeyEvent e) {  
		// TODO Auto-generated method stub
		System.out.println("3");
		
	}

}
