/**
 * 28.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/
package com.eun1310434.collectionsframework.set;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;


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
		//�ſ� �߿�!!!! ����(this)�� �ԷµǴ� ��(TreeSetAPI_info)��
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
//- ������ �����͸� �ߺ� ���� �Ұ�. �ߺ� ����� �ϳ��� �ν�
//- ������ ���� ���� ����. ����) LinkedHashedSet Ŭ������ ���� ���� ���
//- SortedSet �迭�� ����, ó��/�� ������, ���� ���� ���� �����ϴ� �޼��� ����
//- ex) HashSet, LinkedHashSet, TreeSet


public class TreeSetAPI {
	public static void main(String[] ar) {
		//Set<TreeSetAPI_info> set = new TreeSet<>();
		SortedSet<TreeSetAPI_info> set = new TreeSet<>();
		//Generic�� ���Ͽ� TreeSetAPI_info�� �����ϵ��� ����
		
		TreeSetAPI_info info_a = new TreeSetAPI_info("a", 3);
		TreeSetAPI_info info_b = new TreeSetAPI_info("b", 2);
		TreeSetAPI_info info_c = new TreeSetAPI_info("c", 1);
		TreeSetAPI_info info_d = new TreeSetAPI_info("d", 0);
		//info_e�� info_a�� �����Ƿ� �ߺ� ������ �ȵ�
		//������ �����͸� �ߺ� ���� �Ұ�. �ߺ� ����� �ϳ��� �ν�

		set.add(info_a);
		set.add(info_b);
		set.add(info_c);
		set.add(info_d);

		set.forEach(info -> info.display());
		System.out.println();
		
		System.out.printf("first : ");
		set.first().display();
		//.first()�� compareTo������ ���ؿ� ���� ���� ���� �� ���
		
		System.out.printf("last : ");
		set.last().display();
		//.first()�� compareTo������ ���ؿ� ���� ���� ū �� ���
		System.out.println();
		
		SortedSet<TreeSetAPI_info> tailSets 
		= set.tailSet(new TreeSetAPI_info("b", 2));
		//.tailSet(X)�� X�� �Է°��� compareTo������ ���ؿ� ���� ������ ������ ���
		System.out.printf("tailSet ");
		tailSets.forEach(info -> info.display());
		System.out.println();

		
		//�Է½�  Key������ ���� �ǽ��Ͽ� ����...
		SortedSet<TreeSetAPI_info> set2 = new TreeSet<>(new TreeSetAPI_Comparator_Key());
		//the comparator that will be used to order this set. 
		//If null, the natural ordering of the elements will be used.
		set2.addAll(set);
		set2.forEach(info -> info.display());
		System.out.println();

		
		//�Է½� Value������ ���� �ǽ��Ͽ� ����...
		SortedSet<TreeSetAPI_info> set3 = new TreeSet<>(new TreeSetAPI_Comparator_Value());
		//the comparator that will be used to order this set. 
		//If null, the natural ordering of the elements will be used.		
		set3.addAll(set);
		set3.forEach(info -> info.display());
		//Lambda
		
		
		
	}
}
