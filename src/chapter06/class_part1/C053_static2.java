package chapter06.class_part1;

public class C053_static2 {
	//멤버 메서드, 정적 메서드
	public static int add(int x, int y) {
		return x + y;
	}
	//멤버 메서드, 인스턴스 메서드
	public int minus(int x, int y) {
		return x - y;
	}
	
	public static void main(String[] args) {
		C053_static2 cal = new C053_static2();
		int sum = cal.minus(3, 1); 	//인스턴스로부터 호출됨
		System.out.println(sum);
		
		int sum2 = C053_static2.add(2, 3); //클래스로부터 호출됨(static이니까)
		System.out.println(sum2);
		
		int sum3 = cal.add(3, 5); //이렇게 해도 괜찮지만 굳이 그럴 필요가 없다. 
								//static은 인스턴스보다 먼저 생겼으니까
		
//		C053_static2.minus(3, 1); //err
				
	}

}
