package halucinor;

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
	JLabel explain;
	
	int Stage = 0;
	String resultText = "";
	//Ctrl shift O
	
	public Calculator3() {
		
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
		Calculator3 c3 = new Calculator3();
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		char key = e.getKeyChar();
		
		if(key == 10) {			
			String inputText = inputArea.getText();		
			resultText = resultText + inputText;			
			explain.setText(resultText);
			
			Stage++;
			
			if (Stage > 2) {
				Stage = 0;
				
				explain.setText(resultText);
				resultText = "";
			}
			

			inputArea.setText("");
					
		}
		
		if(Stage == 0 ) {
			if(!Character.isDigit(key)) {
				e.consume();
			}
		}
		
		if(Stage == 1) {
			if(!(key == 42 || key == 43 || key == 45 || key == 47)) {
				e.consume();
			}
		}
		
		if(Stage == 2) {
			if(!Character.isDigit(key)) {
				e.consume();
			}
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
