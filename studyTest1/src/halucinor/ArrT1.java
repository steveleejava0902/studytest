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
		//���� 1 t1�� ������ �����ϴ� ���� ���� 5�� �Է�
		String filename = "C:\\Users\\����\\git\\javastudy3\\studyTest1\\src\\halucinor\\phonebook.txt";
		
		
		
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
		
		//���� 2 t2�� �̿��Ͽ� ���ΰ� �������� ��ȭ��ȣ 3���� �ְ� �ֿܼ� ���
		phoneItem item1 = new phoneItem("�����","01076764563");
		phoneItem item2 = new phoneItem("������","01039275431");
		phoneItem item3 = new phoneItem("����ȣ","01085615431");
		
		Array1.t2.add(item1);
		Array1.t2.add(item2);
		Array1.t2.add(item3);
		
		for(int i = 0; i < 3 ; i++) {
			System.out.println(Array1.t2.get(i));
		}
	}
}
