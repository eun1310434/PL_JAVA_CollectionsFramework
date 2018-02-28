/**
 * 28.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
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
//�� Collection
//   �� List
//     - Vector
//     - ArrayList
//     - LinkedList
//- ������ �����͸� �ߺ� ���� ����
//- �ε���(position)�� ����Ͽ� �����͸� ���ʷ� ����. ���� ������ �� �� ����
//- Ư����ġ�� ���� �����͸� ����,���� ����
//- ex) Vector, ArrayList, LinkedList
//- Vector : ��Ƽ �����忡 ���� ����, ���ſ�
//- ArrayList : ��Ƽ �����忡 ���� �������� ����, ������
//- LinkedList : QueueDeque �� List ��θ� �����Ͽ� ����� �� �ֵ��� ����
//               �����忡 ���� ����ȭ��  synchronizedList()�� ����(Wrapping)�Ͽ� ����� �� �ִ�.

public class ArrayListAPI {
	public static void main(String[] ar) {
		Integer[] numbers = new Integer[]{100, 500, 300, 200};
		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(numbers));
		
		list.forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		
		list.add(2, new Integer(400)); // 500 ���� ��ġ�� 400 ����
		list.forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		
		System.out.println("300�� ��ġ = " + list.indexOf(300));
		
		list.set(0, 525); // 0��° ��ġ�� �ִ� ���� 525�� ����
		list.forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		
		list.sort(new ArrayListAPI_Comparator()); // ����
		list.forEach(n -> System.out.print(n + "\t"));
		System.out.println();
	}
}
