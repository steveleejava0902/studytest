package steveleejava;

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
	JLabel explain,test;
	
	public Calculator2() {
		
		mainPanel = new JPanel();
		mainPanel.setBorder(new TitledBorder("panel"));
		mainPanel.setLayout(new BorderLayout());
		
		setContentPane(mainPanel);		
		
		inputArea = new JTextArea("0");
		
		explain = new JLabel("설명창입니다.",JLabel.RIGHT);
		explain.setText("testexplain");
		
		test = new JLabel("test입니다",JLabel.RIGHT);
		
		mainPanel.add(inputArea, BorderLayout.NORTH);
		mainPanel.add(explain, BorderLayout.CENTER);
		mainPanel.add(test, BorderLayout.SOUTH);

		inputArea.addKeyListener(this);
		
		setTitle("calculator");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public static void main(String[] arg) {
		Calculator2 c2 = new Calculator2();
		
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("1");
		int keyNum = arg0.getKeyCode();
		char key = arg0.getKeyChar();
		System.out.println(key);
		
		System.out.println(keyNum);
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("2");
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("3");
	}
	

}
