/**
 * 28.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/
package com.eun1310434.collectionsframework.list;
import java.util.List;
import java.util.Vector;
interface VectorAPI1_onlyString {
	public String stringValue(); 
}
interface VectorAPI1_onlyInteger {
	public Integer integerValue();
}

class VectorAPI1_info implements VectorAPI1_onlyString, VectorAPI1_onlyInteger {
	private String key;
	private int value;
	public VectorAPI1_info(String _key, int _value){
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
//□ Collection
// ○ List
//   - Vector
//   - ArrayList
//   - LinkedList
//- 동일한 데이터를 중복 저장 가능
//- 인덱스(position)를 사용하여 데이터를 차례로 저장. 저장 순서를 알 수 있음
//- 특정위치에 대해 데이터를 추출,삽입 가능
//- ex) Vector, ArrayList, LinkedList
//- Vector : 멀티 스레드에 대해 안전, 무거움
//- ArrayList : 멀티 스레드에 대해 안전하지 않음, 가벼움
//- LinkedList : QueueDeque 및 List 모두를 구분하여 사용할 수 있도록 구성
//             스레드에 대한 동기화는  synchronizedList()를 래핑(Wrapping)하여 사용할 수 있다.
//

class VectorAPI1_Copy {
	public static <T extends VectorAPI1_onlyString> void copyString(List<T> src, List<String> getListMemory) {
		for(int n = 0; n < src.size(); ++n) {
			T t = src.get(n);
			getListMemory.add(t.stringValue());
		}
	}
	public static <T extends VectorAPI1_onlyInteger> void copyInteger(List<T> src, List<Integer> getListMemory) {
		for(int n = 0; n < src.size(); ++n) {
			T t = src.get(n);
			getListMemory.add(t.integerValue());
		}
	}
}
public class VectorAPI1 {
	public static void main(String[] ar) {
		Vector<ArrayListAPI1_info> info = new Vector<>();
		info.add(new ArrayListAPI1_info("key-a", 0));
		info.add(new ArrayListAPI1_info("key-b", 1));
		info.add(new ArrayListAPI1_info("key-c", 2));
		
		Vector<String> getKeyList = new Vector<>();
		Vector<Integer> getValueList = new Vector<>();
		
		ArrayListAPI1_Copy.copyString(info, getKeyList);
		getKeyList.forEach(key -> System.out.print(key + "\t"));
		System.out.println();
		
		ArrayListAPI1_Copy.copyInteger(info, getValueList);
		getValueList.forEach(value -> System.out.print(value + "\t"));
	}
}
