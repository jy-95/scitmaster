package chapter05.method;

public class C042_method5 {

	public static void main(String[] args) {
		// Call by Value vs Call by Reference
		int num = 2;
		getDouble(num);
		System.out.println("num = "+ num); //num 값이 출력
		
		int result = getDouble(num);
		System.out.println("result = "+ result);
		System.out.println("num = "+ getDouble(num));	//반환값 출력
		
		int[] arr = {2, 8, 6};
		System.out.println(arr);	//기본형 데이터타입과 다르게 참조형 데이터
		getDouble2(arr);			//는 바로 출력 시 가상 주소값 출력됨
		System.out.println(arr[0]);
	}
		// Call by reference(참조에 의한 호출)
		// 객체를 전달할 때 "참조값"이 복사되어 전달
		// 객체의 주소값이 복사되어 전달되므로 객체 내부값은 변경될 수 있지만,
		// (여기서는 변경이 되었으나) 참조 자체를 변경하면 원본에는 영향을 미치지 않음
		static void getDouble2(int[] value) {
			value[0] *= 2;
		}
		
		// Call by Value(값에 의한 호출)
		// 메서드에 값을 전달할 때, 변수의 실제 값이 복사되어 전달
		// 기본형 데이터타입은 Call by Value 방식으로 전달
		// 메서드 내부에서 값이 변경되어도 원본 변수에는 영향을 주지 않음
		static int getDouble(int value) {
			value *= 2;
			return value;
		}
}
