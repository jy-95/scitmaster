package chapter03.condition;

import java.util.Scanner;

public class Switch_Example02 {

	public static void main(String[] args) {
/*
 		사칙연산 계산기
 		정수 2개와 연산자(+, -, *, /)를 입력받아 결과를 출력한다.
 		단, 나눗셈 연산시 분모가 0일 경우, "0으로 나눌 수 없습니다."를 출력한다.
 		출력 결과:
 			연산자 (+, -, *, /) : /	연산자 (+, -, *, /): +
 			정수 1 입력: 3				정수 1 입력: 3
 			정수 2 입력: 0				정수 2 입력: 10
 			0으로 나눌 수 없습니다.			결과: 13
 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산자 (+, -, *, /): ");
		String input = sc.next();
		System.out.print("정수 1 입력: ");
		int num1 = sc.nextInt();
		System.out.print("정수 2 입력: ");
		int num2 = sc.nextInt();
		
		double result = 0;
		
		switch(input) {
			case("+") : result = num1 + num2; break;
			case("-") : result = num1 - num2; break;
			case("*") : result = num1 * num2; break;
			case("/") : 
				if (num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다.");
					System.exit(0);
				}
				result = num1 / num2; break;
			default: System.out.println("잘못 입력했습니다.");
		}
		System.out.println("결과: " + result);
	}

}
