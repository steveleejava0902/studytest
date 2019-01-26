package akwdmfxu;

public class Calculator1 {

	public static void main(String[] args) {
		calculate(3, "+", 5);
		calculate2("4", "*", "5");
	}
	
	public static void calculate(int first, String operation, int second){
		
		int val = 0;
		
		switch (operation) {
			case "+":
				val = first + second;
				break;
			case "-":
				val = first - second;
				break;
			case "*":
				val = first * second;
				break;
			case "/":
				val = first / second;
				break;
			case "%":
				val = first % second;
				break;
			default:
				break;
		}
		
		System.out.println(first + operation + second +"="+ val);
		
	}
	
	public static void calculate2(String first, String operation, String second){
		
		int val = 0;
		int val1 = Integer.valueOf(first);
		int val2 = Integer.valueOf(second);
		
		switch (operation) {
			case "+":
				val = val1 + val2;
				break;
			case "-":
				val = val1 - val2;
				break;
			case "*":
				val = val1 * val2;
				break;
			case "/":
				val = val1 / val2;
				break;
			case "%":
				val = val1 % val2;
				break;
			default:
				break;
		}
		
		System.out.println(first + operation + second +"="+ val);
	}
	
}
