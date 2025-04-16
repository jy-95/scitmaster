package chapter02.operator;

import java.util.Scanner;

public class Oper_Example02 {

	public static void main(String[] args) {
		/*
		 과목 3개를 입력받아 점수에 따른 합격여부를 출력한다.
		 합격조건 : 1) 세 과목의 평균점수가 60점 이상일 것.
		 		 2) 한 과목이라도 40점 미만일 경우 과락으로 불합격
		 출력결과 : 
		 		국어: 80
		 		영어: 80
		 		수학: 35
		 		합격여부: false
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어: ");
		int kor = sc.nextInt();	
		System.out.print("영어: ");
		int eng = sc.nextInt();
		System.out.print("수학: ");
		int math = sc.nextInt();

		double avg = (kor+eng+math)/3.0;
		
		boolean result;
		result = avg >=60 
				 && kor>=40 
				 && eng>=40 
				 && math>=40;
				 
		System.out.println("합격여부: " + result);

		
				
	}

}
