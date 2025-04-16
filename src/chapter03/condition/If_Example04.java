package chapter03.condition;

import java.util.Scanner;

public class If_Example04 {

	public static void main(String[] args) {
		/*
		 등급 나누기
		 점수(0~100 사이의 정수)를 입력받아 등급을 출력한다.
		 등급은 수, 우, 미, 양, 가 로 구분한다.
		 단, 0~100 이외의 숫자를 입력시 "잘못 입력했습니다." 라는 문구를 출력하고
		 프로그램을 종료한다.
		 	system.exit(0); //프로그램을 종료시키는 메서드
		 출력 결과 :
		 	점수 입력: 87
		 	우
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력: ");
		int input = sc.nextInt();
		char result = '수';
		
		if (input>100 || input<0) {
			System.out.println("잘못 입력했습니다.");
			System.exit(0);
		} else if (input>=90) {
		
		} else if (input>=80) {
			result = '우';
		} else if (input >=70) {
			result = '미';
		} else if (input >=60) {
			result = '양';
		} else {
			result = '가';
		}
		
		System.out.println(result);
	}

}
