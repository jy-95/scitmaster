package com.bank.vo;

import java.util.*;

// 고객정보
public class Customer {
	// 멤버 변수
		// 이름
		private String name;
		// 주민번호
		private String ssn;
		// 계좌 리스트
		private List<Account> accountList = new ArrayList<Account>();
	
	// 생성자
	public Customer(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		this.accountList = new ArrayList<Account>();
	}

	// getter & setter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public List<Account> getAccountList() {
		return accountList;
	}
	
	public Account getAccount() {
		return accountList.get(0);
	}

	// toString()
	// 출력 형식 : DSA_Bank-[고객명: xxxx, 주민등록번호: xxxxxx], 계좌= xxxxxx
	@Override
	public String toString() {
		return String.format("DSA_Bank-[고객명: %s, 주민등록번호: %s], 계좌= %s", name, ssn, this.accountList);
	}
}
