package chapter09.polymorphism;

class Dog extends Animal{
	void bark() {
		System.out.println("멍멍");
	}
}
class Dove extends Animal{
	void fly() {
		System.out.println("퍼득");
	}
}

public class C080_instanceof {

	public static void main(String[] args) {
		Dog a = new Dog();
		a.move();	//부모의 메서드 호출
		a.bark();	//자기의 메서드 호출
		
		Animal b = new Dog();
		b.move();
//		b.bark();//err. Dog 타입으로 만들지만 Animal 타입으로 표현하므로 Animal 클래스에 bark가 없으니 에러
		
		Animal c = new Dove();
		c.move();
//		c.fly(); //err
		
		testAnimal(b);
		testAnimal(c);
		
		Animal d = new Animal();
		
		System.out.println("=======");
		System.out.println(a instanceof Animal);
		System.out.println(b instanceof Animal);
		System.out.println(b instanceof Dog);
		System.out.println(c instanceof Animal);
		System.out.println(c instanceof Dove);
		System.out.println(d instanceof Dog);
		System.out.println(d instanceof Dove);
		
	}
	static void testAnimal(Animal animal) {
		animal.move();
		
//		Dog mydog = (Dog) animal;//강제 형변환
//		mydog.bark(); 	//dog 타입으로 바꿨으니 가능
//		
		
		if( animal instanceof Dog) {
			Dog mydog = (Dog) animal;
			mydog.bark();
		}
		if (animal instanceof Dove) {
			Dove mydove = (Dove) animal;
			mydove.fly();
		}
		// 패턴 매칭
		if (animal instanceof Dog mydog) {
			mydog.bark();
		}
		if (animal instanceof Dove mydove) {
			mydove.fly();
		}
	}
}
