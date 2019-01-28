package choi2649;

public class Question22 {
	public static void main(String[] args) {
		doubleArryMake(3, 5);
	}

	private static void doubleArryMake(int i, int j) {
		int[][] arr = new int[i][j];
		int v =0;
		for(int a = 0; a < i; a++) {
			for(int z = 0; z < j; z++) {
				arr[a][z] = v;
				v++;
			}
		}
		for(int a = 0; a < i; a++) {
			for(int z = 0; z < j; z++) {
				System.out.println("arr["+a+"]["+z+"]="+arr[a][z]);
				//arr[i][j] = i+z;
			}
		}
	}
}
