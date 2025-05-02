package com.bank.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bank.vo.Account;
import com.bank.vo.Customer;

import chapter13.collection.User;

public class BankService {
	Scanner scan = new Scanner(System.in);
	// 고객 리스트
	List<Customer> customerList = new ArrayList<>();
	
	// 고객 등록
	public void makeCustomer2(String name, String ssn) {
		if(ssn.length()!=14 || ssn.charAt(6)!='-') {
			System.out.println("고객정보 등록 실패");
			return;
		} 
		
		for (Customer c : customerList) {
		    if (c.getSsn().equals(ssn)) {
		        System.out.println("고객정보 등록 실패");
		        return;
		    }
		}
		customerList.add(new Customer(name, ssn));
		System.out.println("고객정보 등록 성공");
	}
	
	
	// 고객 검색
	public void findCustomer2(String input) {
	for (Customer c : customerList) {
	    if (c.getSsn().equals(input)) {
	        System.out.printf("DSA_Bank-[고객명: %s, 주민등록번호: %s], 계좌= %s \n", c.getName(), c.getSsn(), c.getAccountList());
	        return;
	    }
	}
}
	// 계좌 등록
	public void createAccount2(String input) {
			for (Customer c : customerList) {
			    if (c.getSsn().equals(input)) {
			    	System.out.print("입금할 금액: ");
			    	int balance = scan.nextInt();
			    	Account acc = new Account();
			    	acc.setBalance(balance);
			    	c.getAccountList().add(acc);
			        System.out.println(acc.toString());
			        return;
			    }
		}
}		
	 //계좌 검색
	public void findAccount2(String input) {
		for (Customer c : customerList) {
		    if (c.getAccount().getAccNo().equals(input)) {
		        System.out.println(c.getAccount().toString());
		    }
	}
	}
	
	// 입금하기

		public void deposit2(String acc, int input) {
		for (Customer c : customerList) {
		    if (c.getAccount().getAccNo().equals(acc)) {
		    	if(input>=0) {
		    	System.out.print("입금 전 계좌정보: ");
		    	System.out.println(c.getAccount().toString());
		    	System.out.print("입금 후 계좌정보: ");
		    	c.getAccount().deposit(input);
		    	System.out.println(c.getAccount().toString());
		    } else if (input < 0){
		    	System.out.print("입금 전 계좌정보: ");
		    	System.out.println(c.getAccount().toString());
		    	System.out.println("금액은 0보다 작을 수 없습니다.");
		    	System.out.println(c.getAccount().toString());
		    }
		    }
		    	
		    }
		}
		    	
	// 출금하기
		public void withdraw2(String acc, int input) {
			for (Customer c : customerList) {
		    if (c.getAccount().getAccNo().equals(acc)) {
		    	if(input<=c.getAccount().getBalance()) {
		    	System.out.print("출금 전 계좌정보: ");
		    	System.out.println(c.getAccount().toString());
		    	System.out.print("출금 후 계좌정보: ");
		    	c.getAccount().withdraw(input);
		    	System.out.println(c.getAccount().toString());
		    } else if (input > c.getAccount().getBalance()){
		    	System.out.print("출금 전 계좌정보: ");
		    	System.out.println(c.getAccount().toString());
		    	System.out.println("잔고가 부족합니다.");
		    	System.out.println(c.getAccount().toString());
		    }
		   }
		}
	}
	
	// 이체하기
	public void transfer2(String drawacc, String incomeacc, int balance) {
		for (Customer c : customerList) {
			if (c.getAccount().getAccNo().equals(incomeacc)) {
		    	c.getAccount().deposit(balance);
		   }
		    if (c.getAccount().getAccNo().equals(drawacc)) {
		    	c.getAccount().withdraw(balance);
		    	System.out.println(c.getAccount().toString());
		   }
		    
		}
	}
	
	// 모든 고객 정보 반환
}

