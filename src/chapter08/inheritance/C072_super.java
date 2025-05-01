package chapter08.inheritance;

class Human{
	int age;
	String name;
	
	Human(int age, String name){
		System.out.println("== Human 생성자 ==");
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		System.out.printf("안녕, %d살 %s라고 해 \n", age, name);
	}
}

class Student extends Human{
	int stnum;
	String major;
	
	Student(int age, String name, int stnum, String major){
		super(age, name); 	//age, name은 부모에서 만든거라 부모 쪽 생성자를 통해 초기화하겠음
		System.out.println("== Student 생성자 ==");
		this.stnum = stnum;
		this.major = major;
	}
	
	void study() {
		System.out.printf("이름: %s, 학번: %d, 전공: %s \n", 
				super.name, stnum, major);
	}
}

class Graduate extends Student{
	String thesis;
	Graduate(int age, String name, int stnum, String major, String thesis){
		super(age, name, stnum, major);	//자기보다 한 단계 위에 클래스만(studnet) 찾아감
		System.out.println("== Graduate 생성자 ==");
		this.thesis = thesis;
	
	}
	void research() {
		System.out.println("논문: " + thesis + "저자 : "+name);
	}
}

public class C072_super {

	public static void main(String[] args) {
		
		Human kim = new Human(29, "김상형");
		kim.intro();
		
		Student lee = new Student(42, "이승우", 314344, "경영");
		lee.intro();
		lee.study();
		
		Graduate park = new Graduate (35, "박대희", 9024243, "전산",
				"웹 보안에 대한 연구");
				park.intro();	//Student 클래스는 human 클래스를 상속했으므로 사용 가능
				park.study();
				park.research();
		
	}

}
