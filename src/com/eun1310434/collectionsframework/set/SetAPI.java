/**
 * 28.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/
package com.eun1310434.collectionsframework.set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

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
public class SetAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] str_A = new String[] {"A1", "A2", "A3", "A4", "A5"};
		String[] str_B = new String[] {"B1", "B2", "B3", "B4", "B5"};
		String[] str_C = new String[] {"C1", "C2", "C3", "C4", "C5"};
		
		
		//Setting
		System.out.println("Setting================================");
		Set<String> sets = Arrays.asList(str_A).stream().collect(Collectors.toSet());
		//String 배열을 Set으로 변경
		
		System.out.println("size = " + sets.size());
		for(String str: sets) {
			System.out.print(str + "\t");
		}
		System.out.println();
		System.out.println();

		
		//ADD
		System.out.println("add - C,B================================");
		Set<String> AddSets = Arrays.asList(str_B).stream().collect(Collectors.toSet());
		AddSets.add("B6");
		sets.addAll(AddSets);
		//AddSets의 값을 sets에 입력
		
		Set<String> AddSets2 = Arrays.asList(str_C).stream().collect(Collectors.toSet());
		AddSets.add("C6");
		sets.addAll(AddSets2);
		//AddSets2의 값을 sets에 입력
		
		for(String str: sets) {
			System.out.print(str + "\t");
		}
		System.out.println();
		System.out.println();
		
		
		//FIND
		System.out.println("contains - A1================================");
		System.out.println("contains check A = " + sets.contains("A1"));
		System.out.println();
		
		//isEmpty
		System.out.println("isEmpty Check================================");
		System.out.println("sets empty check = " + sets.isEmpty());
		System.out.println();
		
		
		//removeAll
		System.out.println("removeAll - B================================");
		sets.removeAll(AddSets);
		//AddSets의 값 삭제
		Iterator<String> iterator = sets.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
		System.out.println();
		System.out.println();
		

		//retainAll
		System.out.println("retainAll - C================================");
		sets.retainAll(AddSets2);
		//AddSets2의 값을 제외하고 나머지 삭제
		
		//다양한 출력방법
		System.out.println("Print01================================");
		String[] results = new String[sets.size()];
		sets.toArray(results);
		//
		for(String str: results) {
			System.out.print(str + "\t");
		}
		System.out.println();
		System.out.println();

		System.out.println("Print02================================");
		sets.forEach(str -> System.out.print(str + "\t"));
		//Lambda
	}

}
