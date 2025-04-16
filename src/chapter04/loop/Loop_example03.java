package chapter04.loop;

import java.util.Scanner;

public class Loop_example03 {

	public static void main(String[] args) {
/*
 		합 구하기
 		2개의 정수를 입력받아 입력받은 정수를 포함한 사이값들의 총합을 구하시오
 		단, 입력 순서에 상관없이 합을 구할 것.
 		출력 결과:
 			숫자 입력: 5			숫자 입력: 10
 			숫자 입력: 10			숫자 입력: 5
 			숫자 입력: 45			숫자 입력: 45
 			
 */
		Scanner sc = new Scanner(System.in);
		int start;
		int end;
		int num=0;
		
		System.out.print("숫자 입력: ");
		start= sc.nextInt();
		System.out.print("숫자 입력: ");
		end= sc.nextInt();
		
		int temp;
		if (start>end) {
			temp = start;
			start = end;
			end = temp;
		}
		
		for (int i = start; i <= end; i++) {
			num = num+i;}
		
		System.out.println(num);
		
//		if(start<end) {
//			for (int i = start; i <= end; i++) {
//				num = num+i;
//			}
//		}else {
//			for (int i = end; i <= start; i++) {
//				num = num+i;
//			}
//		}
//		System.out.println(num);
//	
	
	}

}
