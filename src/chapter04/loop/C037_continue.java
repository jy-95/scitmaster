package chapter04.loop;

public class C037_continue {

	public static void main(String[] args) {
		// continue
		for (int i = 1; i <= 10; i++) {
			if (i == 7)
				continue;
			System.out.println("반복회차: " + i);
		}

		// 1 ~ 100 짝수의 합 구하기
		// for
		int sum = 0;
		for (int i = 0; i <= 100; i += 2) {
			sum = sum + i;
		}
		System.out.println(sum);

		// while
		int j = 0;
		int sum1 = 0;

		while (j <= 100) {
			j++;
			if (j % 2 != 0)
				continue;
			sum1 = sum1 + j;
		}
		System.out.println(sum1);

		// while2

		int num = 0;
		int sum3 = 0;
		while (num <= 100) {
			if (num % 2 == 0)
				sum3 = sum3 + num;
			num++;
		}
		System.out.println(sum3);

		// do-while
		int k = 0;
		int sum2 = 0;
		do {
			sum2 = sum2 + k;
			k += 2;
		} while (k <= 100);
		System.out.println(sum2);

	}

}
