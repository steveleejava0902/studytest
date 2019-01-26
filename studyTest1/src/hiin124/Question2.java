package hiin124;

public class Question2 {

	
	public static void main(String[] args) {
		
		arrPrint(5);
	}
	
	public static void arrPrint(int c) {
		int[] arr=new int[c];
		
		for(int i=0; i<c; i++) {
			arr[i]=i+1;
			System.out.println("a["+i+"]="+arr[i]);
		}
	}
}
