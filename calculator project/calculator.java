import java.util.Scanner;
class prog1 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("choose the choice \n1.addition\n2.subtraction\n3.multiplication\n4.division");
		int choice=sc.nextInt();
	switch (choice)
	{
	case 1:
		{
		System.out.println("enter the first number:");
		int a=sc.nextInt();
		System.out.println("enter the second number:");
		int b=sc.nextInt();
		int res=a+b;
		System.out.println("result is:"+res);
		}
		break;
		case 2:
		{
		System.out.println("enter the first number:");
		int a=sc.nextInt();
		System.out.println("enter the second number:");
		int b=sc.nextInt();
		int res=a-b;
		System.out.println("result is:"+res);
		}
		break;
		case 3:
		{
		System.out.println("enter the first number:");
		int a=sc.nextInt();
		System.out.println("enter the second number:");
		int b=sc.nextInt();
		int res=a*b;
		System.out.println("result is:"+res);
		}
		break;
		case 4:
		{
		System.out.println("enter the first number:");
		int a=sc.nextInt();
		System.out.println("enter the second number:");
		int b=sc.nextInt();
		 int res=a/b;
		System.out.println("result is:"+res);
		}
		break;
		default:
		{
			System.out.println("\t\t\tInvalid options");
	}
	}
	}
}
