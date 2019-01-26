package hiin124;

public class Calculator1 {

	public static void main(String[] args) {

		System.out.println(calculate(3,"+",5));
		System.out.println(calculate(3,"-",5));
		System.out.println(calculate(3,"*",5));
		System.out.println(calculate(2,"/",4));
	}
	
	public static float calculate(int first,String op,int second) {
		
		if(op.equals("+")) {
			return first+second;
		}else if(op.equals("-")) {
			return first-second;
		}else if(op.equals("*")) {
			return first*second;
		}else if(op.equals("/") || op.equals("%")){
			float tmp = first/second;
			return tmp;
		}else {
			return -1;
		}
		
	}
	
	
}
