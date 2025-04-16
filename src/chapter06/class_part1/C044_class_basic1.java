package chapter06.class_part1;


class Car{
	// 멤버 변수
	String name;
	boolean gasoline;
	
	// 멤버 메서드
	void run() {
		if (gasoline) {
			System.out.println("부릉 부릉");
		}else {
			System.out.println("덜컹 덜컹");
		}
	}
	void stop() {
		System.out.println("끼익");
	}
	
	// 기본 생성자
	public Car() {
		System.out.println("기본 생성자 호출"); 	//Car라는 생성자가 있으므로 31번 줄에 이어서 출력됨
	}
}

public class C044_class_basic1 {

	public static void main(String[] args) {
		Car korando = new Car(); 	//생성자도 메서드의 일종. 이 시점에서 korando 라는 인스턴스 호출
		korando.name = "코란도C";
		korando.gasoline = false;
		System.out.print(korando.name + " : ");
		korando.run();
		
		Car equs = new Car();
		equs.name = "에쿠스";
		equs.gasoline = true;
		System.out.print(equs.name + " : ");
		equs.run();
		equs.stop();
		
	}

}
