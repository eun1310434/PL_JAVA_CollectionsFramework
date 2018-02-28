/**
 * 28.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/
package com.eun1310434.collectionsframework.set;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;


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
class TreeSetAPI_info implements Comparable<TreeSetAPI_info> {
	private String key;
	private int value;
	
	public TreeSetAPI_info(String _key, int _value){
		this.key = _key;
		this.value = _value;
	}
	
	public String getKey(){
		return key;
	}
	
	public int getValue(){
		return value;
	}
	
	public void display(){
		System.out.println("key = " +key+ ", value = " +value);
	}
    
	public int compareTo(TreeSetAPI_info o) {
		return this.value - o.value;	
		//매우 중요!!!! 현재(this)와 입력되는 것(TreeSetAPI_info)비교
    }
    
}


class TreeSetAPI_Comparator_Key implements Comparator<TreeSetAPI_info> {
	@Override
	public int compare(TreeSetAPI_info arg0, TreeSetAPI_info arg1) {
		// TODO Auto-generated method stub
		return arg0.getKey().compareTo(arg1.getKey());
	}
}


class TreeSetAPI_Comparator_Value implements Comparator<TreeSetAPI_info> {
	@Override
	public int compare(TreeSetAPI_info arg0, TreeSetAPI_info arg1) {
		// TODO Auto-generated method stub
		return Integer.compare( arg0.getValue(), arg1.getValue());
	}
}

//SetCollcton
//- 동일한 데이터를 중복 저장 불가. 중복 저장시 하나로 인식
//- 데이터 저장 순서 무시. 예외) LinkedHashedSet 클래스는 저장 순서 기억
//- SortedSet 계열은 정렬, 처음/끝 네이터, 상하 관계 등을 관리하는 메서드 존재
//- ex) HashSet, LinkedHashSet, TreeSet


public class TreeSetAPI {
	public static void main(String[] ar) {
		//Set<TreeSetAPI_info> set = new TreeSet<>();
		SortedSet<TreeSetAPI_info> set = new TreeSet<>();
		//Generic을 통하여 TreeSetAPI_info만 저장하도록 설정
		
		TreeSetAPI_info info_a = new TreeSetAPI_info("a", 3);
		TreeSetAPI_info info_b = new TreeSetAPI_info("b", 2);
		TreeSetAPI_info info_c = new TreeSetAPI_info("c", 1);
		TreeSetAPI_info info_d = new TreeSetAPI_info("d", 0);
		//info_e는 info_a와 같으므로 중복 저장이 안됨
		//동일한 데이터를 중복 저장 불가. 중복 저장시 하나로 인식

		set.add(info_a);
		set.add(info_b);
		set.add(info_c);
		set.add(info_d);

		set.forEach(info -> info.display());
		System.out.println();
		
		System.out.printf("first : ");
		set.first().display();
		//.first()는 compareTo에서의 기준에 따라 제일 작은 것 출력
		
		System.out.printf("last : ");
		set.last().display();
		//.first()는 compareTo에서의 기준에 따라 제일 큰 것 출력
		System.out.println();
		
		SortedSet<TreeSetAPI_info> tailSets 
		= set.tailSet(new TreeSetAPI_info("b", 2));
		//.tailSet(X)는 X의 입력값을 compareTo에서의 기준에 따라 이후의 값으로 출력
		System.out.printf("tailSet ");
		tailSets.forEach(info -> info.display());
		System.out.println();

		
		//입력시  Key값으로 정렬 실시하여 받음...
		SortedSet<TreeSetAPI_info> set2 = new TreeSet<>(new TreeSetAPI_Comparator_Key());
		//the comparator that will be used to order this set. 
		//If null, the natural ordering of the elements will be used.
		set2.addAll(set);
		set2.forEach(info -> info.display());
		System.out.println();

		
		//입력시 Value값으로 정렬 실시하여 받음...
		SortedSet<TreeSetAPI_info> set3 = new TreeSet<>(new TreeSetAPI_Comparator_Value());
		//the comparator that will be used to order this set. 
		//If null, the natural ordering of the elements will be used.		
		set3.addAll(set);
		set3.forEach(info -> info.display());
		//Lambda
		
		
		
	}
}
