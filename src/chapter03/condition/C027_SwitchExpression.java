package chapter03.condition;

public class C027_SwitchExpression {

	public static void main(String[] args) {
		// switch 표현식
		int ranking = 1;
		String medal = switch (ranking) { //medal = 어쩌구 라는 변수 medal에 어떤 값을 할당해야 하는 문법이므로 default 필요
			case 1 -> {
				System.out.println("우승");
				yield "금메달";
			}
			case 2 -> "은메달";
			case 3 -> "동메달";
			case 4, 5 -> "장려상";
			default -> "참가상";
		};
		System.out.println(medal + "을 수여합니다."); 

		switch (ranking) {
			case 1 -> System.out.println("금메달");
			case 2 -> System.out.println("은메달");
			case 3 -> System.out.println("동메달");
			
			// 변수에 무슨 값을 반드시 줘야하는 것이 아니므로 default 불필요.
		}
	}

}
