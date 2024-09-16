package atm.com.in;

import java.util.HashMap;
import java.util.Map;

public class AtmOprationImpl implements AtmOperationsInterface

{
	Map<Double,String> miniStatement = new HashMap<>();
	
	ATM_MACHINE atm = new ATM_MACHINE();

	@Override
	public void viewBalance() {
		
		System.out.println("   ");
	
		System.out.println("View balance"+atm.getBalance());
		
		System.out.println("   ");
	}

	@Override
	public void depositAmount(double depositAmount) {
		miniStatement.put(depositAmount, "Amount Deposited");
		System.out.println(depositAmount+"Deposited amount successfully!!");
		atm.setBalance(atm.getBalance()+depositAmount);
		viewBalance();
		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		
		if(withdrawAmount%500==0) {
		if(withdrawAmount<=atm.getBalance())
		{
			miniStatement.put(withdrawAmount, "Amount withdrawn");
		System.out.println("Collect your amount"+withdrawAmount);
		atm.setBalance(atm.getBalance()-withdrawAmount);
		viewBalance();
		}
		else
		{
			System.out.println("In-Sufficient Balance");
		}
		}
		else
		{
			System.out.println("Please Enter only multiple of 500");
		}
	}

	@Override
	public void viewMiniStatement() {
		
		for(Map.Entry<Double, String> m:miniStatement.entrySet())
		{
			System.out.println(m.getKey()+""+m.getValue());
		}
		
	}
	

}
