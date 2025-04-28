package chapter12.generic;

class Coffee{}
class Juice{}

class BeverageBox{
	private Object[] beverage;
	
	public BeverageBox(Object[] beverage) { //Object는 최상위 클래스이므로 어떤 타입이든 가능하다.
		this.beverage = beverage;

	}
	public Object getBeverage(int index) {
		return beverage[index];
	}
}
class BeverageBox2<T>{
	private T[] beverage;
	
//	static T t; //static에서 사용 불가.
	
	public BeverageBox2(T[] beverage) { //Object는 최상위 클래스이므로 어떤 타입이든 가능하다.
		this.beverage = beverage;
//		T t = new T(); //T타입 인스턴스 생성 불가
	}
	public T getBeverage2(int index) {
		return beverage[index];
	}
}

public class C099_generic1 {

	public static void main(String[] args) {
		Coffee[] arr = {
				new Coffee(),
				new Coffee()
		};
		BeverageBox box = new BeverageBox(arr);
		
		Coffee coffee = (Coffee)box.getBeverage(0);//Object 타입으로 리턴하지만 Coffee 타입으로 받고 싶으니 형변환한다.
		Juice juice = (Juice)box.getBeverage(1);//coffee 타입의 배열이 있는데 juice 타입으로 받으려 하면 에러가 발생할 수 있다.
												// 다만 실행 전까지는 알 수 없다.
		
		//제너릭 사용
		BeverageBox2<Coffee> box2 = new BeverageBox2<>(arr);
		
		Coffee coffee2 = box2.getBeverage2(0); 
				//형변환 필요가 없다. 이미 Coffee 타입으로 리턴이 되어질테니
//		Juice juice2 = box.getBeverage(1);//컴파일 시점에서 에러 확인 가능
	}											

}
