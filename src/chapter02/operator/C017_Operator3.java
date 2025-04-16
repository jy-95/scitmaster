package chapter02.operator;

public class C017_Operator3 {

	public static void main(String[] args) {
		// 증감 연산자
		int value = 2;
		int a = ++value;
		System.out.println("vlaue = " + value + ", a = " + a);
		
		value = 2;
		a = value++; //a에 value 대입 후 value 1 증가
		System.out.println("vlaue = " + value + ", a = " + a);
		
		// 부호 연산자
		int value2 = 8;
		System.out.println(value2);
		value2 = -value2;
		System.out.println(value2);
		
		// 문자열 연결
		System.out.println(4 + 5);
		System.out.println("영구와 " + "땡칠이");
		System.out.println("응답하라 " + 1989); //첫번째 데이터가 문자열이면 문자열에 숫자를 더해도 문자열로 출력
		System.out.println("" + 19 + 89 + " 응답하라");
	}

}
