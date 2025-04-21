package chapter09.polymorphism;

class Rabbit extends Animal{
	@Override
	void move() {
		System.out.println("깡총");
	}
}
class Cat extends Animal{
	@Override
	void move() {
		System.out.println("사뿐");
	}
}

public class C079_polymorphism2 {

	public static void main(String[] args) {
		Animal animal1 = new Rabbit(); //자식 타입에서 만들되 부모 클래스 형태로 만드는 것을 업캐스팅이라 함
		Animal animal2 = new Cat();
		
		animal1.move();
		animal2.move();
		
		System.out.println("============");
		Animal[] animals = { new Rabbit(), new Cat(), new Tiger()};
		
		for (Animal a : animals) {
			a.move();
		}
	}

}
