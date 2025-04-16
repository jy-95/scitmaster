package chapter01.data;

public class C014_ArithmeticConversion {

	public static void main(String[] args) {
		// 연산 중 형 변환(산술 형 변환)
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int) dNum1 + (int) fNum2;
		int iNum4 = (int) (dNum1 + fNum2);
		double iNum5 = dNum1 + fNum2; //연산 시 작은 타입이 큰 타입으로 맞춰진다.
		
		System.out.println(iNum3);
		System.out.println(iNum4);
		System.out.println(iNum5);

		double dNum2 = 0.9;
		System.out.println(dNum1 + dNum2); //double끼리 더할 땐 소수점 제대로 나옴
	}

}
