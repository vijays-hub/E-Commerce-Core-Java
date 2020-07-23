package com.EntryArea.amazon;
import java.io.IOException;
import java.util.*;
public class PaymentArea 
{

	static Scanner pay_scan= new Scanner(System.in);
	static double price[]=new double[CartZone.prices.size()];
	private static Scanner scan;
	static double quantity[]= new double[CartZone.cartList.size()];

	static String name,address;
	static long contact;

	public static void payment_Methods() throws InterruptedException, IOException
	{
		scan = new Scanner(System.in);
		System.out.println("-----Payments Zone!!!!-----");
		System.out.print("Fetching all the Items in Your Bag which are ready to BUY!");
		for(int i=0;i<2;i++)
		{
			System.out.print(".");
			Thread.sleep(1000);
		}
		System.out.println();
		if(CartZone.cartList.size()<=0)
		{
			System.out.println("There are No items in your Bag");
			System.out.println("Purchase Something");
			Categories.category_list();
		}
		else if(CartZone.cartList.size()>0)
		{
			for(int i=0;i<CartZone.cartList.size();i++)
			{
				System.out.println((i+1)+". "+CartZone.cartList.get(i));
			}
			System.out.println();
			payment_Area();	
		}


	}

	static void payment_Area() throws InterruptedException, IOException
	{
		System.out.println();
		System.out.println("1.Checkout all \n2.Go back to Home \n3.Exit");

		if(scan.nextInt()==1)
		{
			System.out.println("Select Your Method of Payment \n1.Credit Card [Not Available Now!] \n2.Debit Card [Not Available Now] \n3.COD ");
			int pay_method= scan.nextInt();
			if(pay_method==3)
			{
				System.out.println("Kindly Help us with Your Shipping Information");
				System.out.println("--------------------------------------");
				System.out.println("Enter Your Name");
				name = scan.next();
				System.out.println("Enter the Contact Number");
				contact = scan.nextLong();
				System.out.println("Provide the Address to be Shipped!");
				address = scan.next();
				//				scan.next();
				System.out.println();
				AllShipment(name,contact,address);
			}
			else
			{
				System.out.println("Select Valid Payment Method!");
				payment_Area();
			}
		}
		else if(scan.nextInt()==2)
		{
			System.out.print("Taking you Home");
			for(int i=0;i<3;i++)
			{
				System.out.print(".");
			}
			System.out.println();
		}
		else if(scan.nextInt()==3)
		{
			System.out.print("Please Wait");
			for(int i=0;i<3;i++)
			{
				System.out.print(".");
			}
			System.out.println();
		}
	}


	static void AllShipment(String name, long contact, String address) throws InterruptedException, IOException
	{
		for(int i=0;i<CartZone.prices.size();i++)
		{
			price[i]=CartZone.prices.get(i);
		}

		for(int i=0;i<CartZone.cartList.size();i++)
		{
			System.out.println("Enter the required quantity for "+CartZone.cartList.get(i));
			int qty= scan.nextInt();
			quantity[i]=qty;
			System.out.println("Quantity added.....\n");

		}


		System.out.println("Shipping To: ");
		System.out.println("___________ ");
		System.out.println(name+" ,"+address);
		System.out.println("Contact Number: "+contact);
		System.out.println();
		System.out.println("                                                                     Billing Details                                                                                                    ");
		System.out.println("                        _____________________________________________________________________________________________________________________ ");
		System.out.println();
		System.out.println(String.format("%-20s%-40s%-40s", "                                Product Details                                   ","Quantity    ","    Price"));
		System.out.println("                        _____________________________________________________________________________________________________________________ ");
		System.out.println();
		for(int i=0;i<CartZone.cartList.size();i++)
		{
			System.out.println(String.format("%-20s%-40s%-40s","                          " +CartZone.cartList.get(i)+"                  ", quantity[i], CartZone.prices.get(i)));
			System.out.println("\n");
		}
		double subTotal=0;
		for(int i=0;i<CartZone.cartList.size();i++)
		{
			subTotal=subTotal+(price[i]*quantity[i]);
		}
		double CGST= 0.18;   //18%
		double Total= subTotal+(subTotal*CGST);

		System.out.println("                                                                                                                                         Sub Total: "+subTotal);
		System.out.println();
		System.out.println("                                                                                                                                         CGST     :     18%    ");
		System.out.println();
		System.out.println("                                                                                                                                         Total      : "+Total);
		System.out.println();
		System.out.println("1.Confirm Order \n2.Go back to Shopping Zone \n3.Go to Homepage");
		int choice= scan.nextInt();
		if(choice==1)
		{
			System.out.println("Your Order has been Placed Successfully.....");
			for(int i=0;i<CartZone.cartList.size();i++)
			{
				CartZone.cartList.remove(i);
			}
			System.out.println("\n");
			System.out.println("Please wait for 5-10min to recieve an electronic generated Invoice.");
			System.out.println("\n \n ");
			System.out.println("Meanwhile tell us what you wish to do.....");
			System.out.println("1.Go to Home \n2.Shop More \n3.I want to Exit ");
			int ch= scan.nextInt();
			if(ch==1)
			{
				System.out.print("Heading to Home Page");
				for(int i=0;i<3;i++)
				{
					System.out.print(".");
					Thread.sleep(1000);
				}
				System.out.println();
				Home.MainMethod();
			}
			else if(ch==2)
			{
				System.out.print("Heading to Shopping Zone");
				for(int i=0;i<3;i++)
				{
					System.out.print(".");
					Thread.sleep(1000);
				}
				System.out.println();
				Categories.category_list();
			}
			else if(ch==3)
			{
				System.out.print("Please wait");
				for(int i=0;i<3;i++)
				{
					System.out.print(".");
					Thread.sleep(1000);
				}
				System.out.println();
				Exit.exit();
			}

		}
		else if(choice==2)
		{
			System.out.print("Taking you to Shopping Zone!");
			for(int i=0;i<3;i++)
			{
				System.out.print(".");
			}
			System.out.println();
			Categories.category_list();
		}
		else
		{
			System.out.print("Please wait");
			for(int i=0;i<3;i++)
			{
				System.out.print(".");
			}
			System.out.println();
			Exit.exit();
		}





	}
}
