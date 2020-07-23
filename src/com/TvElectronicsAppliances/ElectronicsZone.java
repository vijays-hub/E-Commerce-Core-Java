package com.TvElectronicsAppliances;

import java.io.IOException;
import java.util.Scanner;

import com.EntryArea.amazon.CartZone;
import com.EntryArea.amazon.Categories;
import com.EntryArea.amazon.Home;
import com.EntryArea.amazon.PaymentArea;

public class ElectronicsZone 
{
	static Scanner scan= new Scanner(System.in); 

	static double price;
	static String product_Name, product_Color;

	public static void getCamera() throws IOException, InterruptedException
	{
		System.out.println("------Camera Centre------");
		System.out.print("Fetching all Camera Lists");
		for(int i=0;i<2;i++)
		{
			System.out.print(".");
			Thread.sleep(1000);
		}
		System.out.println();
		
		System.out.println("1.Canon EOS 1500D 24.1 Digital SLR Camera, Black");
		System.out.println("2.Nikon EOS 3500D 24.1 Digital SLR Camera, Black");
		System.out.println("3.Sony Alpha EOS 3500D 24.1 Digital SLR Camera, Black");
		System.out.println("4.Nikon EOS 1500D 24.1 Digital SLR Camera, Black");
		System.out.println("5.Canon EOS 1500D 24.1 Digital SLR Camera, Black");
		
		System.out.println();
		System.out.println("Select Your Product to Continue.....");

		switch (scan.nextInt()) {
		case 1:
			price= 25990;
			product_Color= "Black";
			product_Name=" Canon EOS 1500D 24.1 Digital SLR Camera, Black";

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
				TEAAllCategories.allElectronics();
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
			getCamera();
			break;
			}
			
		case 2:
			price= 28990;
			product_Color= "Black";
			product_Name=" Nikon EOS 3500D 24.1 Digital SLR Camera, Black";

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
				TEAAllCategories.allElectronics();
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
			getCamera();
			break;
			}
			
		case 3:
			price= 30990;
			product_Color= "Black";
			product_Name=" Sony Alpha EOS 3500D 24.1 Digital SLR Camera, Black";

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
				TEAAllCategories.allElectronics();
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
			getCamera();
			break;
			}
			
		case 4:
			price= 23990;
			product_Color= "Black";
			product_Name=" Nikon EOS 1500D 24.1 Digital SLR Camera, Black";

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
				TEAAllCategories.allElectronics();
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
			getCamera();
			break;
			}
			
		case 5:
			price= 26990;
			product_Color= "Black";
			product_Name=" Canon EOS 1500D 24.1 Digital SLR Camera, Black";

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
				TEAAllCategories.allElectronics();;
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
			getCamera();
			break;
			}

			default:System.out.println("Out of Reach Bro! Try with Proper Choice!");
			getCamera();
		}
	}

	public static void getHeadphones() throws IOException, InterruptedException {
		
		System.out.println("------Headphones Halt------");
		System.out.print("Fetching all Headphones Lists");
		for(int i=0;i<2;i++)
		{
			System.out.print(".");
			Thread.sleep(1000);
		}
		System.out.println();
		
		System.out.println("1.Audio Technica ATH-M50x Over-Ear Headphones, Black");
		System.out.println("2.Apple AirPods with Charging Case, White");
		System.out.println("3.Noise Shots XO Full Touch Control true Wireless Earphones, Black");
		System.out.println("4.Sennehieser HD 4.40-BT Headphones, Black");
		System.out.println("5.JBL Tune 120TWS Truly Wireless in-Ear Headphones, Black");
		
		System.out.println();
		System.out.println("Select Your Product to Continue.....");

		switch (scan.nextInt()) {
		case 1:
			price= 5990;
			product_Color= "Black";
			product_Name=" Audio Technica ATH-M50x Over-Ear Headphones, Black";

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
				TEAAllCategories.allElectronics();
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
			getHeadphones();
			break;
			}
			
		case 2:
			price= 12990;
			product_Color= "White";
			product_Name=" Apple AirPods with Charging Case, White";

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
				TEAAllCategories.allElectronics();
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
			getHeadphones();
			break;
			}
			
		case 3:
			price= 6990;
			product_Color= "Black";
			product_Name=" Noise Shots XO Full Touch Control true Wireless Earphones, Black";

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
				TEAAllCategories.allElectronics();
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
			getHeadphones();
			break;
			}
			
		case 4:
			price= 5790;
			product_Color= "Black";
			product_Name=" Sennehieser HD 4.40-BT Headphones, Black";

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
				TEAAllCategories.allElectronics();
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
			getHeadphones();
			break;
			}
			
		case 5:
			price= 7990;
			product_Color= "Black";
			product_Name=" JBL Tune 120TWS Truly Wireless in-Ear Headphones, Black";

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
				TEAAllCategories.allElectronics();
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
			getHeadphones();
			break;
			}
		}
	}

	public static void getMemoryCards() throws IOException, InterruptedException{
		System.out.println("------Memory Cards Mania------");
		System.out.print("Fetching all Memory Cards Lists");
		for(int i=0;i<2;i++)
		{
			System.out.print(".");
			Thread.sleep(1000);
		}
		System.out.println();
		
		System.out.println("1.Toshiba M203 16GB Class 10 Micro SD Memory Card, Red");
		System.out.println("2.Samsung 16GB Class 10 Micro SD Memory Card, Black");
		System.out.println("3.Strontium nitro 128GB Class 10 Micro SD Memory Card, Blue");
		System.out.println("4.Samsung 128GB Class 10 Micro SD Memory Card, Blue");
		System.out.println("5.Strontium nitro 256GB Class 10 Micro SD Memory Card, Blue");
		
		System.out.println();
		System.out.println("Select Your Product to Continue.....");

		switch (scan.nextInt()) {
		case 1:
			price= 259;
			product_Color= "Red";
			product_Name=" Toshiba M203 16GB Class 10 Micro SD Memory Card, Red";

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
				TEAAllCategories.allElectronics();
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
			getMemoryCards();
			break;
			}
			
		case 2:
			price= 359;
			product_Color= "Black";
			product_Name=" Samsung 16GB Class 10 Micro SD Memory Card, Black";

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
				TEAAllCategories.allElectronics();
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
			getMemoryCards();
			break;
			}
			
		case 3:
			price= 1259;
			product_Color= "Blue";
			product_Name=" Strontium nitro 128GB Class 10 Micro SD Memory Card, Blue";

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
				TEAAllCategories.allElectronics();
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
			getMemoryCards();
			break;
			}
			
		case 4:
			price= 859;
			product_Color= "Blue";
			product_Name=" Samsung 128GB Class 10 Micro SD Memory Card, Blue ";

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
				TEAAllCategories.allElectronics();
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
			getMemoryCards();
			break;
			}
			
		case 5:
			price= 2259;
			product_Color= "Blue";
			product_Name=" Strontium nitro 256GB Class 10 Micro SD Memory Card, Blue";

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
				TEAAllCategories.allElectronics();
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
			getMemoryCards();
			break;
			}
		}
	}


}
