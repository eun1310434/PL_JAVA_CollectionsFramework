
package com.eun1310434.collectionsframework.list;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Vector;
class VectorAPIs_Comparator implements Comparator<Integer> {
	public int compare(Integer arg0, Integer arg1) {
		// TODO Auto-generated method stub
		return arg0 - arg1;
	}
}

//ListCollction
//□ Collection
//   ○ List
//     - Vector
//     - ArrayList
//     - LinkedList
//- 동일한 데이터를 중복 저장 가능
//- 인덱스(position)를 사용하여 데이터를 차례로 저장. 저장 순서를 알 수 있음
//- 특정위치에 대해 데이터를 추출,삽입 가능
//- ex) Vector, ArrayList, LinkedList
//- Vector : 멀티 스레드에 대해 안전, 무거움
//- ArrayList : 멀티 스레드에 대해 안전하지 않음, 가벼움
//- LinkedList : QueueDeque 및 List 모두를 구분하여 사용할 수 있도록 구성
//               스레드에 대한 동기화는  synchronizedList()를 래핑(Wrapping)하여 사용할 수 있다.

public class VectorAPI {
	public static void main(String[] ar) {
		Integer[] numbers = new Integer[]{100, 500, 300, 200};
		Vector<Integer> vector = new Vector<>();
		vector.addAll(Arrays.asList(numbers));
		
		vector.forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		
		vector.add(2, new Integer(400)); // 500 다음 위치에 400 삽입
		vector.forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		
		System.out.println("300의 위치 = " + vector.indexOf(300));
		
		vector.set(0, 525); // 0번째 위치에 있는 값을 525로 변경
		vector.forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		
		vector.sort(new ArrayListAPI_Comparator()); // 정렬
		vector.forEach(n -> System.out.print(n + "\t"));
		System.out.println();
	}
}
