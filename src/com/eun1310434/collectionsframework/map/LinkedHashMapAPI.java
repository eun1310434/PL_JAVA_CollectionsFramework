/**
 * 28.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
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
//�� Map
//�� Hashtable
//�� HashMap
//�� LinkedHashMap
//�� SortedMap
//  - TreeMap
//-Ű(key)�� ��(Value)�� �������� �����͸� ����
//-�����δ� ������ �����͸� ������ �� ������, Ű�� �����ؾ� ��
//-�����͸� ������ ������ ������� ����
//-ex) Hashtable, HashMap, LinkedHashMap, TreeMap
//-Hashtable : ��Ƽ�����忡 ����, null Ű�� ��� ����
//-HashMap : ��Ƽ�����忡 �������� ����, null Ű�� ��� 
//-LinkedHashMap : Ŭ������ ���� ������ ��� -> ���� ����
//-SortedMap �迭�� ����, ó��/�� ������, ���� ���� ���� �����ϴ� �޼��尡 ������ Ư�� �������� ������ ���� ����.

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
		
		//��� Map ���
		linkedHashMap.forEach(new LinkedHashMapAPI_BiConsumer());
		System.out.println();
		
		//��� ���̵� �빮�ڷ� replaceAll
		linkedHashMap.replaceAll(new LinkedHashMapAPI_BiFunction());
		linkedHashMap.forEach(new LinkedHashMapAPI_BiConsumer());
	}
}
