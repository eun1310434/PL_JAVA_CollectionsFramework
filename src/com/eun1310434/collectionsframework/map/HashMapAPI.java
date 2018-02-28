/**
 * 28.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/
package com.eun1310434.collectionsframework.map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


//Map
//□ Map
//  ○ Hashtable
//  ○ HashMap
//  ○ LinkedHashMap
//  ○ SortedMap
//    - TreeMap
//-키(key)와 값(Value)의 조합으로 데이터를 저장
//-값으로는 동일한 데이터를 저장할 수 있지만, 키는 유일해야 함
//-데이터를 저장한 순서를 기억하지 않음
//-ex) Hashtable, HashMap, LinkedHashMap, TreeMap
//-Hashtable : 멀티스레드에 안전, null 키를 허용 안함
//-HashMap : 멀티스레드에 안전하지 않음, null 키를 허용 
//-LinkedHashMap : 클래스는 저장 순서를 기억 -> 부하 높음
//-SortedMap 계열은 정렬, 처음/끝 데이터, 상하 관계 등을 관리하는 메서드가 있지만 특정 조건으로 정렬할 수는 없다.

public class HashMapAPI {
	public static void main(String[] ar) {
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(new Integer(1), "A");
		hashMap.put(2, "B");
		hashMap.put(3, "C");
		
		System.out.println("size = " + hashMap.size());
		
		if(hashMap.containsKey(1)) {
			System.out.println("Value of Key 1  = " + hashMap.get(1));
		}
		System.out.println("Value C contain Check = "+hashMap.containsValue("C"));
		
		String v = hashMap.getOrDefault(5, "NONE");
		// getOrDefault은 해당 key가 없을 경우  값을 set은 하지 않고 정해진 default 값만 리턴 
		System.out.println("Value of Key 5 = " + v);
		
		hashMap.remove(2); // remove - Key 2 
		hashMap.replace(3, "ZZZ"); // replace - Key 3 : ZZZ
		
		
		Set<Integer> getKeys = hashMap.keySet();
		Iterator<Integer> iterator = getKeys.iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			System.out.println(key + " : " + hashMap.get(key));
		}
		
		Collection<String> getValues = hashMap.values();
		String[] data = new String[getValues.size()];
		getValues.toArray(data);
		for(String str: data) {
			System.out.println(str);
		}
	}
}
