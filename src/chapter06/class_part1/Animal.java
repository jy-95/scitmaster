package chapter06.class_part1;
class Doubutu {
	String name;
	
	void Cry (String cry) {
		System.out.println(name);
		System.out.println(cry);
	}
}
public class Animal {
	
	public static void main(String[] args) {
		Doubutu dog = new Doubutu();
		dog.name = "왕코";
		dog.Cry("멍멍");
		
		Doubutu neko = new Doubutu();
		neko.name = "냥냥";
		neko.Cry("야옹");
	}

}
