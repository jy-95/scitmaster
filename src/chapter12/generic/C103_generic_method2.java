package chapter12.generic;

class GenericTest<T, U>{
	//클래스의 제너릭타입으로 운영되는 제네릭 메서드
	void method1(T t, U u) {
		System.out.println(t + ", " + u);
	}
	
	// 독립적인 제너릭태입으로 운영되는 제너릭 메서드
	<K, V> void method2(K k, V v) {
		System.out.println(k + ", " + v);
	}
}

public class C103_generic_method2 {

	public static void main(String[] args) {
		GenericTest<String, Integer> gt = new GenericTest<>();
		gt.method1("안녕", 123);
//		gt.method1(123, "안녕"); //err 타입 순서가 다르다.
		gt.method2(3.14, 999); //독립적인 제너릭 타입을 사용한다.
		
		// 명시적인 제너릭 타입을 통한 메서드 호출
		gt.<Integer, Long>method2(30, 200L);
		
	}

}
