/**
 * 28.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/
package com.eun1310434.collectionsframework.set;
import java.util.LinkedHashSet;
import java.util.Set;

class LinkedHashSetAPI_info{
	private String key;
	private int value;
	public LinkedHashSetAPI_info(String _key, int _value){
		this.key = _key;
		this.value = _value;
	}
	public void display(){
		System.out.println("key = " +key+ ", value = " +value);
	}
}


//SetCollction
//□ Collection
//○ Set
//  - HashSet
//    → LinkedHashSet
//  - SortedSet / NavigableSet
//    → TreeSet
//- 동일한 데이터를 중복 저장 불가. 중복 저장시 하나로 인식
//- 데이터 저장 순서 무시. 예외) LinkedHashedSet 클래스는 저장 순서 기억
//- SortedSet(TreeSet) 계열은 정렬, 처음/끝 네이터, 상하 관계 등을 관리하는 메서드 존재
//- ex) HashSet, LinkedHashSet, TreeSet
public class LinkedHashSetAPI {
	public static void main(String[] ar) {
		Set<LinkedHashSetAPI_info> set = new LinkedHashSet<>();
		//Generic을 통하여 LinkedHashSetAPI_info만 저장하도록 설정
		
		LinkedHashSetAPI_info info_a = new LinkedHashSetAPI_info("a", 0);
		LinkedHashSetAPI_info info_b = new LinkedHashSetAPI_info("b", 1);
		LinkedHashSetAPI_info info_c = new LinkedHashSetAPI_info("c", 2);
		LinkedHashSetAPI_info info_d = new LinkedHashSetAPI_info("d", 3);
		LinkedHashSetAPI_info info_e = info_a;
		//info_e는 info_a와 같으므로 중복 저장이 안됨
		//동일한 데이터를 중복 저장 불가. 중복 저장시 하나로 인식
		
		set.add(info_a);
		set.add(info_b);
		set.add(info_c);
		set.add(info_d);
		set.add(info_e);

		set.forEach(info -> info.display());
		//set.forEach(LinkedHashSetAPI_info::display);
		//for(LinkedHashSetAPI_info n: set) {n.display();}
	}
}
