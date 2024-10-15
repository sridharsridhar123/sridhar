import java.util.Scanner;
class zomato
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args)throws Exception
	{
		System.out.println("\t\tWelcome to zomato\n");
		System.out.println("\t\t Select the hotel");
		System.out.println("\t\t-------------------");
		System.out.println("1.Bilal\n2.A2B\n3.Amman\n");
		int select=sc.nextInt();
		System.out.println("\t\tprocessing.....\n");
		Thread.sleep(2000);
		
		switch(select)
		{
			case 1:{
			Thread.sleep(1000);
			System.out.println("\t\tGreating from Bilal\n");
			System.out.println("\t\tSelect your favorite food");
			System.out.println("\t\t--------------------------");
			System.out.println("1.Mutton briyani\n2.Chicken briyani\n3.Ghee rice");
			int choose=sc.nextInt();
			
			switch(choose)
		{
			case 1:{
			System.out.println("\t\tyou selected mutton briyani");
			System.out.println("\t\t--------------------------\n");
			System.out.println("enter the quantity:");
			int qty=sc.nextInt();
			int price=300;
			int bill=qty*price;
			System.out.println("\t\tprocessing....\n");
			Thread.sleep(1000);
			System.out.println("total bill:\n"+bill);
			System.out.println("\t\tpayment gatway....\n");
			Thread.sleep(1000);
			System.out.println("\t\t Select payment mode\n");
			System.out.println("\t\t---------------------");
			System.out.println("1.G-pay\n2.Phone-pay");
			int payment_mode=sc.nextInt();
			System.out.println("\t\tProcessing.....\n");
			Thread.sleep(2000);
			
			switch(payment_mode)
				{
				case 1:{
				System.out.println("\t\tenter the total bill:"+bill);
				double user_enterd_bill_amount=sc.nextDouble();
			if(bill==user_enterd_bill_amount)
					
					{
					int sys_otp=(int)(Math.random()*9999+9999);
					System.out.println("\t\tEnter the otp:");
					Thread.sleep(3000);
					System.out.println(sys_otp);
					int user_enterd_otp=sc.nextInt();
					if(sys_otp== user_enterd_otp)
						{
					System.out.println("\t\t processing......\n");
					Thread.sleep(3000);
					System.out.println("\t\tOrder Recived.....\n");
					System.out.println("\t\t You will be delivered in 30 minutes.....");
						}
					else if(sys_otp!=user_enterd_otp)
							{
						System.out.println("\t\t wrong otp");
							}
					
						}
						break;
				}
				
						case 2:{
				System.out.println("\t\t enter the total bill:"+bill);
				double user_enterd_bill_amount=sc.nextDouble();
			if(bill==user_enterd_bill_amount)
					
					{
					int sys_otp=(int)(Math.random()*9999+9999);
					System.out.println("\t\tEnter the otp:");
					Thread.sleep(3000);
					System.out.println(sys_otp);
					int user_enterd_otp=sc.nextInt();
					if(sys_otp== user_enterd_otp)
						{
					System.out.println("\t\t processing......\n");
					Thread.sleep(3000);
					System.out.println("\t\tOrder Recived.....\n");
					System.out.println("\t\t You will be delivered in 30 minutes.....");
						}
					else if(sys_otp!=user_enterd_otp)
							{
						System.out.println("\t\t wrong otp");
							}
					}
								
					}
					break;
			}
			}
			break;	
			//-----------------------------------------------
			
			case 2:{
			System.out.println("\t\tyou selected chicken briyani");
			System.out.println("\t\t--------------------------\n");
			System.out.println("enter the quantity:");
			int qty=sc.nextInt();
			int price=200;
			int bill=qty*price;
			System.out.println("\t\tprocessing....\n");
			Thread.sleep(1000);
			System.out.println("total bill:\n"+bill);
			System.out.println("\t\tpayment gateway....\n");
			Thread.sleep(1000);
			System.out.println("\t\t Select payment mode\n");
			System.out.println("\t\t---------------------");
			System.out.println("1.G-pay\n2.Phone-pay");
			int payment_mode=sc.nextInt();
			System.out.println("\t\tProcessing.....");
			Thread.sleep(2000);
			
			switch(payment_mode)
				{
				case 1:{
				System.out.println("\t\t enter the total bill:"+bill);
				double user_enterd_bill_amount=sc.nextDouble();
			if(bill==user_enterd_bill_amount)
					{
					
					int sys_otp=(int)(Math.random()*9999+9999);
					System.out.println("\t\tEnter the otp:");
					Thread.sleep(3000);
					System.out.println(sys_otp);
					int user_enterd_otp=sc.nextInt();
					if(sys_otp== user_enterd_otp)
						{
					System.out.println("\t\t processing......\n");
					Thread.sleep(3000);
					System.out.println("\t\tOrder Recived.....\n");
					System.out.println("\t\t You will be delivered in 30 minutes.....");
						}
					}
				}
					break;
					case 2:{
				System.out.println("\t\tenter the total bill:"+bill);
				double user_enterd_bill_amount=sc.nextDouble();
			if(bill==user_enterd_bill_amount)
					
					{
					int sys_otp=(int)(Math.random()*9999+9999);
					System.out.println("\t\tEnter the otp:");
					Thread.sleep(3000);
					System.out.println(sys_otp);
					int user_enterd_otp=sc.nextInt();
					if(sys_otp== user_enterd_otp)
						{
					System.out.println("\t\t processing......\n");
					Thread.sleep(3000);
					System.out.println("\t\tOrder Recived.....\n");
					System.out.println("\t\t You will be delivered in 30 minutes.....");
						}
					else if(sys_otp!=user_enterd_otp)
							{
						System.out.println("\t\twrong otp");
							}
					
						}
				}
				break;
				}	
		}
		break;
		case 3:{
			System.out.println("\t\tyou selected Ghee Rice");
			System.out.println("\t\t--------------------------\n");
			System.out.println("enter the quantity:");
			int qty=sc.nextInt();
			int price=150;
			int bill=qty*price;
			System.out.println("\t\tprocessing....\n");
			Thread.sleep(1000);
			System.out.println("\t\ttotal bill:\n"+bill);
			System.out.println("\t\tpayment gateway....\n");
			Thread.sleep(1000);
			System.out.println("\t\t Select payment mode\n");
			System.out.println("\t\t---------------------");
			System.out.println("1.G-pay\n2.Phone-pay");
			int payment_mode=sc.nextInt();
			System.out.println("\t\tProcessing.....\n");
			Thread.sleep(2000);
			
			switch(payment_mode)
				{
				case 1:{
				System.out.println("\t\t enter the total bill:"+bill);
				double user_enterd_bill_amount=sc.nextDouble();
			if(bill==user_enterd_bill_amount)
					{
					
					int sys_otp=(int)(Math.random()*9999+9999);
					System.out.println("\t\tEnter the otp:");
					Thread.sleep(3000);
					System.out.println(sys_otp);
					int user_enterd_otp=sc.nextInt();
					if(sys_otp== user_enterd_otp)
						{
					System.out.println("\t\t processing......\n");
					Thread.sleep(3000);
					System.out.println("\t\tOrder Recived.....\n");
					System.out.println("\t\t You will be delivered in 30 minutes.....");
						}
					}
				}
				break;
				case 2:{
				System.out.println("\t\tenter the total bill:"+bill);
				double user_enterd_bill_amount=sc.nextDouble();
			if(bill==user_enterd_bill_amount)
		
					{
					int sys_otp=(int)(Math.random()*9999+9999);
					System.out.println("\t\tEnter the otp:");
					Thread.sleep(3000);
					System.out.println(sys_otp);
					int user_enterd_otp=sc.nextInt();
					if(sys_otp== user_enterd_otp)
						{
					System.out.println("\t\t processing......\n");
					Thread.sleep(3000);
					System.out.println("\t\tOrder Recived.....\n");
					System.out.println("\t\t You will be delivered in 30 minutes.....");
						}
					else if(sys_otp!=user_enterd_otp)
							{
						System.out.println("\t\t wrong otp");
							}
						
							}
					
						break;
						
				}			
						}
				}
				}
				break;
			}
		
				
			case 2:{
			Thread.sleep(1000);
			System.out.println("\t\tGreating from A2B\n");
			System.out.println("\t\tSelect your favorite food");
			System.out.println("\t\t------------------");
			System.out.println("1.Idly\n2.dosa \n3.pongal ");
			int choose=sc.nextInt();
			
			switch(choose)
		{
			case 1:{
			System.out.println("\t\tyou selected idly");
			System.out.println("\t\t-----------------\n");
			System.out.println("enter the quantity:");
			int qty=sc.nextInt();
			int price=10;
			int bill=qty*price;
			System.out.println("\t\tprocessing....\n");
			Thread.sleep(1000);
			System.out.println("\t\ttotal bill:\n"+bill);
			System.out.println("\t\tpayment gateway....\n");
			Thread.sleep(1000);
			System.out.println("\t\t Select payment mode\n");
			System.out.println("\t\t---------------------");
			System.out.println("1.G-pay\n2.Phone-pay");
			int payment_mode=sc.nextInt();
			System.out.println("\t\tProcessing.....\n");
			Thread.sleep(2000);
			
			switch(payment_mode)
				{
				case 1:{
				System.out.println("\t\tenter the total bill:"+bill);
				double user_enterd_bill_amount=sc.nextDouble();
			if(bill==user_enterd_bill_amount)
					
					{
					int sys_otp=(int)(Math.random()*9999+9999);
					System.out.println("\t\tEnter the otp:");
					Thread.sleep(3000);
					System.out.println(sys_otp);
					int user_enterd_otp=sc.nextInt();
					if(sys_otp== user_enterd_otp)
						{
					System.out.println("\t\t processing......\n");
					Thread.sleep(3000);
					System.out.println("\t\tOrder Recived.....\n");
					System.out.println("\t\t You will be delivered in 30 minutes.....");
						}
					else if(sys_otp!=user_enterd_otp)
							{
						System.out.println("\t\twrong otp");
							}
					
						}
						break;
				}
				
						case 2:{
				System.out.println("\t\tenter the total bill:"+bill);
				double user_enterd_bill_amount=sc.nextDouble();
			if(bill==user_enterd_bill_amount)
					
					{
					int sys_otp=(int)(Math.random()*9999+9999);
					System.out.println("\t\t Enter the otp:");
					Thread.sleep(3000);
					System.out.println(sys_otp);
					int user_enterd_otp=sc.nextInt();
					if(sys_otp== user_enterd_otp)
						{
					System.out.println("\t\t processing......\n");
					Thread.sleep(3000);
					System.out.println("\t\tOrder Recived.....\n");
					System.out.println("\t\t You will be delivered in 30 minutes.....");
						}
					else if(sys_otp!=user_enterd_otp)
							{
						System.out.println("\t\t wrong otp");
							}
					}
								
					}
					break;
			}
			}
			break;	
			//-----------------------------------------------
			
			case 2:{
			System.out.println("\t\tyou selected dosa");
			System.out.println("\t\t--------------------------\n");
			System.out.println("enter the quantity:");
			int qty=sc.nextInt();
			int price=40;
			int bill=qty*price;
			System.out.println("\t\tprocessing....\n");
			Thread.sleep(1000);
			System.out.println("\t\ttotal bill:\n"+bill);
			System.out.println("\t\tpayment gateway....\n");
			Thread.sleep(1000);
			System.out.println("\t\t Select payment mode\n");
			System.out.println("\t\t---------------------");
			System.out.println("1.G-pay\n2.Phone-pay");
			int payment_mode=sc.nextInt();
			System.out.println("\t\tProcessing.....");
			Thread.sleep(2000);
			
			switch(payment_mode)
				{
				case 1:{
				System.out.println("\t\tenter the total bill:"+bill);
				double user_enterd_bill_amount=sc.nextDouble();
			if(bill==user_enterd_bill_amount)
					{
					
					int sys_otp=(int)(Math.random()*9999+9999);
					System.out.println("\t\tEnter the otp:");
					Thread.sleep(3000);
					System.out.println(sys_otp);
					int user_enterd_otp=sc.nextInt();
					if(sys_otp== user_enterd_otp)
						{
					System.out.println("\t\tprocessing......\n");
					Thread.sleep(3000);
					System.out.println("\t\tOrder Recived.....\n");
					System.out.println("\t\tYou will be delivered in 30 minutes.....");
						}
					}
				}
					break;
					case 2:{
				System.out.println("\t\tenter the total bill:"+bill);
				double user_enterd_bill_amount=sc.nextDouble();
			if(bill==user_enterd_bill_amount)
					
					{
					int sys_otp=(int)(Math.random()*9999+9999);
					System.out.println("\t\tEnter the otp:");
					Thread.sleep(3000);
					System.out.println(sys_otp);
					int user_enterd_otp=sc.nextInt();
					if(sys_otp== user_enterd_otp)
						{
					System.out.println("\t\tprocessing......\n");
					Thread.sleep(3000);
					System.out.println("\t\tOrder Recived.....\n");
					System.out.println("\t\tYou will be delivered in 30 minutes.....");
						}
					else if(sys_otp!=user_enterd_otp)
							{
						System.out.println("\t\t wrong otp");
							}
					
						}
				}
				break;
				}		
		}
		break;
		case 3:{
			System.out.println("\t\tyou selected pongal");
			System.out.println("\t\t--------------------------\n");
			System.out.println("\t\tenter the quantity:");
			int qty=sc.nextInt();
			int price=50;
			int bill=qty*price;
			System.out.println("\t\tprocessing....\n");
			Thread.sleep(1000);
			System.out.println("\t\ttotal bill:\n"+bill);
			System.out.println("\t\tpayment gateway....\n");
			Thread.sleep(1000);
			System.out.println("\t\t Select payment mode\n");
			System.out.println("\t\t---------------------");
			System.out.println("1.G-pay\n2.Phone-pay");
			int payment_mode=sc.nextInt();
			System.out.println("\t\tProcessing.....\n");
			Thread.sleep(2000);
			
			switch(payment_mode)
				{
				case 1:{
				System.out.println("\t\tenter the total bill:"+bill);
				double user_enterd_bill_amount=sc.nextDouble();
			if(bill==user_enterd_bill_amount)
					{
					
					int sys_otp=(int)(Math.random()*9999+9999);
					System.out.println("\t\tEnter the otp:");
					Thread.sleep(3000);
					System.out.println(sys_otp);
					int user_enterd_otp=sc.nextInt();
					if(sys_otp== user_enterd_otp)
						{
					System.out.println("\t\t processing......\n");
					Thread.sleep(3000);
					System.out.println("\t\tOrder Recived.....\n");
					System.out.println("\t\t You will be delivered in 30 minutes.....");
						}
					}
				}
				break;
				case 2:{
				System.out.println("\t\tenter the total bill:"+bill);
				double user_enterd_bill_amount=sc.nextDouble();
			if(bill==user_enterd_bill_amount)
		
					
					{
					int sys_otp=(int)(Math.random()*9999+9999);
					System.out.println("\t\tEnter the otp:");
					Thread.sleep(3000);
					System.out.println(sys_otp);
					int user_enterd_otp=sc.nextInt();
					if(sys_otp== user_enterd_otp)
						{
					System.out.println("\t\tprocessing......\n");
					Thread.sleep(3000);
					System.out.println("\t\tOrder Recived.....\n");
					System.out.println("\t\tYou will be delivered in 30 minutes.....");
						}
					else if(sys_otp!=user_enterd_otp)
							{
						System.out.println("\t\twrong otp");
							}
						
							}
						break;		
				}		
						}
				}
				}
			}
				break;
				case 3:{
			Thread.sleep(1000);
			System.out.println("\t\tGreating from Amman\n");
			System.out.println("\t\tSelect your favorite food");
			System.out.println("\t\t------------------");
			System.out.println("1.Idly\n2.dosa \n3.pongal ");
			int choose=sc.nextInt();
			
			switch(choose)
			{
			case 1:{
			System.out.println("\t\tyou selected idly");
			System.out.println("\t\t-----------------\n");
			System.out.println("enter the quantity:");
			int qty=sc.nextInt();
			int price=10;
			int bill=qty*price;
			System.out.println("\t\tprocessing....\n");
			Thread.sleep(1000);
			System.out.println("\t\ttotal bill:\n"+bill);
			System.out.println("\t\tpayment gateway....\n");
			Thread.sleep(1000);
			System.out.println("\t\t Select payment mode\n");
			System.out.println("\t\t---------------------");
			System.out.println("1.G-pay\n2.Phone-pay");
			int payment_mode=sc.nextInt();
			System.out.println("\t\tProcessing.....");
			Thread.sleep(2000);
			
			switch(payment_mode)
				{
				case 1:{
				System.out.println("\t\tenter the total bill:"+bill);
				double user_enterd_bill_amount=sc.nextDouble();
			if(bill==user_enterd_bill_amount)
					
					{
					int sys_otp=(int)(Math.random()*9999+9999);
					System.out.println("\t\tEnter the otp:");
					Thread.sleep(3000);
					System.out.println(sys_otp);
					int user_enterd_otp=sc.nextInt();
					if(sys_otp== user_enterd_otp)
						{
					System.out.println("\t\t processing......\n");
					Thread.sleep(3000);
					System.out.println("\t\tOrder Recived.....\n");
					System.out.println("\t\t You will be delivered in 30 minutes.....");
						}
					else if(sys_otp!=user_enterd_otp)
							{
						System.out.println("\t\twrong otp");
							}
					
						}
						break;
				}
				
						case 2:{
				System.out.println("\t\tenter the total bill:"+bill);
				double user_enterd_bill_amount=sc.nextDouble();
			if(bill==user_enterd_bill_amount)
					
					{
					int sys_otp=(int)(Math.random()*9999+9999);
					System.out.println("\t\t Enter the otp:");
					Thread.sleep(3000);
					System.out.println(sys_otp);
					int user_enterd_otp=sc.nextInt();
					if(sys_otp== user_enterd_otp)
						{
					System.out.println("\t\t processing......\n");
					Thread.sleep(3000);
					System.out.println("\t\tOrder Recived.....\n");
					System.out.println("\t\t You will be delivered in 30 minutes.....");
						}
					else if(sys_otp!=user_enterd_otp)
							{
						System.out.println("\t\t wrong otp");
							}
					}
								
					}
					break;
			}
			}
			break;	
			//-----------------------------------------------
			
			case 2:{
			System.out.println("\t\tyou selected dosa");
			System.out.println("\t\t-----------------\n");
			System.out.println("enter the quantity:");
			int qty=sc.nextInt();
			int price=40;
			int bill=qty*price;
			System.out.println("\t\tprocessing....\n");
			Thread.sleep(1000);
			System.out.println("\t\ttotal bill:\n"+bill);
			System.out.println("\t\tpayment gateway....\n");
			Thread.sleep(1000);
			System.out.println("\t\t Select payment mode\n");
			System.out.println("\t\t---------------------");
			System.out.println("1.G-pay\n2.Phone-pay");
			int payment_mode=sc.nextInt();
			System.out.println("\t\tProcessing.....\n");
			Thread.sleep(2000);
			
			switch(payment_mode)
				{
				case 1:{
				System.out.println("\t\tenter the total bill:"+bill);
				double user_enterd_bill_amount=sc.nextDouble();
			if(bill==user_enterd_bill_amount)
					{
					
					int sys_otp=(int)(Math.random()*9999+9999);
					System.out.println("\t\tEnter the otp:");
					Thread.sleep(3000);
					System.out.println(sys_otp);
					int user_enterd_otp=sc.nextInt();
					if(sys_otp== user_enterd_otp)
						{
					System.out.println("\t\tprocessing......\n");
					Thread.sleep(3000);
					System.out.println("\t\tOrder Recived.....\n");
					System.out.println("\t\tYou will be delivered in 30 minutes.....");
						}
					}
				}
					break;
					case 2:{
				System.out.println("\t\tenter the total bill:"+bill);
				double user_enterd_bill_amount=sc.nextDouble();
			if(bill==user_enterd_bill_amount)
					
					{
					int sys_otp=(int)(Math.random()*9999+9999);
					System.out.println("\t\tEnter the otp:");
					Thread.sleep(3000);
					System.out.println(sys_otp);
					int user_enterd_otp=sc.nextInt();
					if(sys_otp== user_enterd_otp)
						{
					System.out.println("\t\tprocessing......\n");
					Thread.sleep(3000);
					System.out.println("\t\tOrder Recived.....\n");
					System.out.println("\t\tYou will be delivered in 30 minutes.....");
						}
					else if(sys_otp!=user_enterd_otp)
							{
						System.out.println("\t\t wrong otp");
							}
					
						}
				}
				break;
				}		
		}
		break;
		case 3:{
			System.out.println("\t\tyou selected pongal");
			System.out.println("\t\t-------------------\n");
			System.out.println("\t\tenter the quantity:");
			int qty=sc.nextInt();
			int price=50;
			int bill=qty*price;
			System.out.println("\t\tprocessing....\n");
			Thread.sleep(1000);
			System.out.println("\t\ttotal bill:\n"+bill);
			System.out.println("\t\tpayment gateway....\n");
			Thread.sleep(1000);
			System.out.println("\t\t Select payment mode\n");
			System.out.println("\t\t---------------------");
			System.out.println("1.G-pay\n2.Phone-pay");
			int payment_mode=sc.nextInt();
			System.out.println("\t\tProcessing.....\n");
			Thread.sleep(2000);
			
			switch(payment_mode)
				{
				case 1:{
				System.out.println("\t\tenter the total bill:"+bill);
				double user_enterd_bill_amount=sc.nextDouble();
			if(bill==user_enterd_bill_amount)
					{
					
					int sys_otp=(int)(Math.random()*9999+9999);
					System.out.println("\t\tEnter the otp:");
					Thread.sleep(3000);
					System.out.println(sys_otp);
					int user_enterd_otp=sc.nextInt();
					if(sys_otp== user_enterd_otp)
						{
					System.out.println("\t\t processing......\n");
					Thread.sleep(3000);
					System.out.println("\t\tOrder Recived.....\n");
					System.out.println("\t\t You will be delivered in 30 minutes.....");
						}
					}
				}
				break;
				case 2:{
				System.out.println("\t\tenter the total bill:"+bill);
				double user_enterd_bill_amount=sc.nextDouble();
			if(bill==user_enterd_bill_amount)
		
					
					{
					int sys_otp=(int)(Math.random()*9999+9999);
					System.out.println("\t\tEnter the otp:");
					Thread.sleep(3000);
					System.out.println(sys_otp);
					int user_enterd_otp=sc.nextInt();
					if(sys_otp== user_enterd_otp)
						{
					System.out.println("\t\tprocessing......\n");
					Thread.sleep(3000);
					System.out.println("\t\tOrder Recived.....\n");
					System.out.println("\t\tYou will be delivered in 30 minutes.....");
						}
					else if(sys_otp!=user_enterd_otp)
							{
						System.out.println("\t\twrong otp");
							}
						
							}
						
						break;
						
				}
				}
						}
				}
				}
				break;
				case 4:{
			Thread.sleep(1000);
			System.out.println("\t\tGreating from S.S.Hydrabad\n");
			System.out.println("\t\tSelect your favorite food");
			System.out.println("\t\t--------------------------");
			System.out.println("1.Mutton briyani\n2.Chicken briyani\n3.Ghee rice");
			int choose=sc.nextInt();
			
			switch(choose)
		{
			case 1:{
			System.out.println("\t\tyou selected mutton briyani");
			System.out.println("\t\t--------------------------\n");
			System.out.println("enter the quantity:");
			int qty=sc.nextInt();
			int price=300;
			int bill=qty*price;
			System.out.println("\t\tprocessing....\n");
			Thread.sleep(1000);
			System.out.println("total bill:\n"+bill);
			System.out.println("\t\tpayment gatway....\n");
			Thread.sleep(1000);
			System.out.println("\t\t Select payment mode\n");
			System.out.println("\t\t---------------------");
			System.out.println("1.G-pay\n2.Phone-pay");
			int payment_mode=sc.nextInt();
			System.out.println("\t\tProcessing.....\n");
			Thread.sleep(2000);
			
			switch(payment_mode)
				{
				case 1:{
				System.out.println("\t\tenter the total bill:"+bill);
				double user_enterd_bill_amount=sc.nextDouble();
			if(bill==user_enterd_bill_amount)
					
					{
					int sys_otp=(int)(Math.random()*9999+9999);
					System.out.println("\t\tEnter the otp:");
					Thread.sleep(3000);
					System.out.println(sys_otp);
					int user_enterd_otp=sc.nextInt();
					if(sys_otp== user_enterd_otp)
						{
					System.out.println("\t\t processing......\n");
					Thread.sleep(3000);
					System.out.println("\t\tOrder Recived.....\n");
					System.out.println("\t\t You will be delivered in 30 minutes.....");
						}
					else if(sys_otp!=user_enterd_otp)
							{
						System.out.println("\t\t wrong otp");
							}
					
						}
						break;
				}
				
						case 2:{
				System.out.println("\t\t enter the total bill:"+bill);
				double user_enterd_bill_amount=sc.nextDouble();
			if(bill==user_enterd_bill_amount)
					
					{
					int sys_otp=(int)(Math.random()*9999+9999);
					System.out.println("\t\tEnter the otp:");
					Thread.sleep(3000);
					System.out.println(sys_otp);
					int user_enterd_otp=sc.nextInt();
					if(sys_otp== user_enterd_otp)
						{
					System.out.println("\t\t processing......\n");
					Thread.sleep(3000);
					System.out.println("\t\tOrder Recived.....\n");
					System.out.println("\t\t You will be delivered in 30 minutes.....");
						}
					else if(sys_otp!=user_enterd_otp)
							{
						System.out.println("\t\t wrong otp");
							}
					}
								
					}
					break;
			}
			}
			break;		
			//-----------------------------------------------
			
			case 2:{
			System.out.println("\t\tyou selected chicken briyani");
			System.out.println("\t\t--------------------------\n");
			System.out.println("enter the quantity:");
			int qty=sc.nextInt();
			int price=200;
			int bill=qty*price;
			System.out.println("\t\tprocessing....\n");
			Thread.sleep(1000);
			System.out.println("total bill:\n"+bill);
			System.out.println("\t\tpayment gateway....\n");
			Thread.sleep(1000);
			System.out.println("\t\t Select payment mode\n");
			System.out.println("\t\t---------------------");
			System.out.println("1.G-pay\n2.Phone-pay");
			int payment_mode=sc.nextInt();
			System.out.println("\t\tProcessing.....\n");
			Thread.sleep(2000);
			
			switch(payment_mode)
				{
				case 1:{
				System.out.println("\t\t enter the total bill:"+bill);
				double user_enterd_bill_amount=sc.nextDouble();
			if(bill==user_enterd_bill_amount)
					{
					
					int sys_otp=(int)(Math.random()*9999+9999);
					System.out.println("\t\tEnter the otp:");
					Thread.sleep(3000);
					System.out.println(sys_otp);
					int user_enterd_otp=sc.nextInt();
					if(sys_otp== user_enterd_otp)
						{
					System.out.println("\t\t processing......\n");
					Thread.sleep(3000);
					System.out.println("\t\tOrder Recived.....\n");
					System.out.println("\t\t You will be delivered in 30 minutes.....");
						}
					}
				}
					break;
					case 2:{
				System.out.println("\t\tenter the total bill:"+bill);
				double user_enterd_bill_amount=sc.nextDouble();
			if(bill==user_enterd_bill_amount)
					
					{
					int sys_otp=(int)(Math.random()*9999+9999);
					System.out.println("\t\tEnter the otp:");
					Thread.sleep(3000);
					System.out.println(sys_otp);
					int user_enterd_otp=sc.nextInt();
					if(sys_otp== user_enterd_otp)
						{
					System.out.println("\t\t processing......\n");
					Thread.sleep(3000);
					System.out.println("\t\tOrder Recived.....\n");
					System.out.println("\t\t You will be delivered in 30 minutes.....");
						}
					else if(sys_otp!=user_enterd_otp)
							{
						System.out.println("\t\twrong otp");
							}
					
						}
				}
				break;
				}
				
		}
		break;
		case 3:{
			System.out.println("\t\tyou selected Ghee Rice");
			System.out.println("\t\t--------------------------\n");
			System.out.println("enter the quantity:");
			int qty=sc.nextInt();
			int price=150;
			int bill=qty*price;
			System.out.println("\t\tprocessing....\n");
			Thread.sleep(1000);
			System.out.println("\t\ttotal bill:\n"+bill);
			System.out.println("\t\tpayment gateway....\n");
			Thread.sleep(1000);
			System.out.println("\t\t Select payment mode\n");
			System.out.println("\t\t---------------------");
			System.out.println("1.G-pay\n2.Phone-pay");
			int payment_mode=sc.nextInt();
			System.out.println("\t\tProcessing.....\n");
			Thread.sleep(2000);
			
			switch(payment_mode)
				{
				case 1:{
				System.out.println("\t\t enter the total bill:"+bill);
				double user_enterd_bill_amount=sc.nextDouble();
			if(bill==user_enterd_bill_amount)
					{
					
					int sys_otp=(int)(Math.random()*9999+9999);
					System.out.println("\t\tEnter the otp:");
					Thread.sleep(3000);
					System.out.println(sys_otp);
					int user_enterd_otp=sc.nextInt();
					if(sys_otp== user_enterd_otp)
						{
					System.out.println("\t\t processing......\n");
					Thread.sleep(3000);
					System.out.println("\t\tOrder Recived.....\n");
					System.out.println("\t\t You will be delivered in 30 minutes.....");
						}
					}
				}
				break;
				case 2:{
				System.out.println("\t\tenter the total bill:"+bill);
				double user_enterd_bill_amount=sc.nextDouble();
			if(bill==user_enterd_bill_amount)
		
					
					{
					int sys_otp=(int)(Math.random()*9999+9999);
					System.out.println("\t\tEnter the otp:");
					Thread.sleep(3000);
					System.out.println(sys_otp);
					int user_enterd_otp=sc.nextInt();
					if(sys_otp== user_enterd_otp)
						{
					System.out.println("\t\t processing......\n");
					Thread.sleep(3000);
					System.out.println("\t\tOrder Recived.....\n");
					System.out.println("\t\t You will be delivered in 30 minutes.....");
						}
					else if(sys_otp!=user_enterd_otp)
							{
						System.out.println("\t\t wrong otp");
							}
						
							}
						
						break;		
				}
						}
				}
				}
				break;
			}	
	}			
									
}
}



	



				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	




					

		
	

	
	
	




					
				
			/*		case 2:{
					System.out.println("\t\t\t enter the total bill:"+bill);
				double user_enterd_bill_amount=sc.nextDouble();
				else if(bill==user_enterd_bill_amount)
					
						
					int sys_otp=(int)(Math.random()*9999+9999);
					System.out.println("\t\t\t Enter the otp:");
					Thread.sleep(3000);
					System.out.println(sys_otp);
					int user_enterd_otp=sc.nextInt();
					if(sys_otp== user_enterd_otp)
						
					System.out.println("\t\t\t processing......");
					Thread.sleep(3000);
					System.out.println("\t\t\tOrder Recived.....");
					System.out.println("\t\t\t\t You will be delivered in 30 minutes.....");
					
					else
					
						
						System.out.println("otp wrong");
						
				default:
					System.out.println("\t\t\tInvalid options...");
				}
				}
			
			
					
			case 2:
			System.out.println("\t\t\tyou selected chicken briyani");
			System.out.println("\t\t--------------------------\n");
			System.out.println("\t\tenter the quantity:");
			int qty=sc.nextInt();
			int price=380;
			int bill=qty*price;
			System.out.println("\t\tprocessing....\n");
			Thread.sleep(1000);
			System.out.println("\t\ttotal bill:\n"+bill);
			System.out.println("Ridirecting to payment gateway...\n");
			Thread.sleep(1000);
			System.out.println("\t\t Select payment mode\n");
			System.out.println("\t\t---------------------");
			System.out.println("\t\t1.G-pay\n\t\t2.Phone-pay");
			int payment_mode=sc.nextInt();
			System.out.println("\t\t\tProcessing.....");
			Thread.sleep(2000);
			break;		
			switch(payment_mode)
				{
				case 1:
					{
					System.out.println("\t\t\t enter the total bill:"+bill);
				double user_enterd_bill_amount=sc.nextDouble();
				if(bill==user_enterd_bill_amount)
					
					
					int sys_otp=(int)(Math.random()*9999+9999);
					System.out.println("\t\t\t Enter the otp:");
					Thread.sleep(3000);
					System.out.println(sys_otp);
					int user_enterd_otp=sc.nextInt();
					if(sys_otp== user_enterd_otp)
						
					System.out.println("\t\t\t processing......");
					Thread.sleep(3000);
					System.out.println("\t\t\tOrder Recived.....");
					System.out.println("\t\t\t\t You will be delivered in 30 minutes.....");
					
					else 
					
						System.out.println("otp wrong");
						
					else
					
						System.out.println("amount enter Incorrect");
					
					}*/
			

	


			
				



	

	



