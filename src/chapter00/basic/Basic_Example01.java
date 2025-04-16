package chapter00.basic;

import java.util.Scanner;

public class Basic_Example01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		System.out.println("정수를 입력해 주세요: ");
		num = scan.nextInt();
		System.out.println("입력한 정수: " + num);
		
		double a = 0;
		System.out.println("실수를 입력해 주세요: ");
		a = scan.nextDouble();
		System.out.println("입력한 실수: " + a);
		
		String text = "";
		System.out.println("문자열을 입력해 주세요: ");
		text = scan.next();
		System.out.println("입력한 문자열: " + text);
	}

}
