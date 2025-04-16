package chapter00.basic;

import java.util.Scanner;

public class Basic_Example02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name = "";
		System.out.print("이름 : ");
		name = scan.next();
		
		int age = 0;
		System.out.print("나이 : ");
		age = scan.nextInt();
		
		double height = 0;
		System.out.print("키 : ");
		height = scan.nextDouble();
		
		System.out.println("이름은 " + name + 
				"이고 나이는 " + age + "세, 키는 " 
				+ height + "Cm입니다.");
	}

}
