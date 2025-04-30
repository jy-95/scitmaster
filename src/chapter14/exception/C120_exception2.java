package chapter14.exception;

public class C120_exception2 {

	public static void main(String[] args) {
		// 다중 예외 처리
		int a, b, c;
		a = 5;
		b = 2;
		int[]ar = {1,2,3,4,5};
		
		try {
			c = a / b;
			System.out.println("c = " + c);
			ar[5]=100;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("첨자가 배열 범위를 넘어섰습니다.");
		}catch (Exception e) {
			e.printStackTrace();		}
		System.out.println("프로그램 실행 완료");	
	
	}
		try {
		c = a / b;
		System.out.println("c = " + c);
		ar[5]=100;
		}catch (ArithmeticException e) {
		System.out.println("0으로 나누기 예외 발샐");}
		catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("첨자가 배열 범위를 넘어섰습니다.");
		}catch (Exception e) {
			//예외가 발생했을 때 해당 예외가 발생한 위치와
			//호출 스택의 이름을 출력하는데 사용되는 메서드
		e.printStackTrace();		
		
		//예외에 대한 상세 메제지를 변환
		System.out.println(e.getMessage());
		
	System.out.println("프로그램 실행 완료");	
		
		

}
	
}