package yabooriking;

public class Question2 {

	public static void main(String[] args) {
		Question2 question2 = new Question2();
		question2.arrPrint(5);
	}
	
	public void arrPrint(int c) {
		int[] array = new int[c];
		
 		for (int i = 0 ; i < array.length ; i++) {
 			array[i] = i + 1;
 			System.out.println("a["+ i +"]=" + array[i]);
 		}
 		
	}
	
}
