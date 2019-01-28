package halucinor;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class Calculator2 extends JFrame implements KeyListener{
	
	JPanel mainPanel;
	JTextArea inputArea;
	JLabel explain;
	//Ctrl shift O
	
	public Calculator2() {
		
		mainPanel = new JPanel();
		mainPanel.setBorder(new TitledBorder("panel"));
		mainPanel.setLayout(new BorderLayout());
		
		setContentPane(mainPanel);
		
		inputArea = new JTextArea("");
		
		explain = new JLabel("설명창 입니다", JLabel.RIGHT);
		
		mainPanel.add(inputArea, BorderLayout.NORTH);
		mainPanel.add(explain, BorderLayout.CENTER);
		// Ctrl alt 화살표 아래
		
		inputArea.addKeyListener(this);
		
		
		
		setTitle("calculator");
		setSize(300,200);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] arg) {
		Calculator2 c2 = new Calculator2();
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		char key = e.getKeyChar();
		
		System.out.println("key typed");
		
		if(key == 10) {
			String inputText = inputArea.getText();
			
			explain.setText(inputText);
			inputArea.setText("");
			
		}
		
		if(key == 42 || key == 43 || key == 45 || key == 47) {
			
		}else if( !Character.isDigit(key)) {
			e.consume();
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	
}
