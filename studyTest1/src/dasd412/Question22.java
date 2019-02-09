package dasd412;

public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Question22 question=new Question22();
       
		question.doubleArryMake(3, 5);
	}

	private  void doubleArryMake(int i, int j) {
		// TODO Auto-generated method stub
		int[][]arr=new int[i][j];
		for(int a=0;a<i;a++) {
			for(int b=0;b<j;b++) {
				arr[a][b]=a+b;
			}	
		}
		
		for(int a=0;a<i;a++) {
			for(int b=0;b<j;b++) {
				System.out.println("arr["+a+"]"+"["+b+"]="+arr[a][b]);
			}	
		}
	}

}
