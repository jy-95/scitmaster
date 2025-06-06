package chapter13.collection;

import java.util.ArrayList;
import java.util.List;

public class C107_collection_arrayList1 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2, 5);	//index 2에 5의 값을 추가
		
		for (Integer i : list) {
			System.out.println(i + " ");
		}
		System.out.println();
		
		list.remove(0); //index 0 값 제거
		
		for (Integer i : list) {
			System.out.println(i + " ");
		}
		System.out.println();
		
		System.out.println("get(index): " + list.get(0));
		System.out.println("get(index): " + list.get(1));
		System.out.println("size(): " + list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
	}

}
