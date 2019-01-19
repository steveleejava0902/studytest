package kuyt1819;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singer singer = new Singer("서태지", 35, "음악", "난몰라요");
		
		HashMap<String, String> famousSongs = new HashMap<>();	
		famousSongs.put("first", "난알아요");
		famousSongs.put("second", "하여가");
		famousSongs.put("third", "교실이데아");
		//d
		//키값 뽑아서 이터레이터 돌려서 출력하는건 알겠는데.. 까먹었어요 ..ㅠㅜ
		Set<String> famousSongs2 = famousSongs.keySet();
		/*famousSongs2.iterator();
			System.out.println(famousSongs2.);
		
			
		*/
		//출력
		//Iterator<E>
		/*for (int i = 0; i < famousSongs.size(); i++) {
			
			System.out.println(famousSongs.get("first"));
			
		}*/
		
	}

}
