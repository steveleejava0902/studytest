package zxczoxc125;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Calculator3 extends JFrame implements KeyListener {
	JPanel mainPanel;
	JTextArea inputArea;
	JLabel explain;

	static int STATUS = 0;

	int prevValue;
	int nextValue;
	char operation;
	int result = 0;

	public Calculator3() {
		mainPanel = new JPanel();
		mainPanel.setBorder(new TitledBorder("panel"));
		mainPanel.setLayout(new BorderLayout());

		setContentPane(mainPanel);

		inputArea = new JTextArea("");

		explain = new JLabel("결과 값 출력란입니다.", JLabel.RIGHT);

		mainPanel.add(inputArea, BorderLayout.NORTH);
		mainPanel.add(explain, BorderLayout.CENTER);

		inputArea.addKeyListener(this);

		setTitle("Calculator");
		setVisible(true);
		setSize(300, 200);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		Calculator3 calculator3 = new Calculator3();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		char key = e.getKeyChar();

		/**
		 * -- 조건 --
		 * 연산자 (key == 43 || key == 45 || key == 42 || key == 47)
		 * 엔터 (key == 10)
		 */

		/**
		 * 숫자, 연산자 이외의 문자 입력방지
		 */
		if (key == 43 || key == 45 || key == 42 || key == 47) {

		} else if (!Character.isDigit(key)) {
			e.consume();
		}

		/**
		 * 상태별 처리
		 */
		if (STATUS == 0) {
			STATUS = 1;
		} else if (STATUS == 1 && (key == 43 || key == 45 || key == 42 || key == 47)) {
			operation = key;
			STATUS = 2;
		} else if (STATUS == 2 && !(key == 43 || key == 45 || key == 42 || key == 47) && key != 10) {
			STATUS = 3;
		}

		/**
		 * 엔터 처리
		 */
		if (key == 10) {
			/**
			 * 엔터 문자값 제거
			 */
			int enterIdx = inputArea.getText().lastIndexOf(10);

			if (STATUS == 1) {
				prevValue = Integer.parseInt(inputArea.getText().substring(0, enterIdx));
			} else if (STATUS == 3) {
				nextValue = Integer.parseInt(inputArea.getText().substring(0, enterIdx));

				if (operation == 43) {
					result = prevValue + nextValue;
				} else if (operation == 45) {
					result = prevValue - nextValue;
				} else if (operation == 42) {
					result = prevValue * nextValue;
				} else if (operation == 47) {
					result = prevValue / nextValue;
				}

				STATUS = 0;
				prevValue = 0;
				operation = 0;

				explain.setText(String.valueOf(result));
			}

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
