package tmkim.phonebook;

import java.util.ArrayList;

public class ArrayTest1 {

	public static void main(String[] args) {
		arrT2();
	}

	public static void arrT1() {
		
		ArrayList at1 = new ArrayList();
		
		at1.add("one");
		at1.add(2);
		at1.add(3.14);
		
		
		for(int i=0; i<at1.size(); i++) {
			System.out.println(at1.get(i));
		}
	}
	
	public static void arrT2() {

		// 제네릭 - 데이터 타입에 제약을 주는 것 
		ArrayList<PhoneItem> ob1 = new ArrayList<PhoneItem>();
		
		PhoneItem p1 = new PhoneItem();
		p1.setName("김태민");
		p1.setTeleNum("010-2549-8735");
		
		ob1.add(p1);
		
		System.out.println(ob1.get(0).toString());
		
	}
}
