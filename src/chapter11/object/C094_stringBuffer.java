package chapter11.object;

public class C094_stringBuffer {

	public static void main(String[] args) {
/*
 		String: 불변(Immutable) > 문자열 수정 시 새로운 객체 생성
 		StringBuilder: 가변(Mutable) > 단일 스레드 환경에 적합
 		StringBuffer: 가변(Mutable) > 멀티 스레드 환경에 적합
 		
 		StringBuilder, StringBuffer는 내부적으로 동적 배열을 사용하여
 		문자열을 저장한다.
 		속도: StringBuilder > StringBuffer > String
 */
		String str = "strA";
		String str2 = new String("strA");
		StringBuilder sbd = new StringBuilder("sbdA");
		StringBuffer sbf = new StringBuffer("sbfA");
		
		System.out.println("=== 출력 ===");
		System.out.println("str: " + str);
		System.out.println("str2: " + str2);
		System.out.println("sbd: " + sbd);
		System.out.println("sbf: " + sbf);
		
		System.out.println("=== 해시코드 비교 ===");
		System.out.println("str의 hashcode: " + str.hashCode());//같은 문자열을 가지면
		System.out.println("str2의 hashcode: " + str2.hashCode());//해시코드도 같아지도록 자동 오버라이딩 된다.
		System.out.println("str === str2: " + (str == str2));//하지만 str은 상수풀에, str2는 힙에 저장되므로 다른 객체이다.
		System.out.println("sbd의 hashcode: " + sbd.hashCode());
		System.out.println("sbf의 hashcode: " + sbf.hashCode());
		
		// 데이터 수정
		str += "strB";
		sbd.append("sbdB"); //StringBuilder, StringBuffer는 append를 이용해서 문자열을 붙인다.
		sbf.append("sbfB");
		
		System.out.println("\n=== 수정 후 출력 ===");
		System.out.println("str: " + str);
		System.out.println("str2: " + str2);
		System.out.println("sbd: " + sbd);
		System.out.println("sbf: " + sbf);
		
		System.out.println("\n === 수정 후 해시코드 비교 ===");
		System.out.println("str의 hashcode: " + str.hashCode());//String은 불변이므로 덧붙일 시 새로운 인스턴스
		System.out.println("sbd의 hashcode: " + sbd.hashCode());//StringBuilder와 StringBuffer는 가변이므로
		System.out.println("sbf의 hashcode: " + sbf.hashCode());//해시코드는 바뀌지 않았고 안에 문자열만 변경되었다. = 같은 인스턴스다.
		
		// 성능 비교: String vs StringBuilder
		System.out.println("\n === 성능 비교 ===");
		long start = System.currentTimeMillis();
		String result1 = "";
		for (int i = 0; i < 1000; i++) {
			for(char ch = 'A'; ch <= 'z'; ch++) {
				result1 += ch;
			}
			result1 += '\n';
		}
		System.out.println("Stirng 소요시간: " 
				+ (System.currentTimeMillis()-start) / 1000.0 + "초");
		
		long start2 = System.currentTimeMillis();
		StringBuilder result2 = new StringBuilder();
		for(int i = 0; i < 1000; i++) {
			for (char ch = 'A'; ch < 'z'; ch++) {
				result2.append(ch);
			}
			result2.append('\n');
		}
		System.out.println("StringBuilder 소요 시간: "
				+ (System.currentTimeMillis()-start2) / 1000.0 + "초");
	}
	
	
	

}
