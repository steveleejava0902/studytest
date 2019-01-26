package kuyt1819;

import javax.xml.bind.ParseConversionEvent;

public class Calculator11 {
	public static void main(String[] args) {
		Calculator11 cal = new Calculator11();
		System.out.println(cal.calculate("5", "-", "3"));
	}

	int value = 0;
	int tempvalue = 0;

	public int calculate(String first, String operation, String second) {
		if ("+".equals(operation)) {
			value = Integer.parseInt(first) + Integer.parseInt(second);
		} else if ("-".equals(operation)) {
			value = Integer.parseInt(first) - Integer.parseInt(second);

		} else if ("*".equals(operation)) {
			value = Integer.parseInt(first) * Integer.parseInt(second);

		} else if ("/".equals(operation)) {
			value = Integer.parseInt(first) / Integer.parseInt(second);
		}
		return value;
	}
}
