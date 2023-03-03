package Lab_2nd_March;
//Ques. 2

public class Customer {
	// instance variables
	private long accountNumber;
	private String accountName;
	private float accountBalance;
	
	// creating getter setter method
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public float getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(float accountBalance) {
		this.accountBalance = accountBalance;
	}
	// creating method to withdraw amount
	void withDrawAmount() {
		long amount=9800;
		System.out.println("Balance after wtithdrawing money: Rs."+(accountBalance-amount));
	}
		
}
