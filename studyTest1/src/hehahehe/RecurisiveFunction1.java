package hehahehe;

public class RecurisiveFunction1 {
	public static void main(String[] args){
		int result = facto(4);
		System.out.print("="+result);
	}
	
	static int facto(int i) {	
		
		int result = 1;
		String temp ="*"; 
		
		if( i > 0){			
			if(i ==1){
				 temp =""; 
			}
		System.out.print(i+temp);
		result = i*facto(i-1);				
		}
		return result;
	}

}