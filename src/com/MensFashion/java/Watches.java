package com.MensFashion.java;

import java.io.IOException;
import java.util.Scanner;

import com.EntryArea.amazon.CartZone;
import com.EntryArea.amazon.Categories;
import com.EntryArea.amazon.Home;
import com.EntryArea.amazon.PaymentArea;

public class Watches {

	static double price;
	static String product_Name,product_Color;
	static Scanner scan= new Scanner(System.in);
	
	public static void getWatches() throws InterruptedException, IOException {
		System.out.println("----Watch Wear Section----");
		System.out.println("Wandering our site to fetch beauties to ur hand!!!");
		for(int i=0;i<2;i++)
		{
			System.out.print(".");
			Thread.sleep(1000);
		}
		System.out.println("\n OK! We Found these");
		System.out.println("1.Redux Analog Day Date Functioning Mens and Boys Wrist Watch, Blue \n2.Fossil Gen 5 Carlyle Stainless Steel Touchscreen HandWatch, black "
				+ "\n3. Timewear Military Series Analogue Wrist Watch, white"
				+ "\n4.SKMEI Analog-Digital Dial Watch, Green \n5.Timex Analog Dial Men's Wrist Watch, Blue ");
		System.out.println();
		System.out.println("Which one suits your Hand?");
		switch(scan.nextInt())
		{
		case 1:
			price= 599;
			product_Color= "Blue";
			product_Name="Redux Analog Day Date Functioning Mens and Boys Wrist Watch";

			System.out.println(product_Name);
			System.out.println("Price :"+price);
			System.out.println("Color :"+product_Color);

			Thread.sleep(1500);
			System.out.println();
			System.out.println("1.Add to Cart \n2.Buy Now \n3.Go back \n4.Back to Categories \n5.Home");

			switch(scan.nextInt())
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
				MensMain.men_categories();
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
			getWatches();
			break;
			}
			
		case 2:
			price= 1599;
			product_Color= "black";
			product_Name="Fossil Gen 5 Carlyle Stainless Steel Touchscreen HandWatch";

			System.out.println(product_Name);
			System.out.println("Price :"+price);
			System.out.println("Color :"+product_Color);

			Thread.sleep(1500);
			System.out.println();
			System.out.println("1.Add to Cart \n2.Buy Now \n3.Go back \n4.Back to Categories \n5.Home");

			switch(scan.nextInt())
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
				MensMain.men_categories();
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
			getWatches();
			break;
			}
			
		case 3:
			price= 899;
			product_Color= "white";
			product_Name=" Timewear Military Series Analogue Wrist Watch";

			System.out.println(product_Name);
			System.out.println("Price :"+price);
			System.out.println("Color :"+product_Color);

			Thread.sleep(1500);
			System.out.println();
			System.out.println("1.Add to Cart \n2.Buy Now \n3.Go back \n4.Back to Categories \n5.Home");

			switch(scan.nextInt())
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
				MensMain.men_categories();
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
			getWatches();
			break;
			}
			
		case 4:
			price= 2199;
			product_Color= "Green";
			product_Name="SKMEI Analog-Digital Dial Watch";

			System.out.println(product_Name);
			System.out.println("Price :"+price);
			System.out.println("Color :"+product_Color);

			Thread.sleep(1500);
			System.out.println();
			System.out.println("1.Add to Cart \n2.Buy Now \n3.Go back \n4.Back to Categories \n5.Home");

			switch(scan.nextInt())
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
				MensMain.men_categories();
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
			getWatches();
			break;
			}
			
		case 5:
			price= 2099;
			product_Color= "Blue";
			product_Name="Timex Analog Dial Men's Wrist Watch";

			System.out.println(product_Name);
			System.out.println("Price :"+price);
			System.out.println("Color :"+product_Color);

			Thread.sleep(1500);
			System.out.println();
			System.out.println("1.Add to Cart \n2.Buy Now \n3.Go back \n4.Back to Categories \n5.Home");

			switch(scan.nextInt())
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
				MensMain.men_categories();
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
			getWatches();
			break;
			}
			
			default: System.out.println("Ooopsie.....Cant Get That Now! Try Again");
			getWatches();
		}
		
	}

}
