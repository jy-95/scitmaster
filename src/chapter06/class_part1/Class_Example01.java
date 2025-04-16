package chapter06.class_part1;

public class Class_Example01 {

	public static void main(String[] args) {
		// 인스턴스 생성 및 호출
		Character one = new Character("므모", "전사");
		one.info();
		System.out.println(one.skill());
		Character two = new Character("몌무", "궁수", 3, 2, 5, 4);
		two.info();
		System.out.println(two.skill());
		Character three = new Character("뫄", "너부리", 5, 3, 4, 7);
		three.info();
		System.out.println(three.skill());
		

	}

}
