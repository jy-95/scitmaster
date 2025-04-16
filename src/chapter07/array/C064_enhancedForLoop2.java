package chapter07.array;

public class C064_enhancedForLoop2 {

	public static void main(String[] args) {
		int[][]score = {
				{77, 56, 70, 82},
				{87, 23, 14, 23},
				{44, 24, 75, 89}
		};
		for (int[] student : score) {	// 가로로 한 줄씩 배열을 뽑아옴
			for (int subject : student) {	//뽑아온 배열의 값 중 정수를 하나씩 반복
				System.out.println(subject + " ");
			}
			System.out.println();
		}
	}

}
