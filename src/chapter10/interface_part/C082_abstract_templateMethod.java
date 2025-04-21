package chapter10.interface_part;

abstract class Car{
	public abstract void drive();
	public abstract void stop();
	
	private void startCar() {
		System.out.println("시동을 켭니다.");
	}
	private void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	//template 메서드
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}

class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율 주행합니다.");
		System.out.println("자동차가 알아서 방향을 전환합니다.");
	}
	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다.");
	}
}

class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 핸들을 조작합니다.");
	}
	@Override
	public void stop() {
		System.out.println("브레이크로 정지합니다.");
	}
}

public class C082_abstract_templateMethod {

	public static void main(String[] args) {
		System.out.println("=== 자율 주행하는 자동차 ===");
		Car mycar = new AICar();
		mycar.run();
		
		System.out.println("=== 사람이 운전하는 자동차 ===");
		Car hiscar = new ManualCar();
		hiscar.run();
	}

}

abstract class AA{
	abstract void methodA();
	abstract void methodB();
}
abstract class BB extends AA{

	@Override
	void methodA() {
	}					//methodB는 오버라이딩 안함
	
}
class CC extends BB{

	@Override
	void methodB() {
	}					//BB도 추상클래스이므로 이를 상속하고 있는 CC가 methodB를 오버라이딩 함
	
}