package chapter02.operator;

import java.util.Scanner;

public class Oper_Example01 {

	public static void main(String[] args) {
		/* 
		 상품가격과 받은 금액을 입력받아서 거스름돈을 출력
		 출력결과 : 
		 	받은 금액 : 10000
		 	상품가격 : 1500
		 	거스름돈 : 8500
		 */
		
		Scanner sc = new Scanner(System.in);
		int product;
		int income;
		int change = 0;
		
		System.out.print("받은 금액 : ");
		income = sc.nextInt();
		
		System.out.print("상품 가격 : ");
		product = sc.nextInt();
		
		change = income - product;
		
		System.out.print("거스름돈 : " + change );
				
				

	}

}
