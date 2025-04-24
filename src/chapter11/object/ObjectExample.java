package chapter11.object;

import java.util.Scanner;

public class ObjectExample {
/*
 	주민등혹번호 입력받기
 	1. - 을 포함한 14자리를 문자열로 입력받는다
 	2. 14자리가 아니거나 - 이 없다면 실행 종료
 	3. 입력받은 주민등록번호의 부분을 추출하여 출생연도, 출생 원, 출생 일, 성별을 출력한다.
 	4. 주민등록번호의 뒷자리 숫자가 1, 2일 경우 1900년대 생이고
 						 3, 4일 경우 2000년대 생
 	   주민등록번호의 뒷자리 숫자가 1, 3일경우 남자이고 2, 4일 경우 여자
 	   
 	출력결과
 		주민등록번호를 입력하세요 (예: 980101-1234567): 981010-1234567
 		출생 연도: 1998
 		출생 월: 10
 		출생 일: 10
 		성별: 남성
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하세요 (예: 980101-1234567): ");
		String str = sc.next();
		if(str.length()!=14) {
			System.exit(0);
		} else if(str.charAt(6)!='-') {
			System.exit(0);
		}
		if(str.charAt(7) == '1' || str.charAt(7) == '2') {
			System.out.println("출생연도: 19" + str.charAt(0) + str.charAt(1));
		}else if (str.charAt(7) == '3' || str.charAt(7) == '4') {
			System.out.println("출생연도: 20" + str.charAt(0) + str.charAt(1));
		}
		System.out.println("출생 월: " + str.charAt(2) + str.charAt(3));
		System.out.println("출생 일: " + str.charAt(4) + str.charAt(5));
		if(str.charAt(7) == '1' || str.charAt(7) == '3') {
			System.out.println("성별: 남성");
		}else if (str.charAt(7) == '2' || str.charAt(7) == '4') {
			System.out.println("성별: 여성");
		}
	}
}
