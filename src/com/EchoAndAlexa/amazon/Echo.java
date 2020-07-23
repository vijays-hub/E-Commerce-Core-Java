package com.EchoAndAlexa.amazon;
import java.io.IOException;
import java.util.*;

import com.EntryArea.amazon.CartZone;
import com.EntryArea.amazon.Categories;
import com.EntryArea.amazon.Home;
import com.EntryArea.amazon.PaymentArea;
public class Echo
{
	public static void echo_categories() throws InterruptedException, IOException
	{
		Scanner echo_scan= new Scanner(System.in);
		System.out.println("------Echo & Alexa-------");
		System.out.println("1.Echo Dot \n2.All New Amazon Echo \n3.Echo Show 8 \n4.Echo Plus \n5.Echo Studio");

		System.out.println("");
		System.out.println("Jot Your Choice to Move Ahead");

		double price;
		String product_Name;
		String product_Color;
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
			EchoDot.echo();
			break;
		case 2: 
			System.out.print("Loading");
			for(int i=0;i<3;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			AmazonEcho.echo();
			break;
		case 3: 
			System.out.print("Loading");
			for(int i=0;i<3;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			EchoShow.echo();
			break;
		case 4: 
			System.out.print("Loading");
			for(int i=0;i<3;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			EchoPlus.echo();
			break;
		case 5: 
			System.out.print("Loading");
			for(int i=0;i<3;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			EchoStudio.echo();
			break;
		default : 
			System.out.println("Invalid Choice...Try Again");
			System.out.print("Loading");
			for(int i=0;i<3;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			Echo.echo_categories();
			break;
		}
	}
}
