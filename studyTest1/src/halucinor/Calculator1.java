package halucinor;

public class Calculator1 {
	public static void main(String[] args) {
		calculate(6, "-", 5);
	}
	
	public static void calculate(int first, String operation, int second) {
		int result = 0;
		
		switch (operation) {
		case "+":
			result = first + second;
			break;
		case "-":
			result = first - second;
			break;
		case "*":
			result = first * second;
			break;
		case "/":
			result = first / second;			
			break;
		default:
			System.out.println(first+" "+ operation+" "+second+" = "+result);
			break;
		}
		
		
	}
	public static void caluclate2(String first, String opreation, String second) {
		int result;
	}
}
