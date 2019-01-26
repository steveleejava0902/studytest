package kuyt1819;

public class Calculator1 {
	public static void main(String[] args) {
		Calculator1 cal = new Calculator1();
		System.out.println(cal.calculate(5, "*", 3));
	}

	int value = 0;

	public int calculate(int first, String operation, int second) {
		if ("+".equals(operation)) {
			value = first + second;

		} else if ("-".equals(operation)) {
			value = first - second;

		} else if ("*".equals(operation)) {
			value = first * second;

		} else if ("/".equals(operation)) {
			value = first / second;

		}
		return value;
	}
}
