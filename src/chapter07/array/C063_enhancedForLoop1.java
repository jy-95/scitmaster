package chapter07.array;

public class C063_enhancedForLoop1 {

	public static void main(String[] args) {
		// enhanced(강화된) for문 & for-each문(처음부터 끝까지 스킵 없이 돈다)
		int[] score = {88, 94, 72, 75, 23};
		int sum = 0;
		for (int i : score) {	//for ( 요소 하나하나를 저장할 수 있는 변수 : 순회가능한 대상. 보통 배열 혹은 컬렉션이 옴)
			sum += i;
		} 
		System.out.println("총점: " + sum);
		System.out.println("평균: " + (float)sum / score.length);
		
		// for-each문은 읽기 전용 반복문
		//요소 s는 배열요소의 사본일 뿐 원본에 영향을 주지 않는다.
		int[] score2 = {88, 94, 72, 75, 23};
		for (int s : score2) {
			s++;			//s값이 커져도 배열 안 원본은 바뀌지 않는다.
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("score2 [0] = " + score2[0]);
	}

}
