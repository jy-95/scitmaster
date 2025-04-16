package chapter07.array;

import java.util.Scanner;

public class Array_Example01 {

	public static void main(String[] args) {
/*
 		Original : 10 20 30 40 50 60 70 80 90 100
 		변경하고 싶은 위치1을 입력하세요
 		1
 		변경하고 싶은 위치2를 입력하세요
 		10
 		new : 100 20 30 40 50 60 70 80 90
 */
		Scanner sc = new Scanner(System.in);
		
		int [] dim = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		System.out.print("Original: ");
		for (int i = 0; i < dim.length; i++) {
			System.out.print(dim[i] + " ");
		}
		System.out.println();
		
		System.out.println("변경하고 싶은 위치 1을 입력하세요");
		int before = sc.nextInt();
		System.out.println("변경하고 싶은 위치 2를 입력하세요");
		int after = sc.nextInt();
		
//		int a = dim [before - 1];
//		int b = dim [after - 1];
//		int c = 0;
//		
//		dim[before-1] = c;
//		dim[after-1] = a;
//		dim[before-1] = b;
		
		int temp = dim[before-1];
		dim[before - 1] = dim[after - 1];
		dim[after - 1] = temp;
		
		System.out.print("New: ");
		for (int i = 0; i < dim.length; i++) {
			System.out.print(dim[i] + " ");
		}
		
		
	}

}
