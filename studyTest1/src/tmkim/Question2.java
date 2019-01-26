package tmkim;

public class Question2 {
	public static void main(String[] args) {
		Question2 qt2 = new Question2();
		qt2.arrPrint(5);
	}
	
	 public void arrPrint(int c) {
		 int[] testArr = new int[c]; 
		 for(int i=0; i<c; i++) {
			 testArr[i] = i+1;
			 System.out.println("a["+i+"]="+testArr[i]);
		 }
	 }
}

/*
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