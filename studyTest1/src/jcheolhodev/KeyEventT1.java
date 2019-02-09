package jcheolhodev;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventT1 extends JFrame implements KeyListener {

    JPanel mainPanel;
    JTextField inputDiplay;
    JLabel explainDisplay;

    public KeyEventT1() {
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
        KeyEventT1 t1 = new KeyEventT1();

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        char key = e.getKeyChar();
        int keyCode = e.getKeyCode();
        System.out.println(key);
        System.out.println(keyCode);

        if (keyCode == 10) {
            String text = inputDiplay.getText();
            inputDiplay.setText("");
            explainDisplay.setText(text);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
