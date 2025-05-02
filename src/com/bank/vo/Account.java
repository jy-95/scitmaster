package com.bank.vo;

// 계좌정보
public class Account {
	// 멤버 변수
		// 은행명
		static final private String BANK_CODE = "DSA_Bank"; 
		// 계좌고유번호
		static private int ACCOUNT_NUM = 1000;
		// 계좌번호
		private String accNo; 
		// 잔고정보
		private int balance;
	
	// 생성자
		public Account() {
			accNo = BANK_CODE + ACCOUNT_NUM;
			ACCOUNT_NUM++;
		};
		

	// getter, setter
		public int getBalance() {
			return balance;
		}


		public void setBalance(int balance) {
			this.balance = balance;
		}


		public String getAccNo() {
			return accNo;
		}

	// 입금하기
	public void deposit(long amount) {
		balance += amount;
	}
	
	// 출금하기
	public void withdraw(long amount) {
		balance -= amount;
	}
	
	// 이체하기
	public void transfer(Account toAccount, long amount) {
		toAccount.balance += amount;
	}

	// toString
	// 출력 형식: (계좌번호: xxxxxx, 잔고: xxxxxx)
	@Override
	public String toString() {
		return String.format("계좌번호: %s, 잔고: %d", accNo, balance);
	}
}
