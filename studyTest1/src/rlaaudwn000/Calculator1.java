package rlaaudwn000;

public class Calculator1 {

	public void claculator(int first, String operration, int second) {
		int result = 0;
		
		if(operration == "+") {result = first + second;}
		else if(operration == "-") {result = first - second;}
		else if(operration == "*") {result = first * second;}
		System.out.println("3 + 5 = " + first + operration + second);
	}
	
	public static void main(String[] args) {
		Calculator1 cal = new Calculator1();
		cal.claculator(3, "+", 5);
	}
}
