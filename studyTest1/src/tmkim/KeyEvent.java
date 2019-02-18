package tmkim;

import java.awt.event.KeyListener;

public class KeyEvent extends Swing implements KeyListener{
	
	char lastkey;

	//이벤트 리스너가 작동하기 위해서는 컴포넌트에 리스너를 할당 해 줘야 함.
	public KeyEvent() {
		super();									//상속받은 클래스의 생성자 호출
		super.inputDisplay.addKeyListener(this);	//keyEvent할당
	}
	
	public static void main(String[] args) {
		KeyEvent ke = new KeyEvent();
		String tempStr = "123*2456/234+111-332";
		
	}
	public int calculate(String tempStr) {
		int result = 0;
		int SF = 0;
		
		String operation = "";
		String left = "";
		String right = "";
		
		SF = tempStr.indexOf('+');
		
		if(SF != -1) {
			left = tempStr.substring(0, SF);
			return calculate(tempStr.substring(0, SF)) ;
		} else {
			return result;
		}
		
	}
	
	
	//consume 소비 
	@Override
	public void keyTyped(java.awt.event.KeyEvent e) {
		
		int keyNum = e.getKeyCode();
		System.out.println("keyNum:" + keyNum);
		
		char key = e.getKeyChar();
		System.out.println("key:" + key);
		
		//연산자 2번 입력 안 되도록
		if(lastkey == '+' || lastkey == '-' || lastkey == '*'|| lastkey == '/') {
			if(key == '+' || key == '-' || key == '*'|| key == '/') {
				System.out.println(lastkey);
				e.consume();
			}
		}
		
		if(Character.isDigit(key) || key == '+' || key == '-' || key == '*'|| key == '/') {
			// 숫자 또는 연산이 맞음
		}else {
			// 아니면 소멸
			e.consume();
		}
		
		lastkey = key;
	}

	@Override
	public void keyPressed(java.awt.event.KeyEvent e) {
		
	}

	@Override
	public void keyReleased(java.awt.event.KeyEvent e) {
		
	}

}
