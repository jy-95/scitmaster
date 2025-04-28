package chapter12.generic;

/*
 	타입 한정 키워드 extends
 	<T extends 제한타입> - 상한선 제한
 */
class Calculator<T extends Number>{
	void add(T a, T b) {}
	void min(T a, T b) {}
	void mul(T a, T b) {}
	void div(T a, T b) {}
}

public class C104_generic_range1 {

	public static void main(String[] args) {
		//Number <- Integer, Double 상속받고 있음
		Calculator<Number> cal1 = new Calculator<>();
		Calculator<Integer> cal2 = new Calculator<>();
		Calculator<Double> cal3 = new Calculator<>();
		
		//상한선이 Number까지만
//		Calculator<Object> cal4 = new Calculator(); //err
//		Calculator<String> cal5 = new Calculator(); //err
		
	}

}
