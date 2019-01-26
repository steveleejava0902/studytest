package zxczoxc125;

public class Calculator1 {
	public static void main(String[] args) {
		calculate("8", "/", "2");
	}
	
	public static void calculate(String firstValue, String operation, String secondValue) {
		int result;
		int first = Integer.parseInt(firstValue);
		int second = Integer.parseInt(secondValue);
		
		result = operation.equals("+") ? first + second : 
					(operation.equals("-") ? first - second : 
						(operation.equals("*") ? first * second : 
							(operation.equals("/") ? first / second : -9999)));
	
		System.out.println(first + " " + operation + " " + second + " = " + (result));
	}
}
