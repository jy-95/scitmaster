package chapter06.class_part1;

class Human {
	int age;
	String name;
	
	void intro() {
		System.out.println("안녕, " + age + "살 " + name + "이라고해.");
	}
}

public class C045_class_basic2 {

	public static void main(String[] args) {
		Human kim = new Human();
		kim.age = 29;		//age = kim이라는 객체가 가지고 있는 변수
		kim.name = "므모";
		kim.intro();
		
		Human lee = new Human();
		lee.name = "몌무";
		lee.age = 5;
		lee.intro();
	}

}
