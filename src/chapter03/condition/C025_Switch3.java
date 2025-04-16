package chapter03.condition;

public class C025_Switch3 {

	public static void main(String[] args) {
		// String
		String country = "China";
		
		switch (country) {
			case "Koreal" :
				System.out.println("Seoul");
				break;
			case "China" : 
				System.out.println("Beijing");
				break;
			case "Japan" : 
				System.out.println("Tokyo");
				break;
		}
		
		//String 비교 ( ==, equals() )
		String a = "안녕";
		String b = "안녕";
		System.out.println(a == b);	//"안녕"이라는 리터럴 주소값이 같기 때문에
		
		String c = new String("안녕"); 	//new를 사용해서 새롭게 만들어짐. 
										//위에 안녕과는 다른 주소값을 가짐
		System.out.println(a == c);		// 주소값이 다르기에 false
		
		System.out.println(a.equals(c)); //'안녕'이라는 알맹이를 비교하는 메소드인 equals

	}

}
