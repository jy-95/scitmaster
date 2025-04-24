package chapter11.object;

import java.util.Scanner;

public class ObjectExample_teacher {
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
		// 주민등록번호 입력 받기
		Scanner scan = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하세요 (예: 980101-1234567): ");
		String ssn = scan.nextLine();	//nextLine은 공백까지 포함한다.
		
		// 주민등록번호 체크
		if(ssn.length()!=14 || ssn.charAt(6)!='-') {
			System.out.println("잘못된 형식의 주민등록번호입니다.");
			return;
		} 
		
		// 생년월일 추출
		String birthYear = ssn.substring(0, 2);
		String birthMonth = ssn.substring(2, 4);
		String birthDay = ssn.substring(4, 6);
		
		// 성별코드 추출
		char genderCode = ssn.charAt(7);
		String gender = "";
		
		// 출생 연도 및 성별 결정
		switch (genderCode) {
			case '1': case '2':
				birthYear = "19" + birthYear;
				gender = (genderCode == '1') ? "남성" : "여성";
				break;
			case '3': case '4':
				birthYear = "20" + birthYear;
				gender = (genderCode == '3') ? "남성" : "여성";
				break;
		default:
			System.out.println("잘못된 주민등록번호입니다.");
			break;
		}
		
		// 출력
		System.out.printf("""
				출생 연도: %s
				출생 월: %s
				출생 일: %s
				성별: %s
				""", birthYear, birthMonth, birthDay, gender);
	}
}
