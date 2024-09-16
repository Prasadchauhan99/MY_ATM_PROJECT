package atm.com.in;

public class ATM_MACHINE {
	
	private double balance;
	private double depositAmount;
	private double withdrawAmount;
	
	//defalut cunstructor
	public ATM_MACHINE()
	{
		
	}
	
	//getters & setters
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
	public double getWithdrawAmount() {
		return withdrawAmount;
	}
	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
	@Override
	public String toString() {
		return "ATM_MACHINE [balance=" + balance + ", depositAmount=" + depositAmount + ", withdrawAmount="
				+ withdrawAmount + "]";
	}
	public ATM_MACHINE(double balance, double depositAmount, double withdrawAmount) {
		super();
		this.balance = balance;
		this.depositAmount = depositAmount;
		this.withdrawAmount = withdrawAmount;
	}
	
	
	
	
	

}
