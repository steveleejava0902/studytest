package dasd412;

public class Gugudan {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Gugudan gugu=new Gugudan();
		int result=gugu.getGugudan(2, 3);
		System.out.println(2+"*"+3+"="+result);
	}
	public int getGugudan(int a, int b) {
		int result=a*b;
		return result;
	}

}
