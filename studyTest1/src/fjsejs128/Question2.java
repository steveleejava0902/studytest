package fjsejs128;



public class Question2 {
	
	public static void arrPrint(int c) {
		int arr[] = new int[c];
		
		for(int i = 0; i < c; i++) {
			arr[i] = i+1;
		}
		
		for(int j = 0; j < arr.length; j++) {
			System.out.println("a[" + j + "] = " + (j + 1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrPrint(5);
	}

}
