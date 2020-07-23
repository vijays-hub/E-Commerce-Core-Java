package com.EchoAndAlexa.amazon;

import java.io.IOException;
import java.util.Scanner;

import com.EntryArea.amazon.CartZone;
import com.EntryArea.amazon.Categories;
import com.EntryArea.amazon.Home;
import com.EntryArea.amazon.PaymentArea;

public class EchoPlus
{
	public static void echo() throws InterruptedException, IOException
	{
		Scanner echo_scan= new Scanner(System.in); 

		double price;
		String product_Name;
		String product_Color;
		
		price= 14999.00;
		product_Name= "Echo Plus (2nd Gen)";
		product_Color= "Black";

		System.out.println(product_Name);
		System.out.println("Price :"+price);
		System.out.println("Color :"+product_Color);
		
		Thread.sleep(1500);
		System.out.println();
		System.out.println("1.Add to Cart \n2.Buy Now \n3.Go back \n4.Back to Categories \n5.Home");
		
		switch(echo_scan.nextInt())
		{
		case 1: 
			System.out.print("Loading");
			for(int i=0;i<3;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			CartZone.addCart(price, product_Name, product_Color);
		break;
		case 2: 
			System.out.print("Loading");
			for(int i=0;i<3;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			PaymentArea.payment_Methods();
		break;
		case 3: 
			System.out.print("Loading");
			for(int i=0;i<3;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			Echo.echo_categories();
		break;
		case 4:
			System.out.print("Loading");
			for(int i=0;i<3;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			Categories.category_list();
		break;
		case 5: 
			System.out.print("Loading");
			for(int i=0;i<3;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			Home.MainMethod();
		break;
		default: System.out.println("Select valid choice ");
		System.out.print("Loading");
		for(int i=0;i<3;i++)
		{
			System.out.print(".");
			Thread.sleep(1000);
		}
		System.out.println();
		echo();
		break;
		}
	}
}
