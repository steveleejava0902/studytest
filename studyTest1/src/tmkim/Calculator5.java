package tmkim;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Calculator5 extends JFrame implements KeyListener{
   char lastKey;
   //얘를 잘 활용하면 더 체계적으로 구현이 가능할듯
   static String KEYNUM="",OPERATION="",FIRSTNUM="",SECONDNUM="",RESULT="";
   
   /*
    * MODE - 0: FIRSTNUM입력 준비, 1: 연산기호 입력준비, 2: SECONDNUM입력준비, 3 : 계산하기
    */
   
   JPanel mainPanel;
   JLabel operationArea, explainLabel;
   JTextField inputLabel;
   
   public static void main(String[] args) {
      Calculator5 c1 = new Calculator5();
   
   }
   
   public Calculator5() {
      mainPanel = new JPanel();
      mainPanel.setLayout(new BorderLayout());
      
      //border 생성 및 셋팅 
      TitledBorder tb = new TitledBorder(new LineBorder(Color.blue));
      mainPanel.setBorder(new TitledBorder("panel"));
      
      //인풋 창 생성
      inputLabel = new JTextField();
      inputLabel.setBorder(tb);
      
      //연산자
      operationArea = new JLabel();
      operationArea.setBorder(new TitledBorder("operation"));
      
      explainLabel = new JLabel();
      explainLabel.setBorder(new TitledBorder("explain"));
      
      //생성 한 Component들을 Panel에 추가 
      mainPanel.add(inputLabel, BorderLayout.NORTH);      //인자가 2개면 (추가할 대상, 위치설정)
      mainPanel.add(operationArea, BorderLayout.CENTER);
      
      //프로세스에서 제거 되도록 설정. 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //키 리스너 작동 대상을 인풋창에 할당.
      inputLabel.addKeyListener(this);
      
      //프레임에 Panel셋팅
      setContentPane(mainPanel);         
      
      setTitle("계산기");
      setSize(300, 200);         	//사이즈 설정
      setVisible(true);         	//화면에 보이게 설정
      setLocationRelativeTo(null);	//center배치
      
      inputLabel.requestFocus();   // 키 이벤트를 받을 컴포넌트를 강제로 설정
      
   }

   //키를 누르는 순간
   @Override
   public void keyPressed(KeyEvent e) {
      
      int keyNum = e.getKeyCode();                   //입력 키 코드를 가져옴
      char key = e.getKeyChar();                     //입력 키 문자를 가져옴   
      
      if(keyNum == 10) {                           //keyCode == 10 -> Enter
         KEYNUM = inputLabel.getText();               //Enter Key를 받았으니 input창에 있는 Text를 가져 옴.   
         int result = (int)calculate(KEYNUM);
         inputLabel.setText("");                     //input값 초기화
         operationArea.setText(KEYNUM + "=" + result);
      }
      
   }

   public double calculate(String input) {
      
      int pos = input.indexOf('+');

      if(pos != -1) { // '+' 기호를 포함한 경우
         System.out.println("input:"+ input + ", pos('+'의 위치):" + pos);
         System.out.println("input.substring(0, pos):" + input.substring(0, pos) + ", input.substring(pos + 1):" + input.substring(pos + 1));
         return calculate(input.substring(0, pos)) + calculate(input.substring(pos + 1));
      } else {      // '+' 기호가 없는 경우
         pos = input.indexOf('-');
         
         if(pos != -1) { // 위와 같이 '-' 기호를 체크
            System.out.println("input:"+ input + ", pos('-'의 위치):" + pos);
            System.out.println("input.substring(0, pos):" + input.substring(0, pos) + ", input.substring(pos + 1):" + input.substring(pos + 1));
            return calculate(input.substring(0, pos)) - calculate(input.substring(pos + 1));
         }else {
            pos = input.indexOf('*');
            if(pos != -1) {
               System.out.println("input:"+ input + ", pos('*'의 위치):" + pos);
               System.out.println("input.substring(0, pos):" + input.substring(0, pos) + ", input.substring(pos + 1):" + input.substring(pos + 1));
               return calculate(input.substring(0, pos)) * calculate(input.substring(pos + 1));
            }else {
               pos = input.indexOf('/');
               if(pos != -1) {
                  System.out.println("input:"+ input + ", pos('/'의 위치):" + pos);
                  System.out.println("input.substring(0, pos):" + input.substring(0, pos) + ", input.substring(pos + 1):" + input.substring(pos + 1));
                  return calculate(input.substring(0, pos)) / calculate(input.substring(pos + 1));
               }
            }
         }
      }
      
      String toProcess = input.trim();   //공백 제거
      if(toProcess == null || toProcess.isEmpty()) {
         return 0;
      }
      
      return Double.parseDouble(toProcess);
   }

   //누른 키를 떼는 순간 
   @Override
   public void keyReleased(KeyEvent e) {
      
   }

   //누른 키를 떼는 순간 (유니코드 키가 입력되는 경우만 작동)
   @Override
   public void keyTyped(KeyEvent e) {
	   int keyNum = e.getKeyCode();
		System.out.println("keyNum:" + keyNum);
		
		char key = e.getKeyChar();
		System.out.println("key:" + key);
		
		//연산자 2번 입력 안 되도록
		if(lastKey == '+' || lastKey == '-' || lastKey == '*'|| lastKey == '/') {
			if(key == '+' || key == '-' || key == '*'|| key == '/') {
				System.out.println(lastKey);
				e.consume();
			}
		}
		//숫자 또는 연산자가 아닌경우
		if(!(Character.isDigit(key) || key == '+' || key == '-' || key == '*'|| key == '/')) {
			e.consume();
		}
		lastKey = key;
   }

}