package atm.com.in;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		AtmOperationsInterface op = new AtmOprationImpl();
		
		System.out.println("WELCOME TO ATM MACHINE!!!!");
		System.out.println("give a click any button OK OR ENTER");
		
		
		int atmnumber=12345;
		int atmpin=123;
		
		Scanner in = new Scanner(System.in);
		String a=in.nextLine();
		
		System.out.print("Please Enter your ATM number:"+"  ");
		int atmNumber=in.nextInt();
		System.out.println("Please Enter your ATM PIN number:"+"  ");
		int pin=in.nextInt();
		
		
		if((atmnumber == atmNumber) && (atmpin==pin))
		{
			while(true)
			{
				System.out.print("1.View Available Balance\n 2.withdraw amount \n 3.deposit amount \n 4.View MiniStatement \n 5.EXIT \n");
				System.out.println("  ");
				System.out.println("Penter your choice mentioned above:"+" ");
				int ch=in.nextInt();
				if(ch==1)
				{
					op.viewBalance();
					
				}
				else if(ch==2)
				{
					System.out.println("Enter amount to withdraw");
					double withDrawAmount=in.nextDouble();
					op.withdrawAmount(withDrawAmount);
				}
				else if(ch==3)
				{
					System.out.println("Please enter amount to deposit");
					double dipositAmount=in.nextDouble();
					op.depositAmount(dipositAmount);
					
				}
				else if(ch==4)
				{
					op.viewMiniStatement();
					
				}
				else if(ch==5)
				{
					System.out.println("Collect your ATM CARD \n THANK YOU FOR USING ATM MACHINE");
					System.exit(ch);
				}
			
				else
				{
					System.out.println("please enter correct choice");
				}
				
			
		}
	
			
			
			
		}
		else
		{
			System.out.println("Eneter correct atmnumber OR atmpin");
			
		}
		
		

	}

}
