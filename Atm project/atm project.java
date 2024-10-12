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
		
		System.out.println("Enter your pin number: ");
		int password=sc.nextInt();
		
		if(password==pin)
		{
			System.out.println("Enter your name");
			 name=sc.nextLine();
			 System.out.println("welcome" +name);
		}
	
	}
}
