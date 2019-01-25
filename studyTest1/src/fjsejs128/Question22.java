package fjsejs128;

public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doubleArryMake(3, 5);		
	}

	private static void doubleArryMake(int i, int j) {
		// TODO Auto-generated method stub
		String arr[][] = new String[i][j];
		
		for(int row = 0; row < i; row++) {
			for(int col = 0; col < j; col++) {
				/*
				if(row == 0) {
					arr[row][col] = "arr[" + row + " ][ " + col +"] = " + arr[row][col];
					
				}
				else {
					arr[row][col] = Integer.toString(row) + Integer.toString(col);
				}*/
				arr[row][col] = "arr[" + row + " ][ " + col +"] = " + row + col;
			}
		}
		
		
		for(int row = 0; row < i; row++) {
			for(int col = 0; col < j; col++) {
				System.out.println("arr[" + row + " ][ " + col +"] = " + row+col);		
				
			}
			System.out.println(" ");
		}
	
	}
}
