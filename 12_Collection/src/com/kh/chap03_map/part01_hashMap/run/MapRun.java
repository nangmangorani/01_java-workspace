package com.kh.chap03_map.part01_hashMap.run;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class MapRun {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		// 계층구조를 보면
		// List계열, Set계읠 클래스들은 Collection 구현한 클래스임.
		// 객체를 추가하고자 할 때 공통적으로 add 메소드 이용 
		
		// Map 계열은 Collection을 구현한 클래스가 아님
		// => 추가하고자 할 때 put 메소드 이용 (이때 키 + 밸류세트로 담아야함)
		
		// 1. put(K key, V value) : 컬렉션에 키 벨류 세트로 추가시켜주는 메소드
		
		hm.put("다이제", new Snack("초코맛", 1500));
		hm.put("칸초", new Snack("단맛", 600));
		hm.put("새우깡", new Snack("짠맛",500));
		
		hm.put("포테이토칩", new Snack("짠맛", 500));
		
		System.out.println(hm); // {키=밸류, 키=밸류}
		// 저장되는 순서 유지 안됨! value 값이 중복되어도 키 값이 중복안되면 잘 저장됨
		
		hm.put("새우깡", new Snack("매운맛", 700));
		// 동일한 키값으로 다시 추가하면 value값이 덮어씌워짐 (중복된 키값 공존할 수 없음! 키 값이 식별자 같은 개념!)
		
		System.out.println(hm);
		
		// 2. get(Object key) : 컬렉션에서 해당 키값을 가지는 value 값을 반환시켜주는 메소드
		Snack s = (Snack)hm.get("다이제"); // get은 Object를 반환하기 때문에 형변환 해줘야함
		System.out.println(s);
		
		// 3. size() : 컬렉션에 담겨있는 객체들의 개수 반환
		System.out.println("몇개있을까? : " + hm.size() + "개 있음");
		
		// 4. replace(K key, V value) => 컬렉션에서 해당 키값을 찾아서 다시 전달한 value값으로 수정하는 메소드
		hm.replace("포테이토칩", new Snack("겁나 짠맛", 1000)); // 없는 키값 주면 무시
		System.out.println(hm);
		
		// 5. remove(Object key) => 컬렉션에서 해당 키값을 차자아서 그 키-벨류 세트로 시켜주는 메소드
		hm.remove("포테이토칩");
		System.out.println(hm);
		
		System.out.println("===============================");
		
		// map 공간에 모든 키값과 벨류값 다 출력하고자 할 때
		// for each문 안됨!
		
		// ArrayList도 안됨!
		// ArrayList list = new ArrayList(hm); Collection 아님!
		
		// Iterator 반복자 이용
		//Iterator it = hm.iterator(); // 곧바로 iterator() 호출 못함! 왜? iterator()는 List 계열 또는 Set계열에서만 쓸 수 있는 메소드
		
		// Map을 Set으로 바꿔주는 메소드 제공함!! (게다가 2개나..)
		// Map 계열을 => Set 계열로
		
		// 1.keySet() 메소드 이용하는 방법
		// 1) hm에 있는 키들만 Set에 담기(키들의 집합형태)
		Set keySet = hm.keySet();
		
		// 2) 1번 과정에서 작업된 keySet을 Iterator에 담기
		//keySet.iterator(); : Iterator
		Iterator itKey = keySet.iterator();
		
		// 3) 반복문을 통해 뽑기
		
		while(itKey.hasNext()) {
			String key = (String)itKey.next();
			Snack value = (Snack)hm.get(key);
			System.out.println(key + "=" + value);
		
		}
		
		
		// 2. entrySet() 메소드 이용하는 방법
		
		// 1) hm.entrySet() : Set
		Set entrySet = hm.entrySet();
		
		// 2) entrySet.interator() : Iterator
		Iterator itEntry = entrySet.iterator();
		
		// 3) 반복문을 통해 가져오기
		while(itEntry.hasNext()) {
			
			Entry entry = (Entry)itEntry.next();
			
			String key = (String)entry.getKey();
			Snack value = (Snack)entry.getValue();
			
			System.out.println(key + "=" + value);
			
			
		}
		
		
	}

}
