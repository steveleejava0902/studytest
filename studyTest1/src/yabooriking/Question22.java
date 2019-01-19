package yabooriking;

public class Question22 {

	public static void main(String[] args) {

		doubleArryMake(3, 5);
	}

	private static void doubleArryMake(int i, int j) {

		int[][] array = new int[i+1][10];
		
		for(int a = 0; a <= i; a++) {
			for(int b = 0; b< 10; b++) {
				
				if(10 * i + j < 10 * a + b) {
					break;
				}
				array[a][b] = 10 * a + b;
				System.out.println("arr["+a+"]["+b+"]=" + array[a][b]);
			}
		}
				
	}

}
