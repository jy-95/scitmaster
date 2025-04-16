package chapter02.operator;

import java.util.Scanner;

public class C019_Operator5 {

	public static void main(String[] args) {
		// 삼항 연산자 & 조건 연산자
		// 조건식 ? 결과1 : 결과2
		
		Scanner sc = new Scanner(System.in);
		int fatherAge;
		int motherAge;
		
		System.out.print("아버지의 나이: ");
		fatherAge = sc.nextInt();
		System.out.print("어머니의 나이: ");
		motherAge = sc.nextInt();
		
		String ch = ((fatherAge > motherAge)
					?
					"아빠가 연상"
					:
					(fatherAge < motherAge)
					?
					"엄마가 연상"
					:		
					"동갑");
		System.out.println(ch);
		
		//삼항 연산자 중첩
		//(조건 1) ? (참) : (조건2) ? (참) : (거짓)
		
					

	}

}
