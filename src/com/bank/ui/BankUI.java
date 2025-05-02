package com.bank.ui;

import java.util.Scanner;

import com.bank.service.BankService;
import com.bank.vo.Account;
import com.bank.vo.Customer;

public class BankUI {

	private BankService manager;
	private Scanner scanner;
	
	public BankUI() {
		manager = new BankService();
		scanner = new Scanner(System.in);
		
		while (true) {
			mainMenu();
			int input = scanner.nextInt();
			
			switch (input) {
				case 1: customerMenu(); break;
				case 2: accountMenu(); break;
				case 3: deposit(); break;
				case 4: withdraw(); break;
				case 5: transfer(); break;
				case 6: 
					System.out.println("프로그램을 종료 합니다.");
					System.exit(0);
				default: System.out.println("잘못 입력 했습니다.");
			}
		}
	}
	
	// 메인메뉴
	public void mainMenu() {
		System.out.println("[ DSA_Bank ]");
		System.out.println("1. 고객관리");
		System.out.println("2. 계좌관리");
		System.out.println("3. 입금하기");
		System.out.println("4. 출금하기");
		System.out.println("5. 이체하기");
		System.out.println("6. 프로그램 종료");
		System.out.print("선택 > ");
	}
	
	// 고객관리
	public void customerMenu() {
		while (true) {
			System.out.println("[ 고객관리 ]");
			System.out.println("1. 고객등록");
			System.out.println("2. 고객검색");
			System.out.println("3. 상위 매뉴로");
			System.out.print("선택 > ");
			
			// 번호를 입력받아 번호에 따른 기능 수행
			int input = scanner.nextInt();
			switch(input) {
				case 1: makeCustomer();
				break;
				case 2: findCustomer();
				break;
				case 3:
					return;
			}
		}
	}
	
	// 계좌관리
	public void accountMenu() {
		while (true) {
			System.out.println("[ 계좌관리 ]");
			System.out.println("1. 계좌생성");
			System.out.println("2. 계좌검색");
			System.out.println("3. 상위 매뉴로");
			System.out.print("선택 > ");
			
			// 번호를 입력받아 번호에 따른 기능 수행
			int input = scanner.nextInt();
			switch(input) {
				case 1: makeAccount();
				break;
				
				case 2: findAccount();
				break;
				
				case 3:
					return;
			}
		}
	}

	// 고객등록
	public void makeCustomer() {
		System.out.println("[ 고객등록 ]");
		System.out.print("이름 : ");
		String name = scanner.next();
		System.out.print("주민번호 : ");
		String ssn = scanner.next();
		manager.makeCustomer2(name, ssn);
		// 고객 정보 등록
		
	}
	
	// 고객검색
	public void findCustomer() {
		System.out.print("검색할 고객의 주민번호 : ");
		String input = scanner.next();
		manager.findCustomer2(input);
		// 주민번호를 입력받아 고객 정보 조회
		
	}
	// 계좌생성
	public void makeAccount() {
		System.out.print("계좌를 생성할 고객의 주민번호 : ");
		String input = scanner.next();
		manager.createAccount2(input);
		// 주민번호를 입력받아 계좌 생성 및 초기 입금액 입력
		
	}
	
	// 계좌검색
	public void findAccount() {
		System.out.print("검색할 계좌번호 : ");
		String input = scanner.next();
		manager.findAccount2(input);
		// 계좌번호를 입력받아 계좌 조회
		
	}
	
	// 입금하기
	public void deposit() {
		System.out.print("입금할 계좌번호 : ");
		String acc = scanner.next();
		System.out.print("입금할 금액 : ");
		int input = scanner.nextInt();
		manager.deposit2(acc, input);
		// 입금할 계좌번호와 금액을 입력받아 입금 전, 후 금액을 출력하고 입금처리
		
	}
	
	// 출금하기
	public void withdraw() {
		System.out.print("출금할 계좌번호 : ");
		String acc = scanner.next();
		System.out.print("출금할 금액 : ");
		int input = scanner.nextInt();
		manager.withdraw2(acc, input);
		// 출금할 계좌번호와 금액을 입력받아 출금 전, 후 금액을 출력하고 출금처리
		
	}
	
	// 이체하기
	public void transfer() {
		System.out.print("출금할 계좌번호 : ");
		String drawacc = scanner.next();
		System.out.print("이체할 계좌번호 : ");
		String incomeacc = scanner.next();
		System.out.print("이체할 금액 : ");
		int balance = scanner.nextInt();
		manager.transfer2(drawacc, incomeacc, balance);
		
		// 출금, 이체할 계좌번호 및 금액을 입력받아 이체처리
		
		// 이체 후 출금계좌의 금액 출력
	}
}
