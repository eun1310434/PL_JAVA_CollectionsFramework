
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

public class VectorAPI {
	public static void main(String[] ar) {
		Integer[] numbers = new Integer[]{100, 500, 300, 200};
		Vector<Integer> vector = new Vector<>();
		vector.addAll(Arrays.asList(numbers));
		
		vector.forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		
		vector.add(2, new Integer(400)); // 500 ���� ��ġ�� 400 ����
		vector.forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		
		System.out.println("300�� ��ġ = " + vector.indexOf(300));
		
		vector.set(0, 525); // 0��° ��ġ�� �ִ� ���� 525�� ����
		vector.forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		
		vector.sort(new ArrayListAPI_Comparator()); // ����
		vector.forEach(n -> System.out.print(n + "\t"));
		System.out.println();
	}
}
