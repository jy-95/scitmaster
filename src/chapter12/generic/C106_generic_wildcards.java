package chapter12.generic;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

/*
 	제네릭 와일드카드(wildcard)
 	 - <?>				: 제한 없음 (Unbounded Wildcards)
 	 - <? extends 타입>	: 상위 타입 제한(Upper Bounded Wildcards)
 	 					  상위 타입이나 상위 타입의 하위 타입만 올 수 있음
 	 - <? super 타입>		: 하위 타입 제한(Lower Bounded Wildcards)
 	 					  하위 타입이나 하위 타입의 상위 타입만 올 수 있음
 */
class Human{
	void intro() {System.out.println("사람"); }
}
class Student extends Human{
	void intro() {System.out.println("학생");
}
	
class Room<T>{
	T value;
	Room(T value){
		this.value = value;
	}
	T get() {return value;}
	void set(T value) {this.value = value;}
}

public class C106_generic_wildcards {

	//1. <? extends Human> : Human과 그 하위 타입만 허용
	static void printMan(Room <? extends Human> room) {
		room.get().intro();
	}
	//2. <? super Human> : Human과 그 상위 타입만 허용
	static void printMan2(Room<? super Human> room) {
		Object obj = room.get();
		
		if (obj instanceof Human) {
			Human h = (Human) obj;
			h.intro();
		}else {
			System.out.println("Human 타입이 아닙니다.");
		}
	}
	
	//3. <?> : 타입 제한 없음
	
	
	public static void main(String[] args) {
		static void printMan3(Room<?> room) {
			
			//Room<Human>
			Human h = new Human();
			Room<Human> roomHuman = new Room<>(h);
			printMan (roomHuman);	//Ok (Human이거나 그 보다 하위)
			printMan2 (roomHuman);	// Ok (Human이거나 그 보다 상위
			printMan3 (roomHuman);	//Ok (제한 없음)
			
			//Room<Stdent>
			Student s = new Student();
			Room<Student> roomStudent; //
			printMan (roomStudent);
			printMan2 (roomStudent); // Err
			printMan3 (roomStudent);
	}

}
