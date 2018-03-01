/**
 * 28.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/
package com.eun1310434.collectionsframework.map;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


//Map
//�� Map
//  �� Hashtable
//  �� HashMap
//  �� LinkedHashMap
//  �� SortedMap
//    - TreeMap
//-Ű(key)�� ��(Value)�� �������� �����͸� ����
//-�����δ� ������ �����͸� ������ �� ������, Ű�� �����ؾ� ��
//-�����͸� ������ ������ ������� ����
//-ex) Hashtable, HashMap, LinkedHashMap, TreeMap
//-Hashtable : ��Ƽ�����忡 ����, null Ű�� ��� ����
//-HashMap : ��Ƽ�����忡 �������� ����, null Ű�� ��� 
//-LinkedHashMap : Ŭ������ ���� ������ ��� -> ���� ����
//-SortedMap �迭�� ����, ó��/�� ������, ���� ���� ���� �����ϴ� �޼��尡 ������ Ư�� �������� ������ ���� ����.

public class HashTableAPI {
	public static void main(String[] ar) {
		Map<Integer, String> hashTable = new Hashtable<>();
		hashTable.put(new Integer(1), "A");
		hashTable.put(2, "B");
		hashTable.put(3, "C");
		
		System.out.println("size = " + hashTable.size());
		
		if(hashTable.containsKey(1)) {
			System.out.println("Value of Key 1  = " + hashTable.get(1));
		}
		System.out.println("Value C contain Check = "+hashTable.containsValue("C"));
		
		String v = hashTable.getOrDefault(5, "NONE");
		// getOrDefault�� �ش� key�� ���� ���  ���� set�� ���� �ʰ� ������ default ���� ���� 
		System.out.println("Value of Key 5 = " + v);
		
		hashTable.remove(2); // remove - Key 2 
		hashTable.replace(3, "ZZZ"); // replace - Key 3 : ZZZ
		
		
		Set<Integer> getKeys = hashTable.keySet();
		Iterator<Integer> iterator = getKeys.iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			System.out.println(key + " : " + hashTable.get(key));
		}
		
		Collection<String> getValues = hashTable.values();
		String[] data = new String[getValues.size()];
		getValues.toArray(data);
		for(String str: data) {System.out.println(str);}
	}
}
