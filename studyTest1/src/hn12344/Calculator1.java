package hn12344;

//1 각 숫자, 연산자 등 요소들을 하나씩만 입력 받아 계산하는 방법
//2 연산을 수학식처럼 일열로 나열하여 마지막에 실행시켜 계산하는 방법

public class Calculator1 {

	public static void main(String[] args) {
		
		calculate(8,"/",2);
		
	}
	
	static void calculate(int first, String operation, int second){
		
		int test = 0;
		
		if(operation.equals("+")){
			test = first + second;
		}else if(operation.equals("-")){
			test = first - second;
		}else if(operation.equals("*")){
			test = first * second;
		}else if(operation.equals("/")){
			test = first / second;
		}
		
		System.out.println(first+ operation + second + "=" + test );
		
		
	}
	
	
	
}
