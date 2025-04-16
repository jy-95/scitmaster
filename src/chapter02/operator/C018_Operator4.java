package chapter02.operator;

public class C018_Operator4 {

	public static void main(String[] args) {
		// 논리 연산자
		int num1 = 10, num2 = 20;
		
		// && (and)
		boolean flag = (num1 > 0) && (num2 > 0);
		System.out.println(flag);
		
		// || (or)
		flag = (num1 < 0) || (num2 > 0);
		System.out.println(flag);
		
		// ! (not)
		System.out.println( !flag );
		
		System.out.println("=================");
		
		int num = 10;
		int i = 2;
		
		boolean value = (num = num + 10) < 10
						&&
						(i = i + 2) < 10; // and 연산이므로 전항에서 틀렸으니 후항 연산은 하지 않는다.
		System.out.println(value);
		System.out.println(num);
		System.out.println(i);

		num = 10;
		i = 2;
		
		value = (num += 10) > 10
				||
				(i += 2) < 10; // 전항에서 이미 true 이므로 후항은 연산하지 않는다.
		System.out.println(value);
		System.out.println(num);
		System.out.println(i);
	}

}
