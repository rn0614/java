package ch15.sec02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		Map<String, Integer> map =new HashMap<String, Integer>();
		
		map.put("홍길동",85);
		map.put("이몽룍",95);
		map.put("성춘향",90);
		//map.put("홍길동",100); 같은 key일경우 중복 안됨
		
		
		System.out.println("총 Entry 수" + map.size());
		
		// 객체 찾기 : 키(이름)로 값(점수) 검색
		// map.get(key) -> value 반환
		System.out.println("홍길동 : " + map.get("홍길동"));
		
		// 객체를 하나씩 처리
		Set<String> keySet = map.keySet(); // key set 반환
		
		// 반복해서 키를 얻고 값을 얻어오기
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key +" : "+ value);
		}
		
		System.out.println();
		
		// 객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());
		
		

	}
}
