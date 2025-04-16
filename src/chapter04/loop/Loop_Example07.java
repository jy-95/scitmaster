package chapter04.loop;

public class Loop_Example07 {

	public static void main(String[] args) {
/*
 		3번			4번
 		    *		*****
 		   **		 ****
 		  ***		  ***
 		 ****		   **
 		***** 		    *
 */
		//3-1번
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5-i; j++ ) {
				System.out.print(" ");
				}
			for (int k = 1; k <= i; k++) {
			System.out.print("*");
			}
			System.out.println();
			}
			
			//3-2번
			for(int i = 4; i >= 0; i--) {
				for(int j = 0; j < 5; j++) {
					if (j < i)
						System.out.print(" ");
					else 
						System.out.print("*");
				}
				System.out.println();
			}
			
			//3-3번
			for(int i = 1; i <= 5; i++) {
				System.out.print(" ".repeat(5-i));
				System.out.println("*".repeat(i));
			}
			
			//3-4번
			for (int i = 1; i <= 5; i++) {
				System.out.printf("%5s%n", "*".repeat(i));
				//"*".repeat(i)로 *을 입력하되, %s는 그걸 문자열로 넣어라
				//%5는 5개 자리를 만들어라. %n은 개행하라.
				//즉 5개 자리의 문자열 안에 i만큼의 별을 넣고 개행하라.
			}
			System.out.println("=============");
			//4-1번
			for (int i = 5; i >= 1; i--) {
				for (int j = 1; j <= 5-i; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <=i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			//4-2번
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (j < i)
						System.out.println(" ");
					else
						System.out.println("*");
				}
				System.out.println();
			}
			
			//4-3번
			for (int i = 5; i >= 1; i--) {
				System.out.print(" ".repeat(5-i));
				System.out.println("*".repeat(i));
			}
			
			//4-4번
			for (int i = 5; i >= i; i--) {
				System.out.printf("%5s%n", "*".repeat(i));
			}
			
			
			
			
			
		}
		
		
	}


