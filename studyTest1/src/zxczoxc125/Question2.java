package zxczoxc125;

public class Question2 {
	public static void main(String[] args) {
		Question2 question2 = new Question2();
		question2.arrPrint(5);
	}
	
	public void arrPrint(int c) {
		int[] arr = new int[c];
		
		/**
		 * 배열 초기
		 */
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		/**
		 * 출력부
		 */
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("a[" + i + "]=" + arr[i]);
		}
	}
}
