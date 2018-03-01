/**
 * 28.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
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
public class LinkedHashSetAPI {
	public static void main(String[] ar) {
		Set<LinkedHashSetAPI_info> set = new LinkedHashSet<>();
		//Generic�� ���Ͽ� LinkedHashSetAPI_info�� �����ϵ��� ����
		
		LinkedHashSetAPI_info info_a = new LinkedHashSetAPI_info("a", 0);
		LinkedHashSetAPI_info info_b = new LinkedHashSetAPI_info("b", 1);
		LinkedHashSetAPI_info info_c = new LinkedHashSetAPI_info("c", 2);
		LinkedHashSetAPI_info info_d = new LinkedHashSetAPI_info("d", 3);
		LinkedHashSetAPI_info info_e = info_a;
		//info_e�� info_a�� �����Ƿ� �ߺ� ������ �ȵ�
		//������ �����͸� �ߺ� ���� �Ұ�. �ߺ� ����� �ϳ��� �ν�
		
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
