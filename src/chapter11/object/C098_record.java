package chapter11.object;

/*
 	record
 	 - 불변(Immutable) 객체를 쉽게 만들 수 있는 클래스
 	 
 	특징
 	 - 모든 필드는 자동으로 final
 	 - 모든 필드를 포함하는 생성자 자동 생성
 	 - getter 메서드 자동 생성
 	 - equals(), hashcode(), toString() 자동 생성
 	 - 상속 불가. abstract 선언 불가
 	 - 다른 클래스 상속 불가(extends X), 인터페이스 구현 가능(implement O)
 */
class A{}
interface B {}

//record Member(String name, int memberCode) {
//record Member(String name, int memberCode) extends A { //err
record Member(String name, int memberCode) implements B { 
	
	public Member(int memberCode) {
		this("홍길동", memberCode);
	}
	
}

public class C098_record {

	public static void main(String[] args) {
		Member m = new Member("홍길동", 101010);
		System.out.println(m);
		System.out.println(m.name());
		System.out.println(m.memberCode());
	}

}
