package kuyt1819;

public class Question2 {
	public void arrPrint(int c) {
		int[] a = new int[c];
		for (int i = 0; i < a.length; i++) {
			a[i] = i+1;
			System.out.println("a[" + i + "]="  + a[i]);
		}
	}
	
	public static void main(String[] args) {
		Question2 question2 = new Question2();
		question2.arrPrint(5);
		
	}
}
