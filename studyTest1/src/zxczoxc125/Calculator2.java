package zxczoxc125;

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
	JLabel explain;

	public Calculator2() {
		mainPanel = new JPanel();
		mainPanel.setBorder(new TitledBorder("panel"));
		mainPanel.setLayout(new BorderLayout());

		setContentPane(mainPanel);

		inputArea = new JTextArea("0");

		explain = new JLabel("설명창입니다.", JLabel.RIGHT);

		mainPanel.add(inputArea, BorderLayout.NORTH);
		mainPanel.add(explain, BorderLayout.CENTER);

		inputArea.addKeyListener(this);

		setTitle("Calculator");
		setVisible(true);
		setSize(300, 200);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		Calculator2 calculator2 = new Calculator2();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

		char key = e.getKeyChar();

		if (key == 10) {
			explain.setText(inputArea.getText());
			inputArea.setText("");
		}
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
