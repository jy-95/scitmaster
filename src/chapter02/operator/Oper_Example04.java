package chapter02.operator;

import java.util.Scanner;

public class Oper_Example04 {

	public static void main(String[] args) {
		/*
		 정수 3개를 입력받아 각 변수(kor, eng, math)에 값을 넣고, 총합(sum)
		 과 평균(avg)을 출력하세요.
		 평균값을 소수점을 포함한 점수로 출력하세요.
		 hint. 평균에 소수점 구하기 -> 연산 중에 자동 형변환 참고.
		 출력결과 :
		 		kor점수: 80
		 		eng점수: 75
		 		math점수: 35
		 		총합 : 190 평균: 63.33333333336%
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("kor 점수: ");
		int kor = sc.nextInt();
		System.out.print("eng 점수: ");
		int eng = sc.nextInt();
		System.out.print("math 점수: ");
		int math = sc.nextInt();
		
		int sum = (kor+eng+math);
		double avg = sum /3.0;
		
		System.out.print("총합: " + sum);
		System.out.println(" 평균: " + avg);
	}

}
