package dasd412;

public class Question02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Question02 question=new Question02();
    question.arrPrint(5);
    
	}
	public void arrPrint(int c) {
		int[]arr=new int[c];
		for(int i=0;i<c;i++) {
			arr[i]=i+1;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("a["+i+"]"+"="+arr[i]);
		}
	}

}
