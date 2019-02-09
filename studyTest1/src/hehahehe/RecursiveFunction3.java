package hehahehe;

public class RecursiveFunction3 {

	public static void main(String[] args) {
		int result =  throwingDice();
		System.out.println(result);
	}

	public static int throwingDice() {
		
		
		int r1 = (int) (Math.random()*6 + 1);
		int r2 = (int) (Math.random()*6 + 1);
		int r3 = r1 +r2;
		System.out.println(r1);
		System.out.println(r2);
		
		if (r1 == r2){
			r3 = r3 + throwingDice();
		}
		
		return r3;
	}

}
