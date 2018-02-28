/**
 * 28.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/
package com.eun1310434.collectionsframework.list;
import java.util.ArrayList;
import java.util.List;
interface ArrayListAPI1_onlyString {
	public String stringValue(); 
}
interface ArrayListAPI1_onlyInteger {
	public Integer integerValue();
}

class ArrayListAPI1_info implements ArrayListAPI1_onlyString, ArrayListAPI1_onlyInteger {
	private String key;
	private int value;
	public ArrayListAPI1_info(String _key, int _value){
		this.key = _key;
		this.value = _value;
	}

	@Override
	public String stringValue() {
		return key;
	}

	@Override
	public Integer integerValue() {
		return value;
	}
	
	public void display(){
		System.out.println("key = " +key+ ", value = " +value);
	}
}

//ListCollction
//�� Collection
// �� List
//   - Vector
//   - ArrayList
//   - LinkedList
//- ������ �����͸� �ߺ� ���� ����
//- �ε���(position)�� ����Ͽ� �����͸� ���ʷ� ����. ���� ������ �� �� ����
//- Ư����ġ�� ���� �����͸� ����,���� ����
//- ex) Vector, ArrayList, LinkedList
//- Vector : ��Ƽ �����忡 ���� ����, ���ſ�
//- ArrayList : ��Ƽ �����忡 ���� �������� ����, ������
//- LinkedList : QueueDeque �� List ��θ� �����Ͽ� ����� �� �ֵ��� ����
//             �����忡 ���� ����ȭ��  synchronizedList()�� ����(Wrapping)�Ͽ� ����� �� �ִ�.
//

class ArrayListAPI1_Copy {
	public static <T extends ArrayListAPI1_onlyString> void copyString(List<T> src, List<String> getListMemory) {
		for(int n = 0; n < src.size(); ++n) {
			T t = src.get(n);
			getListMemory.add(t.stringValue());
		}
	}
	public static <T extends ArrayListAPI1_onlyInteger> void copyInteger(List<T> src, List<Integer> getListMemory) {
		for(int n = 0; n < src.size(); ++n) {
			T t = src.get(n);
			getListMemory.add(t.integerValue());
		}
	}
}
public class ArrayListAPI1 {
	public static void main(String[] ar) {
		List<ArrayListAPI1_info> info = new ArrayList<>();
		info.add(new ArrayListAPI1_info("key-a", 0));
		info.add(new ArrayListAPI1_info("key-b", 1));
		info.add(new ArrayListAPI1_info("key-c", 2));
		
		List<String> getKeyList = new ArrayList<>();
		List<Integer> getValueList = new ArrayList<>();
		
		ArrayListAPI1_Copy.copyString(info, getKeyList);
		getKeyList.forEach(key -> System.out.print(key + "\t"));
		System.out.println();
		
		ArrayListAPI1_Copy.copyInteger(info, getValueList);
		getValueList.forEach(value -> System.out.print(value + "\t"));
	}
}
