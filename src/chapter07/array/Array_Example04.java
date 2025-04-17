package chapter07.array;

public class Array_Example04 {
	
	public static void main(String[] args) {
	/*
	 	임의의 배열 array를 역순으로 출력하시오.
	 	출력 결과:
	 		원래 배열 -> 브레드 윌크 초코 소세지 치즈
	 		역순 배열 -> 치즈 소세지 초코 윌크 브레드
	 */
		
		String arr[] = {"브레드", "윌크", "초코", "소세지", "치즈"};
		
		// 1) 출력을 역순으로
		System.out.print("원래 배열 -> ");
		for (String string : arr) {
			System.out.print(string + " ");
		}
		System.out.print("\n역순 배열 -> ");
		for (int i = arr.length-1; i >=0 ; i--) {
			System.out.print(arr[i] + " ");
		}
		
		// 2) 배열 자체를 역순
		for (int left = 0, right = arr.length-1;	//;이 오기 전까지 변수 몇 개가 와도 무방
				left < right; left++, right--) {
			String temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
		}
		System.out.print("\n배열 자체 역순 ->");
		for (String s : arr) {
			System.out.print(s + " ");
		}
	}
}
