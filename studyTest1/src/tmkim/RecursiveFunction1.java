package tmkim;

public class RecursiveFunction1 {
	public static void main(String[] args) {
		RecursiveFunction1 rf1 = new RecursiveFunction1();
		System.out.println(rf1.facto(5));
		
	}
	
	public int facto(int num) {
		if(num <= 1) {
			return num;
		}else {
			return facto(num-1) * num;
		}
	}
}
