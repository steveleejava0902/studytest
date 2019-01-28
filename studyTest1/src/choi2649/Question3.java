package choi2649;

public class Question3 {
	public static void main(String[] args) {
		Singer s = new Singer();
		//first,second,third 키값에 난알아요,하여가,교실이데아
		s.a.put("first", "난알아여");
		s.a.put("second", "하여가");
		s.a.put("third", "교실이데아");
		
		System.out.println(s.a.get("first"));
		System.out.println(s.a.get("second"));
		System.out.println(s.a.get("third"));
		
	}
	
}
