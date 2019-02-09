package jcheolhodev;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Calculator1 extends JFrame implements KeyListener {

    int mode = 0;
    String firstNum, operation, lastNum;

    JPanel mainPanel;
    JTextField inputDiplay;
    JLabel explainDisplay;

    public Calculator1() {
        setSize(300, 200);
        setTitle("key test");
        setLocationRelativeTo(null);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        inputDiplay = new JTextField();
        inputDiplay.setBorder(new TitledBorder("input"));
        inputDiplay.addKeyListener(this);

        explainDisplay = new JLabel("입력해주세요");
        explainDisplay.setBorder(new TitledBorder("output"));

        mainPanel.add(inputDiplay, BorderLayout.NORTH);
        mainPanel.add(explainDisplay, BorderLayout.CENTER);

        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator1();
    }

    public int cal() {
        int num1 = Integer.parseInt(firstNum);
        int num2 = Integer.parseInt(lastNum);
        int result = 0;
        if (operation.equals("+")) {
            result = num1 + num2;
        } else if (operation.equals("-")) {
            result = num1 - num2;
        } else if (operation.equals("*")) {
            result = num1 * num2;
        } else if (operation.equals("/")) {
            result = num1 / num2;
        }
        return result;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (!isCanInput(e.getKeyChar())) {
            e.consume();
        }
    }

    private boolean isCanInput(char keyChar) {
        if ((mode == 0 || mode == 2) && !Character.isDigit(keyChar)) return false;
        if (mode == 1) {
            if (keyChar != '+' && keyChar != '-' && keyChar != '*' && keyChar != '/') return false;
            if (inputDiplay.getText().length() > 0) return false;
        }

        return true;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() != 10) {
            return;
        }

        String text = inputDiplay.getText();
        inputDiplay.setText("");

        if (mode == 0) {
            firstNum = text;
            mode = 1;
            explainDisplay.setText(firstNum);
        } else if (mode == 1) {
            operation = text;
            mode = 2;
            explainDisplay.setText(firstNum + operation);
        } else if (mode == 2) {
            lastNum = text;
            explainDisplay.setText(firstNum + operation + lastNum + "=" + cal());
            firstNum = "";
            lastNum = "";
            operation = "";
            mode = 0;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
