package chapter11.object;

public class C091_wrapper {

	public static void main(String[] args) {
/*
 		*기본형			*Wrapper 클래스
 		boolean			Boolean
 		byte			Byte
 		char			Character
 		short			Short
 		int				Integer
 		long			Long
 		float			Float
 		double			Double
 */
		// 1. Boxing (기본형 > Wrapper) : valueOf 사용 기본 자료형을 참조 자료형으로 바꾸는 것이 목적
		int i = 1234;
		Integer wrapint = new Integer(i); //권장X
		Integer wrapInt = Integer.valueOf(i);
		String str = wrapInt.toString();
		System.out.println(str);
		
		// 2. 문자열 > int 변환
		String a = "56", b ="78";
		System.out.println(a + b); //문자열 이어붙이기
		System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
		//Integer.parseInt() = 매개변수로 들어간 문자열이 변환될 수 있다면 정수값으로 바꿔줌
		
		// 3. Unboxing (Wrapper > 기본형)
		Integer wrapInt2 = Integer.valueOf(629);
		int j = wrapInt2;	// 오토언박싱
		System.out.println(j);
		
		Double wrapDouble = Double.valueOf(3.14);
		double d1 = wrapDouble; //오토 언박싱
		int d2 = wrapDouble.intValue(); // 직접 언박싱 후 형 변환
		System.out.println(d1);
		System.out.println(d2);
		
		// 4. Autoboxing
		Integer c = 3;	//오토박싱
		Integer d = 4;	//오토박싱
		int e = c + d;	//오토박싱 + 연산
		System.out.println(e);
		System.out.println(c instanceof Integer);
		
		Integer f = 12;
		f++;	//참조형 데이터일 때는 ++을 사용할 수 없지만 자동으로 정수형으로 바뀐 뒤 계산하고 다시 인티저 타입으로 돌아옴
		System.out.println(f);
		System.out.println(f instanceof Integer);
		
		System.out.printf("int 타입크기=%d, 최소값=%d, 최대값=%d \n"
				, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.printf("short 타입크기=%d, 최소값=%d, 최대값=%d \n"
				, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
		System.out.printf("long 타입크기=%d, 최소값=%d, 최대값=%d"
				, Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
				
		
		
	}

}
