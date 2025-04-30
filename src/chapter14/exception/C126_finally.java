package chapter14.exception;

import java.util.Scanner;

public class C126_finally {

	public static void main(String[] args) {
		System.out.println("접속");
		try {
			System.out.println("전송");
			throw new Exception();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("예외처리");
		} finally {
			System.out.println("해제");
		}
		
		//2
		Scanner scan = null;
		try {
			scan = new Scanner(System.in);
			System.out.println("입력: ");
			int num = scan.nextInt();
			System.out.println(num);
		} catch (Exception e) {
			System.out.println("예외처리");
		}finally {
			if (scan != null) {
				scan.close();
			}
		}
		
		//3
		// AutoCloseable - 리소스를 사용하는 객체들이 더 이상 필요하지 않을 때
		//					자동으로 자원을 해제해 줌.
		//					자동으로 할당 해제하는 close() 호출
		// AutoCloseable을 구현하지 않은 클래스에 넣으면 컴파일 에러 발생
		// try-with-resource
		try(Scanner scan2 = new Scanner(System.in)){
			System.out.println("입력: ");
			int num = scan2.nextInt();
			System.out.println(num);
		}catch(Exception e) {
			System.out.println("예외처리");
		}finally {
			System.out.println("예외 발생하든 안하든 실행");
		}
		
		
		
	}

}
