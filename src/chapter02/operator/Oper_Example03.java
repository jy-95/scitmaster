package chapter02.operator;

import java.util.Scanner;

public class Oper_Example03 {

	public static void main(String[] args) {
		/*
		 각 자리수의 합 구하기
		 출력결과 :
		 	0~999 사이의 정수를 입력하세요
		 	315
		 	각 자리수의 합: 9
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0~999 사이의 정수를 입력하세요.");
		int num = sc.nextInt();
		
		int num100 = num/100;
		int num10 = (num - num100*100)/10; 	//num % 100 / 10
		int num1 = num - num100*100 - num10*10;	// num %100 % 10

		int result = num100+num10+num1;
		
		System.out.println("각 자리수의 합: " + result);
	}

}
