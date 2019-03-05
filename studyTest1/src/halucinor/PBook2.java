package halucinor;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PBook2 implements KeyListener {
	
	JFrame mainFrame = new JFrame();
	JPanel mainPane = new JPanel();
	JTextArea menuDisplay = new JTextArea();
	JTextArea printDisplay = new JTextArea();
	JTextField inputDisplay = new JTextField();
	JScrollPane printScrollPane ;
	
	//MODE 0 �޴� 31 �Է¸޴� �� �̸��Է� 32 �Է¸޴� �� ��ȭ��ȣ �Է� 33 �Է¸޴� �̸��� �ߺ� ��
	int MODE = 0;
	
	String name, phone;
	
	ArrayList<phoneItem> phonelist = new ArrayList<phoneItem>();
	
	public PBook2() {
		
		makeDisplay();
		makephonelist();
		
	}
	
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		int keyN = arg0.getKeyCode();
		
		System.out.println(keyN);
		
		//menu1
		if(keyN == 49 || keyN == 97) {
			menu1();
			
		}
		//input�ʱ�ȭ
		inputDisplay.setText("");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PBook2 pb = new PBook2();

	}
	
	
//---------------------------backend logic-------------------------------------------------------------	
	
	public void makeDisplay() {
		
		mainFrame.setTitle("phoneBook");
		mainFrame.setSize(600, 400);
		mainFrame.setDefaultCloseOperation(3);
		mainFrame.setLocationRelativeTo(null);		
		
		menuDisplay.setBorder(new TitledBorder("menu"));
		menuDisplay.setSize(240, 230);
		menuDisplay.setLocation(10, 20);
		menuDisplay.setEditable(false);		
		
		printDisplay.setSize(240, 230);
		printDisplay.setLocation(255, 20);	
		printDisplay.setEditable(false);
	    printDisplay.setFocusable(false);
	    printDisplay.setRequestFocusEnabled(false);
	    printDisplay.setWrapStyleWord(true);
	    printDisplay.setLineWrap(true);
		
		printScrollPane = new JScrollPane(printDisplay);
		printScrollPane.setBorder(new TitledBorder("display"));
		printScrollPane.setSize(240, 230);
		printScrollPane.setLocation(255, 20);		
	
		inputDisplay.setBorder(new TitledBorder("input"));
		inputDisplay.setSize(400, 40);
		inputDisplay.setLocation(10, 250);
		inputDisplay.addKeyListener(this);
		
		mainPane.setBorder(new TitledBorder("main"));
		mainPane.setLayout(null);
		mainPane.setLocation(0, 0);
		
		mainPane.add(menuDisplay);
		mainPane.add(printScrollPane);
		mainPane.add(inputDisplay);
		
		mainFrame.getContentPane().add(mainPane,null);
	//	mainFrame.getContentPane().add(printScrollPane,null);
	//	mainFrame.getContentPane().add(inputPane,null);
		
		//mainFrame.pack();
		mainFrame.setVisible(true);
		
		inputDisplay.requestFocus();
		
		menuDisplay.setText(Properties.menu_EX1);
		

		
	}
	
	public void makephonelist() {
		try {
			
			DataInputStream ds = new DataInputStream(new FileInputStream(new File(Properties.file_PATH)));
			
			String phoneLine = ds.readLine();
			
			
			while(phoneLine != null) {
				
				String[] splited = phoneLine.split(",");
				phonelist.add(new phoneItem(splited[0],splited[1]));
				phoneLine = ds.readLine();
			}
			
		} catch (Exception e) {
			System.out.println("cannot read file!");
		}
		
		
	}
	
	public void menu1() {
		
		//initialize printDisplay
		printDisplay.setText("");
		
		for(phoneItem item:phonelist) {
			printDisplay.append(item.toString() + "\n");
		}
	}
	
	public void menu2_name() {

	}
	
	public void menu2_phone() {
		
	}
	
	public void menu2() {
		
	}
	
	public void menu2_force() {
	}
	public void menu2_no() {
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
