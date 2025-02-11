package org.joonzis.ex;

//DepositException
//WithdrawException


class BankAccount{
	private String no;			//계좌번호
	private long balance;	//계좌잔액
	
	public BankAccount(String no, long balance) {
		this.no = no;
		this.balance = balance;
	}
	
	//입금
	public void deposit(long money) throws DepositException {
		if(money <= 0) {
			throw new DepositException("0보다 작으면 입금 불가", 1000);
		}
		balance += money;
		
	}
	
	//출급
	public void withdraw(long money) throws WithdrawException {
		if(balance < money) {
			throw new WithdrawException("잔액이 부족합니다", 2000);
		}
		
		if(money <= 0) {
			throw new WithdrawException("0원 이상 출금 가능", 2000);
		}
		balance -= money;
	}
	
	//이체
	public void transfer(BankAccount account, long money) throws TransferException, DepositException, WithdrawException {
		if(balance < money) {
			throw new TransferException("이체할 잔액이 부족합니다", 2001);
		}
		
		withdraw(money);
		account.deposit(money);
		//account.balance += money;
	}
	
	//조회
	public void inquire() {
		System.out.println("계좌 번호 : " + no);
		System.out.println("계좌 잔액 : " + balance);
	}
}

class DepositException extends Exception{
	private static final long serialVersionUID = 1L;
	private int errCode;
	public DepositException(String msg, int errCode) {
		super(msg);
		this.errCode = errCode;
	}

	public int getErrCode() {
		return errCode;
	}
	
}

class WithdrawException extends Exception{
	private static final long serialVersionUID = 1L;
	private int errCode;
	public WithdrawException(String msg, int errCode) {
		super(msg);
		this.errCode = errCode;
	}

	public int getErrCode() {
		return errCode;
	}
	
}

class TransferException extends Exception{
	private static final long serialVersionUID = 1L;
	private int errCode;
	public TransferException(String msg, int errCode) {
		super(msg);
		this.errCode = errCode;
	}
	
	public int getErrCode() {
		return errCode;
	}
	
}

public class Ex08_exception {

	public static void main(String[] args) {
		
		BankAccount parent = new BankAccount("123-456", 0);
		BankAccount child = new BankAccount("789-012", 0);
		
		
		try {
			//1.부모 계좌에 10000원 입금
			parent.deposit(10000);
			parent.inquire();
			
			System.out.println("-------------------");
			
			//2.부모 계좌에서 5000원 출금
			parent.withdraw(5000);
			parent.inquire();

			System.out.println("-------------------");
			
			//3.부모 계좌에서 자식 계좌로 3000원 이체
			parent.transfer(child, 5000);
			child.inquire();
			parent.inquire();
			
			
		} catch (DepositException e) {
			System.out.println("에러 메세지 : " + e.getMessage() + ", 에러 코드 : " + e.getErrCode());
		} catch (WithdrawException e) {
			System.out.println("에러 메세지 : " + e.getMessage() + ", 에러 코드 : " + e.getErrCode());
		} catch (TransferException e) {
			System.out.println("에러 메세지 : " + e.getMessage() + ", 에러 코드 : " + e.getErrCode());			
		}

	}

}
