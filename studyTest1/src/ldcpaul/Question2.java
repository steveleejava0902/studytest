package ldcpaul;

public class Question2 {
	/**
1 자신의 패키지 밑에 Question2 클래스파일을 생성한다.
2 public void arrPrint(int c) 메소드를 만든다. 
3 메소드 기능은 파라미터 c 숫자만큼 정수타입 변수에 배열을 생성한다. 그리고 1부터 c까지의 숫자를 첫번째 배열부터 넣는다.
	그리고 배열의 값을 모두 콘솔에 출력한다.
4 실행부는 arrPrint(5) 이와 같고 출력은 아래와 같이 되게 하라
a[0]=1
a[1]=2
a[2]=3
a[3]=4
a[4]=5
5 성공하면 소스를 commit and push하고 다음문제로 넘어간다

	 */

	public static void main (String [] arg) {
		Question2 q2 = new Question2();
		q2.arrPrint(5);
	}
	public void arrPrint(int c) {
		
		int a[] = new int[c];
		for(int i = 0 ; i < c ; i ++) {
			a[i]=i+1;
			System.out.println("a["+i+"] = "+a[i]);
		}
	}
}
