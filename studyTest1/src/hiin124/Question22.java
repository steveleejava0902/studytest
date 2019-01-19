package hiin124;

public class Question22 {

	
	public static void main(String[] args) {
		
		doubleArryMake(3,5);
	}

	private static void doubleArryMake(int i, int j) {
		//배열을 35개까지 만드는 법을 모르겠습니다..
		String arr[][]=new String[i+1][10];
		
		for(int a=0; a<i+1; a++) {
			
			if(a==i) {
				for(int c=0; c<j+1; c++) {
					arr[a][c] = String.valueOf(a*10+c);
					System.out.println(arr[a][c]);
				}
			}else {
				for(int b=0; b<10; b++) {
					arr[a][b]=String.valueOf(a*10+b);
					System.out.println(arr[a][b]);
				}
			}
			
		}
		
	}
	
}
