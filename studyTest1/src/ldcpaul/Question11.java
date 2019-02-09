package ldcpaul;

public class Question11 {
	/*
	 	1 Question11 클래스를 내 패키지 않에 main 메서드와 함께 만든다.
		2 아래 코드를 메인 안에 넣는다.
			String val = new String("value");

			if(val == "value") {
			System.out.println("동작했음. 잘했어");
			}else {
			System.out.println("동작못했어. 다시 생각해봐");
			}
		3 소스를 실행해보라. "동작못했어" 라는 문구가 출력된다면, 현재 상태에서 한줄만 변경해서 "동작했어"가 출력되도록 하라.


		4 성공하면 소스를 commit and push하고 다음문제로 넘어간다
*/
	public static void main(String [] arg) {
		String val = new String("value");

		if(val != "value") {
		System.out.println("동작했음. 잘했어");
		}else {
		System.out.println("동작못했어. 다시 생각해봐");
		}
	}

}
