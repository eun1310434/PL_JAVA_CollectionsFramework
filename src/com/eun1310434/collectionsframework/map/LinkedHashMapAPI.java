/**
 * 28.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/
package com.eun1310434.collectionsframework.map;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
class LinkedHashMapAPI_info{
	private String key;
	private int value;
	public LinkedHashMapAPI_info(String _key, int _value){
		this.key = _key;
		this.value = _value;
	}

	public String getKey() {
		return key;
	}

	public String setKey(String _key) {
		return key = _key;
	}
	
	public void display(){
		System.out.println("key = " +key+ ", value = " +value);
	}
}

//Map
//□ Map
//○ Hashtable
//○ HashMap
//○ LinkedHashMap
//○ SortedMap
//  - TreeMap
//-키(key)와 값(Value)의 조합으로 데이터를 저장
//-값으로는 동일한 데이터를 저장할 수 있지만, 키는 유일해야 함
//-데이터를 저장한 순서를 기억하지 않음
//-ex) Hashtable, HashMap, LinkedHashMap, TreeMap
//-Hashtable : 멀티스레드에 안전, null 키를 허용 안함
//-HashMap : 멀티스레드에 안전하지 않음, null 키를 허용 
//-LinkedHashMap : 클래스는 저장 순서를 기억 -> 부하 높음
//-SortedMap 계열은 정렬, 처음/끝 데이터, 상하 관계 등을 관리하는 메서드가 있지만 특정 조건으로 정렬할 수는 없다.

class LinkedHashMapAPI_BiConsumer implements BiConsumer<Integer, LinkedHashMapAPI_info> {
	//Lambda
	public void accept(Integer arg0, LinkedHashMapAPI_info arg1) {
		arg1.display();
	}
}

class LinkedHashMapAPI_BiFunction implements BiFunction<Integer, LinkedHashMapAPI_info, LinkedHashMapAPI_info> {
	//Lambda
	public LinkedHashMapAPI_info apply(Integer arg0, LinkedHashMapAPI_info arg1) {
		arg1.setKey(arg1.getKey().toUpperCase());
		return arg1;
	}
}

public class LinkedHashMapAPI {
	public static void main(String[] ar) {
		Map<Integer, LinkedHashMapAPI_info> linkedHashMap = new LinkedHashMap<>();
		
		LinkedHashMapAPI_info[] info = new LinkedHashMapAPI_info[]{
				new LinkedHashMapAPI_info("a", 40), 
				new LinkedHashMapAPI_info("b", 35),
				new LinkedHashMapAPI_info("c", 28), 
				new LinkedHashMapAPI_info("d", 56)
		};
		
		for(int n = 0; n < info.length; ++n) {
			linkedHashMap.put(new Integer(n + 1), info[n]);
		}
		
		//모든 Map 출력
		linkedHashMap.forEach(new LinkedHashMapAPI_BiConsumer());
		System.out.println();
		
		//모든 아이디를 대문자로 replaceAll
		linkedHashMap.replaceAll(new LinkedHashMapAPI_BiFunction());
		linkedHashMap.forEach(new LinkedHashMapAPI_BiConsumer());
	}
}
