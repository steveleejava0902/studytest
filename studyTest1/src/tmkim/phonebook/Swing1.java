package tmkim.phonebook;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Swing1 {

	//이번에는 상속이 아닌 인스턴스를 생성 //객체화
	JFrame frame = new JFrame();

	//보여질 화면을 생성
	JTextArea menuDisplay = new JTextArea();
	JTextArea printDisplay = new JTextArea();

	//인풋 창 생성
	JTextField inputDisplay = new JTextField();

	//스크롤 패널 생성
	JScrollPane scrollPane = new JScrollPane(printDisplay);
	
	//생성자를 오버라이딩   -생성자는 return이 필요 없음 [접근제한자+메서드명] // 생성자 또 한 메서드임을 기억
	public Swing1() {
		frame.setSize(500, 200);
		frame.setTitle("phoneBook");
	
		frame.setLocationRelativeTo(null);						//가운데 배치
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//메모리에서 삭제

		//menuDisplay.setBorder(new TitledBorder("menu"));
		//printDisplay.setBorder(new TitledBorder("print"));
		
		//프레임에 컴포넌트로 패널만 가능한게 아니라 다른 컴포넌트도 가능함 
		//계산기에서는 프레임->패널->컴포넌트로 사용했었음.
		
		//프레임이 가지고있는 자체 패널을 가지고 옴. - 좌,우 영역 잡고있는 나머지를 center에 할당 함.
		frame.getContentPane().add(menuDisplay, BorderLayout.WEST);
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		frame.getContentPane().add(inputDisplay, BorderLayout.SOUTH);

		//append는 기존 + 새로운 것을 추가
		menuDisplay.append("======= 메뉴를 선택하세요 ======= \n");
		menuDisplay.append("1 전화번호부 전체 리스트 \n");
		menuDisplay.append("2 전화번호부 검색 \n");
		menuDisplay.append("3 전화번호부 추가 \n");
		menuDisplay.append("4 전화번호부 수정 \n");
		menuDisplay.append("5 전화번호부 삭제 \n");
		menuDisplay.append("=============================");
		
		printDisplay.append("printDisplay test \n");
		printDisplay.append("printDisplay test \n");
		printDisplay.append("printDisplay test \n");
		printDisplay.append("printDisplay test \n");
		printDisplay.append("printDisplay test \n");
		printDisplay.append("printDisplay test \n");
		printDisplay.append("printDisplay test \n");
		printDisplay.append("printDisplay test \n");
		printDisplay.append("printDisplay test \n");
		printDisplay.append("printDisplay test \n");
		printDisplay.append("printDisplay test \n");
		printDisplay.append("printDisplay test \n");
		printDisplay.append("printDisplay test \n");
		printDisplay.append("printDisplay test \n");

		frame.setVisible(true);									//화면에 보이게
	}
	
	public static void main(String[] args) {
		Swing1 s1 = new Swing1();
		
	}
}

