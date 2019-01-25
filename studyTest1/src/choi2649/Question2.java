package choi2649;

public class Question2 {

	public static void main(String[] args) {
		Question2 q = new Question2();
		q.arrPrint(5);
	}
	public void arrPrint(int c) {
		int[] a = new int[c];
		for(int i =0; i < c; i++) {
			a[i] = i+1;
		}
		for(int i =0; i < c; i++) {
			System.out.println("a["+i+"]="+a[i]);
			//
		}
	}
}
