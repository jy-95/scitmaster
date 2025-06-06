package chapter11.object;

public class C093_string2 {

	public static void main(String[] args) {
		// length, charAt
		String str = "아름다운 우리나라";
		System.out.println("길이: " + str.length());
		System.out.println("2번째 문자: " + str.charAt(1));
	
		// indexof
		String str2 = "String Search Method of String Class";
		System.out.println("앞쪽 t = " + str2.indexOf('t'));
		System.out.println("뒤쪽 t = " + str2.lastIndexOf('t'));
		System.out.println("앞쪽 z = " + str2.indexOf('z'));
		System.out.println("앞쪽 String = " + str2.indexOf("String"));
		System.out.println("뒤쪽 String = " + str2.lastIndexOf("String"));
		
		// startsWith, endsWith
		String str3 = "girl.jpg";
		System.out.println(str3.startsWith("g"));
		System.out.println(str3.endsWith(".jpg"));
		
		// changecase
		String str4 = "Kim Sang Hyung";
		System.out.println(str4.toLowerCase());
		System.out.println(str4.toUpperCase());
		str4.toUpperCase();
		System.out.println(str4);	//원본 변경 X
		
		// trim, concat
		String str5 = "		Kim Sang Hyung		";
		System.out.println(str5.trim());
		System.out.println(str5.trim().concat(" BABO"));
		
		// replace
		String str6 = "독도는 일본땅, 대마도는 일본땅";
		System.out.println(str6.replace("일본", "한국"));
		System.out.println(str6.replaceFirst("일본", "한국"));
		
		// substring
		String str7 = "0123456789";
		System.out.println(str7.substring(3, 7));
		
		// split
		String city = "서울, 대전, 대구, 부산";
		String[] token = city.split(",");
		for (String s : token) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		// join
		String path = String.join("/", "user", "data", "app", "local" );
		System.out.println(path);
	}
	

}
