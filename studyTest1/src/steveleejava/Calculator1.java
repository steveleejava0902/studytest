package steveleejava;

public class Calculator1 {
	
	
	public static void main(String[] arg) {
		
		calculate(6 , "*", 3);
		
	}

	private static void calculate(int first, String operation, int second) {
		// TODO Auto-generated method stub
		
		int result=0;
		
		if(operation == "+") result = first + second;
		else if(operation == "-") result = first - second;
		else if(operation == "*") result = first * second;
		else if(operation == "/") result = first / second;
		
		System.out.println(first + " " + operation + " " + second + " = " + result);
		
	}

}
