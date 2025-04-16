package chapter07.array;

public class C059_array4 {

	public static void main(String[] args) {
		int[]score = {88, 94, 72, 75, 23};
		
		//총점, 평균
		int total = 0;
		double result = 0;
		for (int i = 0; i < score.length; i++) {
			total += score[i];
			result = (double) total / score.length;
		}
		System.out.println("총점: " + total);
		System.out.println("평균: " + result);
	}

}
