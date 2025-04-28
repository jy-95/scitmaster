package chapter12.generic;

import java.util.ArrayList;

public class C100_generic2 {

	public static void main(String[] args) {
		ArrayList arNum = new ArrayList();
		arNum.add(1);
		arNum.add("문자열");
		
		int value = (int)arNum.get(0);//제너릭 타입을 명시하지 않았기 때문에 Object 타입으로 보고 있음.
		System.out.println(value);
//		int temp = (int)arNum.get(1); //err
		
		ArrayList<Integer> arNum2 = new ArrayList<>();
		arNum2.add(1);
//		arNum2.add("문자열"); //제너릭으로 지정 시 저장할때부터 err를 확인 가능
		int value2 = arNum2.get(0);
		System.out.println(value2);
	}

}
