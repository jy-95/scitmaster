package chapter07.array;

import java.util.Scanner;

public class Array_Example05 {

	public static void main(String[] args) {
		/*
		 로또 생성 보너스 번호를 제외한 6개의 난수를 생성하는 코드 작성하기 
		  1. 입력받은 개수만큼의 게임 생성 
		  2. 1게임마다 생성되는 6개의 숫자는 1~45 범위의 랜덤한 정수 
		  3. 중복되는 숫자 X (2개의 값을 비교하는 방법 사용..?) 
		  4. 작은 수 부터 출력되도록 정렬
		  5. 문자열 format 출력
		  
		  출력결과 
		  받을 로또 게임의 개수를 입력해주세요: 5 
		  ========================== 
		  [1]번 : 5 14 25 27 42 44 
		  [2]번 : 9 15 16 17 24 27 
		  [3]번 : 5 17 29 32 40 41 
		  [4]번 : 1 7 9 20 34 44 
		  [5]번 : 1 7 22 26 35 38
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("받을 로또 게임의 개수를 입력해주세요: ");
		int num = sc.nextInt();
		int cnt = 1;

		while (cnt <= num) {
			int[] lotto = new int[6];

			// 난수 6개 배열에 저장
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = (int) (Math.random() * 45 + 1);

				// 중복 제거
				for (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}
			// 정렬
			for (int i = 0; i < lotto.length; i++) {
				for (int j = i + 1; j < lotto.length; j++) {
					if (lotto[i] > lotto[j]) {
						int temp = lotto[j];
						lotto[j] = lotto[i];
						lotto[i] = temp;
			
			//버블 정렬
			for (int i1 = 0; i1 < lotto.length-1; i1++) {
				for (int j1 = 0; j1 < lotto.length-1 -i1; j1++) {
					if(lotto[j1]>lotto[j1+1]) {
						int temp1 = lotto[j1];
						lotto[j1] = lotto[j1+1];
						lotto[j1+1] = temp1;
				}
			}
					}
				}
			}
			// 출력
			System.out.printf(" *[%2d]번: ", cnt);
			for (int i1 = 0; i1 < lotto.length; i1++) {
				System.out.printf("%2d ", lotto[i1]);
			}
			System.out.println();
			cnt++;
		}

	}

}
	
}
