package zxczoxc125;

import java.util.Map;

public class Question3 {
	public static void main(String[] args) {
		Singer singer = new Singer();
		Map<String, String> famousSongs = singer.famousSongs;
		
		famousSongs.put("first", "난알아요");
		famousSongs.put("second", "하여가");
		famousSongs.put("third", "교실이데아");

		System.out.println(famousSongs.get("first"));
		System.out.println(famousSongs.get("second"));
		System.out.println(famousSongs.get("third"));
	}
}
