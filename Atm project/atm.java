import java.util.*;
class  atm
{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int pin=1234;
		int balance=10000;
		
		int AddAmount =0;
		int TakeAmount =0;
		
		String name;
		
		System.out.print("Enter your pin number: ");
		int password=sc.nextInt();
		
		if(password==pin)
		{
			System.out.print("Enter your name: ");
			 name=sc.next();
			 System.out.println("welcome " +name);			
		while(true)
		{
			System.out.println("press 1 to check your balance");
			System.out.println("press 2 to deposit your amount");
			System.out.println("press 3 to withdraw your amount");
			System.out.println("press 4 to  view Mini Statement");
			System.out.println("press 5 to Exit");
			
			int opt=sc.nextInt();
			
			switch(opt)
			{
				case 1:
					System.out.println("your current balance is: "+balance);
				break;
				 case 2:
					 System.out.println("How  much amount did you want to deposit in your account... ");
					 AddAmount=sc.nextInt();
				 System.out.println("<--Successfully depited-->");
				 balance =AddAmount +balance;
				 break;
					 

				 case 3:
					 System.out.println("How much amount did you want to withdraw in your account...");
				 TakeAmount=sc.nextInt();
				 if(TakeAmount>balance)
					 
				{
					System.out.println("your balance is insufficient...");
					System.out.println("try less than your available balance...");
					
				}
				else
				{
				 System.out.println("<--Successfully taken-->");
				 balance=balance-TakeAmount;
				 
				 }
				 break;
			
				 case 4:
					 System.out.println("Welcome to SBI Atm machine...)");
				 System.out.println("Available balance is "+ balance);
				 System.out.println("Amount deposited "+AddAmount);
				 System.out.println("Amount taken "+TakeAmount);
				 System.out.println("Thank you for visiting..)");
				 break;
				 
			}
		
			if(opt==5)
			{
				System.out.println("Thank you");
				break;
			
			}
			
		}
		}
		else
			{
				System.out.println("wrong pin number...");
			}
				
			
	
		}
}


