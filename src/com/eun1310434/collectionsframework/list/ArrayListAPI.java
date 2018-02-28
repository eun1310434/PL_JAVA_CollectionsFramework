/**
 * 28.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/
package com.eun1310434.collectionsframework.list;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
class ArrayListAPI_Comparator implements Comparator<Integer> {
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

public class ArrayListAPI {
	public static void main(String[] ar) {
		Integer[] numbers = new Integer[]{100, 500, 300, 200};
		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(numbers));
		
		list.forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		
		list.add(2, new Integer(400)); // 500 다음 위치에 400 삽입
		list.forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		
		System.out.println("300의 위치 = " + list.indexOf(300));
		
		list.set(0, 525); // 0번째 위치에 있는 값을 525로 변경
		list.forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		
		list.sort(new ArrayListAPI_Comparator()); // 정렬
		list.forEach(n -> System.out.print(n + "\t"));
		System.out.println();
	}
}
