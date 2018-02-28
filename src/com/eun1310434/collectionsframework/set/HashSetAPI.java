/**
 * 28.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/
package com.eun1310434.collectionsframework.set;
import java.util.HashSet;
import java.util.Set;

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
class HashSetAPI_info{
	private String key;
	private int value;
	public HashSetAPI_info(String _key, int _value){
		this.key = _key;
		this.value = _value;
	}
	public void display(){
		System.out.println("key = " +key+ ", value = " +value);
	}
}
//SetCollcton
//�� Collection
//  �� Set
//    - HashSet
//      �� LinkedHashSet
//    - SortedSet / NavigableSet
//      �� TreeSet
//- ������ �����͸� �ߺ� ���� �Ұ�. �ߺ� ����� �ϳ��� �ν�
//- ������ ���� ���� ����. ����) LinkedHashedSet Ŭ������ ���� ���� ���
//- SortedSet �迭�� ����, ó��/�� ������, ���� ���� ���� �����ϴ� �޼��� ����
//- ex) HashSet, LinkedHashSet, TreeSet
public class HashSetAPI {
	public static void main(String[] ar) {
		Set<HashSetAPI_info> set = new HashSet<>();
		//Generic�� ���Ͽ� HashSetAPI_info�� �����ϵ��� ����
		
		HashSetAPI_info info_a = new HashSetAPI_info("a", 0);
		HashSetAPI_info info_b = new HashSetAPI_info("b", 1);
		HashSetAPI_info info_c = new HashSetAPI_info("c", 2);
		HashSetAPI_info info_d = new HashSetAPI_info("d", 3);
		HashSetAPI_info info_e = info_a;
		//info_e�� info_a�� �����Ƿ� �ߺ� ������ �ȵ�
		//������ �����͸� �ߺ� ���� �Ұ�. �ߺ� ����� �ϳ��� �ν�
		
		set.add(info_a);
		set.add(info_b);
		set.add(info_c);
		set.add(info_d);
		set.add(info_e);

		set.forEach(info -> info.display());
	}
}
