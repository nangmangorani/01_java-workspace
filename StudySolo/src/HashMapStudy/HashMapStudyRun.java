package HashMapStudy;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapStudyRun {

	public static void main(String[] args) {
		

		HashMap<Integer, String> map = new HashMap<>();
		// new에서 타입 파라미터 생략 가능
		map.put(1,"사과");
		map.put(2,"바나나");
		map.put(3,"포도");
		
		
		for (Entry<Integer, String> entry : map.entrySet()) {
		    System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
		
	}

	}

}
