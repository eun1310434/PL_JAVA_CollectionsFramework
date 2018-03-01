
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

/*
□ Comparable 인터페이스 
     ○ 객체의 비교를 위한 인터페이스
     ○ 객체간에 순서나 정렬 가능하게 도움
     ○ 구현하는 방법
          - Comparable 인터페이스를 객체비교를 구현할 클래스에 implements (상속)
          - int compareTo(T o) 메소드를 재정의 
            : 내부적으로 객체를 비교하여 어떻게 순서가 정해질지에 대해서 구현
            : 현재의 객체가 다른객체와 비교
              01) 반환되는 값 0 → 순서 같음
              02) 반환되는 값 양수 → 순서가 뒤에 위치
              03) 반환되는 값 음수 → 순서가 앞에 위치
          - 비교하는 주체
            : 해당 메소드를 호출하는 객체
          - 비교대상
            : 주체자를 제외한 다른 객체


□ Comparator 인터페이스 
     ○ 객체의 비교를 위한 인터페이스Comparator
     ○ 객체간에 순서나 정렬 가능하게 도움
     ○ 구현하는 방법
          - Comparator인터페이스를 객체비교를 구현할 클래스에 implements (상속)
          - int compare(T o1, T o2) 메소드를 재정의
            : o1 객체와 o2 객체 비교
              01) o1 객체와 o2 객체보다 순서가 앞 → 양수
              02) o1 객체와 o2 객체보다 순서가 같음 → 0, 
              03) o1 객체와 o2 객체보다 순서가 뒤 → 음수
          - 비교하는 주체
            : o1
          - 비교대상
            : o2


□ Comparable 와 Comparator 인터페이스 차이
     ○ 비교하는 기준에 따라서 정렬이 다름
     ○ Comparable
         - 자기자신과 같은 클래스 타입의 다른객체와 비교하기 위해서 사용
     ○ Comparator 
         - 다른 두개의 객체를 비교
         - Comparator 를 구현한 객체가 다른 두개의 객체를 비교하는 기준이 되어 두개의 객체를 비교
         - 주로 어떤 특정 객체에 대한 객체비교의 기준점을 제시할 때 사용
 */
