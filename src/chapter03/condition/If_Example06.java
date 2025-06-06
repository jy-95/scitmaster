package chapter03.condition;

import java.util.Scanner;

public class If_Example06 {

	public static void main(String[] args) {
/*
 	BMI 계산하기
 	BMI(체질량지수)는 몸무게를 키(미터단위)의 제곱으로 나누어서 계산한다.
 	이 계산 결과에 따라 다음과 같이 판단된다.
 	- 저체중: 18.5미만
 	- 정상: 18.5이상, 23미만
 	- 과체중: 23이상 25미만
 	- 비만: 25이상
 	
 	키(cm), 몸무게를 입력받아 BMI를 계산하시오.
 	출력결과
 		키: 180.8
 		몸무게: 80.5
 		BMI 지수: 24.123(과체중)
 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키: ");
		double height = sc.nextDouble();
		System.out.print("몸무게: ");
		double weight = sc.nextDouble();
		
		height = height/100;
		double bmi = weight / (height * height);
		// double bmi = weight / Math.pow(height, 2);
		
		String result = "";
		
		if (bmi<18.5) {
			result = "저체중";
		} else if (bmi<23) {
			result = "정상";
		} else if (bmi<25) {
			result = "과체중";
		} else {
			result = "비만";
		}
		
		System.out.println("BMI 지수: " + bmi + "(" + result + ")");
	}

}
