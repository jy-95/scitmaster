package chapter10.interface_part;


abstract sealed class Language permits Java, Cpp, CSharp{}

//final class Phyton extends Language{}	//상속 제한
final class Java extends Language{}
//final class Cpp extends Language{}
//final class CSharp extends Language{}

//final class OpenJava extends Java{}	//상속 제한(java가 파이널 클래스가 상속 불가)
//Cpp로부터는 두 개의 클래스 파생 가능
sealed class Cpp extends Language permits C11, C20{}

final class C11 extends Cpp{}
final class C20 extends Cpp{}
// CSharp로부터는 임의의 클래스 파생 가능
non-sealed class CSharp extends Language{}
final class CSharpCore extends CSharp{}


public class C083_sealed {

	public static void main(String[] args) {
/*
 		상속 제한
 		final		: 더 이상 파생할 수 없다
 		sealed		: 지정한 후손에 대해서만 파생을 허가
 		non-sealed	: 제한 없이 파생 가능
 		
 		sealed로부터 파생된 클래스들은 위 셋 중 하나를 선택해야 함.
 */
		Language lang_java = new Java();
		outLanguageName(lang_java);
		
	}
	public static void outLanguageName(Language lang) {
		if(lang instanceof Java) {
			System.out.println("쟈바");
		}else if (lang instanceof Cpp) {
			System.out.println("C++");
		}else if (lang instanceof CSharp) {
			System.out.println("C#");
		}
	}
}
