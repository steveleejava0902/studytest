package halucinor;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

public class ArrT1 {
	ArrayList<String> t1 = new ArrayList<String>();
	ArrayList<phoneItem> t2 = new ArrayList<phoneItem>();
	
	public void readFile(String filename) {
		
		try {
			DataInputStream ds = new DataInputStream(new FileInputStream(new File(filename)));
			
			System.out.println(ds.readLine());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("fail");
		}		
		
	}
	
	public static void main(String[] args) {
		//문제 1 t1에 본인이 좋아하는 음악 제목 5개 입력
		String filename = "C:\\Users\\승주\\git\\javastudy3\\studyTest1\\src\\halucinor\\phonebook.txt";
		
		
		
		ArrT1 Array1 = new ArrT1();
		Array1.readFile(filename);
		Array1.t1.add("Bohemian Rhapsody");
		Array1.t1.add("Seven nation army");
		Array1.t1.add("hello world");
		Array1.t1.add("google");
		Array1.t1.add("java");
		
		for(int i = 0; i < 5 ; i++) {
			System.out.println(Array1.t1.get(i));
		}
		
		//문제 2 t2를 이용하여 본인과 가족들의 전화번호 3개를 넣고 콘솔에 출력
		phoneItem item1 = new phoneItem("백승주","01076764563");
		phoneItem item2 = new phoneItem("백지현","01039275431");
		phoneItem item3 = new phoneItem("백윤호","01085615431");
		
		Array1.t2.add(item1);
		Array1.t2.add(item2);
		Array1.t2.add(item3);
		
		for(int i = 0; i < 3 ; i++) {
			System.out.println(Array1.t2.get(i));
		}
	}
}
