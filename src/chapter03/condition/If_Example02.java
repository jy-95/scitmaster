package chapter03.condition;

import java.util.Scanner;

public class If_Example02 {

	public static void main(String[] args) {
		/*
		 세개의 정수를 입력받아,
		 If문을 활용하여 가장 큰 수를 출력한다.
		 출력결과 : 
		 	숫자1: 3
		 	숫자2: 1
		 	숫자3: 2
		 	최대값: 3
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 1: ");
		int numOne = sc.nextInt();
		System.out.print("숫자 2: ");
		int numTwo = sc.nextInt();
		System.out.print("숫자 3: ");
		int numThree = sc.nextInt();
		
		if (numOne>numTwo && numOne>numThree) {
			System.out.println("최대값: " + numOne);
		}else if (numTwo>numThree) {
			System.out.println("최대값: " + numTwo);
		}else {
			System.out.println("최대값: " + numThree);
		}
		

	}

}
