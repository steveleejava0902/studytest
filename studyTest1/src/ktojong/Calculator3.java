package ktojong;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Calculator3 extends JFrame implements KeyListener {

    private JPanel mainPanel;
    private JTextArea inputArea;
    private JLabel explain;
    private JLabel test;
    private String result;
    private int flow;

    private void init() {
        mainPanel = new JPanel();
        mainPanel.setBorder(new TitledBorder("panel"));
        mainPanel.setLayout(new BorderLayout());

        inputArea = new JTextArea("0");

        explain = new JLabel("Explain", JLabel.RIGHT);

        test = new JLabel("test", JLabel.RIGHT);

        inputArea.addKeyListener(this);

        result = "";
        flow = 0;
    }

    private Calculator3() {
        init();
        setContentPane(mainPanel);
        mainPanel.add(inputArea, BorderLayout.NORTH);
        mainPanel.add(explain, BorderLayout.CENTER);
        mainPanel.add(test, BorderLayout.SOUTH);

        setTitle("Calculator");
        setVisible(true);
        setSize(new Dimension(300, 200));
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new Calculator3();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // typed에서는 keyCode가 동작안함
        char key = e.getKeyChar();

        switch (flow) {
            case 0: // int
            case 2:
                if (key < 48 || key > 57)
                    e.consume();
                break;
            case 1: // op
                if (Character.isDigit(key) || Character.isAlphabetic(key)) e.consume();
                break;
        }

        // operator
        if (key == 42 || key == 43 || key == 45 || key == 47) {
            // operator skip
        } else if (!Character.isDigit(key)) {
            e.consume();
        }

        // Enter
        if (key == 10) {
            flow++;
            if (flow > 2) flow = 0;
            result += inputArea.getText();
            explain.setText(result);
            inputArea.setText("");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}


/*
    숫자 / 연산자 / 숫자 순으로 입력
 */
