package chapter14.exception;

public class C124_throw3 {

	public static void main(String[] args) {
/*
 		checked Exception : 컴파일러가 예외처리를 강제하는 예외 클래스
 		예외가 발생할 수 있는 메서드를 호출할 때, 해당 예외를 try-catch 블럭으로
 		처리하거나, 메서드에 throws 키워드를 사용해 명시적으로 예외를 던져야 한다.
 		Ex. IOException, SQLException, Exception ...
 */
		String name = null;
		try {
			printLength(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 실행 완료");
	}

	private static void printLength(String name) 
			throws Exception {//throws 예외처리를 미룬다. 던진다.
		if(name == null) {
			throw new Exception("이름이 무효합니다.");
			//Exception은 checkedException이라 컴파일 시점에서 확인. 
		}
		System.out.println(name.length());
	}

}
