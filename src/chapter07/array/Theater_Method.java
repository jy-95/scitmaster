package chapter07.array;

import java.util.Scanner;

public class Theater_Method {
	
	//멤버 변수
	private int[][] seats = new int[7][7];
	private final Scanner scan = new Scanner(System.in);

	
	//멤버 메서드
	public void printMenu() {
		// code
		System.out.println("◆극장 좌석 예약 프로그램◆");
		System.out.println("메뉴의 번호를 선택해 주세요.");
		System.out.println("===================");
		System.out.println("1. 좌석 확인");
		System.out.println("2. 좌석 예약");
		System.out.println("3. 종   료");
		System.out.println("===================");
		System.out.println("번호를 선택하세요: ");
	}
	
	public int inputCnt(int cnt) {
		int result = 0;

		if (cnt == 2) {
		System.out.println("몇개의 좌석을 예약하시겠습니까? :");
		result = scan.nextInt();
		return result; 
		} else if (cnt == 3) {
			System.out.println("프로그램을 종료합니다.");
			return result;
		} else {
			return result;
		}
	}
	
	public void seatInfo() {
		// code
		
		System.out.println("※좌석 예약 정보");
		System.out.println("---------------------");
		System.out.println("  1 2 3 4 5 6 7   ");
		System.out.println("---------------------");
		
		for (int i = 0; i < seats.length; i++) {
			System.out.print((i+1) + "|");
			for (int j = 0; j < seats[i].length; j++) {
				System.out.print(seats[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
	public void reservationSeats(int cnt) {
		// code
		int line = 1;
		int row=1;
		
			for (int i = 0; i < cnt; i++) {	
			System.out.print("예약할 좌석의 행: ");
			line = scan.nextInt();
			System.out.print("예약할 좌석의 열: ");
			row = scan.nextInt();
			
			if(seats[line-1][row-1]==0) {
				seats[line-1][row-1] = 1;
				System.out.println("예약 되었습니다.");
			}else {
				System.out.println(line + "행" + row + "열은 이미 예약된 좌석입니다.");
				i--;
				continue;
			}
			
			}
		}
	
	}	
		


