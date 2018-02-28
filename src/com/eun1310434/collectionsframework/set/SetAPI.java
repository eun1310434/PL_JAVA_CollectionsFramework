/**
 * 28.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/
package com.eun1310434.collectionsframework.set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

//SetCollction
//�� Collection
//�� Set
//  - HashSet
//    �� LinkedHashSet
//  - SortedSet / NavigableSet
//    �� TreeSet
//- ������ �����͸� �ߺ� ���� �Ұ�. �ߺ� ����� �ϳ��� �ν�
//- ������ ���� ���� ����. ����) LinkedHashedSet Ŭ������ ���� ���� ���
//- SortedSet(TreeSet) �迭�� ����, ó��/�� ������, ���� ���� ���� �����ϴ� �޼��� ����
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
		//String �迭�� Set���� ����
		
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
		//AddSets�� ���� sets�� �Է�
		
		Set<String> AddSets2 = Arrays.asList(str_C).stream().collect(Collectors.toSet());
		AddSets.add("C6");
		sets.addAll(AddSets2);
		//AddSets2�� ���� sets�� �Է�
		
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
		//AddSets�� �� ����
		Iterator<String> iterator = sets.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
		System.out.println();
		System.out.println();
		

		//retainAll
		System.out.println("retainAll - C================================");
		sets.retainAll(AddSets2);
		//AddSets2�� ���� �����ϰ� ������ ����
		
		//�پ��� ��¹��
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
