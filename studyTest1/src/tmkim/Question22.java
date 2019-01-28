package tmkim;

public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doubleArryMake(3, 5);
	}

	private static void doubleArryMake(int i, int j) {
		// TODO Auto-generated method stub
		String testNum;
		testNum = String.valueOf(i)+String.valueOf(j);
		System.out.println(testNum);
		//testNum = 35 
		int num1 = Integer.parseInt(testNum.substring(0,1));
		int num2 = Integer.parseInt(testNum.substring(1,2));
		System.out.println("num1:" + String.valueOf(num1) + "Num2:" + num2);
		String testArr[][] = new String[i+1][10];
		
		for(int k=0; k < i; k++) {
			for(int p=0; p<10; p++) {
				String tempString = String.valueOf(k)+String.valueOf(p);
				testArr[k][p] = tempString;
				System.out.println("testArr["+k+"]"+"["+p+"]:"+testArr[k][p]);
				if(testNum.equals(tempString)) {
					
					break;
				}
			}
		}
		//35면 배열 공간이 35개가 나와야 함. 
		//[3][5]로 만들면     [][][][][] 
		//				 [][][][][]
		//				 [][][][][] 15개니까 내가 바꿔서 만들어야 함. 
		//35개가 나오려면 3번째줄까지 10개 4번쨰줄 5개 
		
		
		
		/*for(int n=0; n<i; n++) {
			for(int m=0; m<j; m++) {
				String tempString = String.valueOf(n)+String.valueOf(m);
				testArr[n][m] = tempString;
				System.out.println("testArr["+n+"]"+"["+m+"]:"+testArr[n][m]);
			}
		}*/
	}
}

/*
1 자신의 패키지 밑에 Question22 클래스파일을 main메서드와 함께 생성한다.
2 main안에 "doubleArryMake(3, 5);" 코드를 추가하라.
3 에러가나는 곳에 마우스를 올리고 create method를 클릭하여 자동으로 메서드를 생성한다.
    	그러면 2개의 정수형 파라미터 (i,j)를 input으로 받는 doubleArryMake 메서드를 만들어진다.
4 메서드 안에 문자열 이중배열 arr[][]을 만들고 파라미터 i,j에 따라 배열의 공간을 만든다 
예)i=5,j=7 57개의 배열공간생성.
5 2차원 배열arr에 arr[0][0]부터 ij번째까지 "arr[1][2] = 12" 형식으로 값을 넣는다
예)i=5,j=7라면 
arr[0][0]=0
arr[0][1]=1
.
.
.
.
arr[1][1]=11
.
.
.
57번째 배열에 = 57
6 배열의 값을 모두 콘솔에 출력한다.
예) 0 , 1 , 2 가아님 / arr[0][0]=0 , arr[0][1]=1 형태로 출력 
7 성공하면 소스를 commit and push하고 다음문제로 넘어간다
*/