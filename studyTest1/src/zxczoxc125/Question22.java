package zxczoxc125;

public class Question22 {
	public static void main(String[] args) {
		doubleArryMake(3, 5);
	}

	private static void doubleArryMake(int i, int j) {
		// TODO Auto-generated method stub
		
		int num = i * 10 + j;
		
		int[][] arr = new int[i + 1][10];

		if (j > 0) {
			arr[i] = new int[j];
		}
		
		int value = 0;
		
		for (int a = 0; a < arr.length; a++) {
			for (int b = 0; b < arr[a].length; b++) {
				arr[a][b] = value;
				value++;
				System.out.println("arr[" + a + "][" + b + "]=" + value);
			}
		}
	}
}
