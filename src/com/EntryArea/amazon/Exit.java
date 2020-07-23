package com.EntryArea.amazon;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exit {

	public static Scanner scan=new Scanner(System.in);
	public static void exit() throws InterruptedException, IOException 
	{
		System.out.println("The Items In Your cart may be Gone if you exit...Are You Sure?");
		System.out.println("1. Yes, I want to Exit!!! \n2.No Take me To Payment Area \n3.I Want to Shop Again!");

		try
		{
			switch(scan.nextInt())
			{
			case 1: System.out.println("Thank you for Making upto here.....Expecting you to see you Soon!!");
			System.exit(0);
			break;

			case 2: 
				System.out.print("Taking You to Payments");
				for(int i=0;i<2;i++)
				{
					System.out.print(".");
					Thread.sleep(1000);
				}
				System.out.println();
				PaymentArea.payment_Methods();
				break;
				
			case 3: System.out.print("Loading Shopping Area");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			Categories.category_list();
			break;
				
			default: System.out.println("Invalid Choice....Try Again!");
			exit();
			}			
		}
		catch (InputMismatchException e) {
			System.out.println("Enter Valid Input!!!!");
		}

	}
}
