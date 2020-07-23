package com.EntryArea.amazon;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Home
{
	private static String[] args;

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		Scanner home_scan= new Scanner(System.in);
	
		String user_name="Vijay_Tony!";
		System.out.print("Processing Please Wait");
		for(int i=0;i<2;i++)
		{
			System.out.print(".");
			Thread.sleep(1000);
		}
		System.out.println();
		System.out.println("Hello, "+user_name+"!");
		Thread.sleep(1000);
		System.out.println("How can we Help You Today?");
		Thread.sleep(1000);
		System.out.println("Here are some of the Quick Options for making your Busy day Easy!");
		
		try
		{	
			Thread.sleep(1000);
			System.out.println("1.Shop By Category \n2.Cart Zone  \n3.Exit");
			Thread.sleep(1500);
			System.out.println(" ");
			System.out.println("Enter Your Choice to move ahead!");
			
			switch(home_scan.nextInt())
			{
			case 1:
				System.out.print("Loading");
				for(int i=0;i<2;i++)
				{
					System.out.print(".");
					Thread.sleep(1000);
				}
				System.out.println();
				Categories.category_list();
			break;
			case 2: 
				System.out.print("Loading");
				for(int i=0;i<2;i++)
				{
					System.out.print(".");
					Thread.sleep(1000);
				}
				System.out.println();
				CartZone.cart();
			break;
					
			case 3: 
				System.out.print("Please Wait");
				for(int i=0;i<2;i++)
				{
					System.out.print(".");
					Thread.sleep(1000);
				}
				System.out.println();
				Exit.exit();
			break;
			default :
				System.out.println("Select any Choice mentioned");
				main(args);
				break;
			}
		}
		catch (InputMismatchException ime) 
		{
			System.out.println("Invalid Input Try Again!!!");
			main(args);
		}
	}
	public static void MainMethod() throws InterruptedException, IOException
	{
		Home.main(args);
	}
}
