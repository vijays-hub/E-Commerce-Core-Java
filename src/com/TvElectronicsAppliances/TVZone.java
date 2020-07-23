package com.TvElectronicsAppliances;

import java.io.IOException;
import java.util.Scanner;

import com.EntryArea.amazon.CartZone;
import com.EntryArea.amazon.Categories;
import com.EntryArea.amazon.Home;
import com.EntryArea.amazon.PaymentArea;
import com.MobilesAndComputers.amazon.MobilesAndComputers;

public class TVZone
{
	static double price;
	static String product_Name,product_Color;
	static byte inches;

	static Scanner scan= new Scanner(System.in);
	public static void getTVbelow10000() throws InterruptedException, IOException 
	{
		System.out.println("TVs Below 10000");
		System.out.println("-----------------------------");
		System.out.println("1.Sanyo 80cm (32 Inches) HD LED Black \n2.eAirtec 61cm (24 Inches) HD LED Black \n3.Kodak 80cm (32 inches) HD LED Black"
				+ "\n4.eAirtec 81cm (32 inches) HD LED Black \n5.Sanyo 61cm (24 Inches) HD LED Black ");
		System.out.println();
		System.out.println("Select Your Product to Continue.....");

		switch (scan.nextInt()) {
		case 1:
			price= 9499;
			product_Color= "Black";
			product_Name="Sanyo 80cm (32 Inches) HD LED Black";
			inches= 32;

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
				TEAAllCategories.tvList();
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
			getTVbelow10000();
			break;
			}

		case 2:
			price= 4899;
			product_Color= "Black";
			product_Name="eAirtec 61cm (24 Inches) HD LED Black";
			inches= 24;

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
				TEAAllCategories.tvList();
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
			getTVbelow10000();
			break;
			}

		case 3:
			price= 9499;
			product_Color= "Black";
			product_Name="Kodak 80cm (32 inches) HD LED Black";
			inches= 32;

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
				TEAAllCategories.tvList();
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
			getTVbelow10000();
			break;
			}

		case 4:
			price= 6899;
			product_Color= "Black";
			product_Name="eAirtec 81cm (32 inches) HD LED Black";
			inches= 32;

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
				TEAAllCategories.tvList();
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
			getTVbelow10000();
			break;
			}

		case 5:
			price= 8099;
			product_Color= "Black";
			product_Name="Sanyo 61cm (24 Inches) HD LED Black";
			inches= 24;

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
				TEAAllCategories.tvList();
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
			getTVbelow10000();
			break;
			}
		default: System.out.println("Thats Out of Something what we got!");	
		getTVbelow10000();
		}
	}
	public static void getTV10000to30000() throws InterruptedException, IOException 
	{
		System.out.println("TVs From 10000 to 30000");
		System.out.println("-----------------------------");
		System.out.println("1.Sanyo 80cm (32 Inches) HD LED Black \n2.eAirtec 61cm (24 Inches) HD LED Black \n3.Kodak 80cm (32 inches) HD LED Black"
				+ "\n4.eAirtec 81cm (32 inches) HD LED Black \n5.Sanyo 61cm (24 Inches) HD LED Black ");
		System.out.println();
		System.out.println("Select Your Product to Continue.....");

		switch (scan.nextInt()) {
		case 1:
			price= 11499;
			product_Color= "Black";
			product_Name="Sanyo 80cm (32 Inches) HD LED Black";
			inches= 32;

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
				TEAAllCategories.tvList();
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
			getTV10000to30000();
			break;
			}

		case 2:
			price= 11899;
			product_Color= "Black";
			product_Name="eAirtec 61cm (24 Inches) HD LED Black";
			inches= 24;

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
				TEAAllCategories.tvList();
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
			getTV10000to30000();
			break;
			}

		case 3:
			price= 12499;
			product_Color= "Black";
			product_Name="Kodak 80cm (32 inches) HD LED Black";
			inches= 32;

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
				TEAAllCategories.tvList();
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
			getTV10000to30000();
			break;
			}

		case 4:
			price= 16899;
			product_Color= "Black";
			product_Name="eAirtec 81cm (32 inches) HD LED Black";
			inches= 32;

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
				TEAAllCategories.tvList();
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
			getTV10000to30000();
			break;
			}

		case 5:
			price= 18099;
			product_Color= "Black";
			product_Name="Sanyo 61cm (24 Inches) HD LED Black";
			inches= 24;

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
				TEAAllCategories.tvList();
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
			getTV10000to30000();
			break;
			}	
		default: System.out.println("Thats Out of Something what we got!");	
		getTV10000to30000();
		}
	}
	public static void getTV30000to50000() throws IOException, InterruptedException
	{
		System.out.println("TVs From 30000 to 50000");
		System.out.println("-----------------------------");
		System.out.println("1.Sanyo 123cm (49 Inches) HD LED Black \n2.eAirtec 108cm (43 Inches) HD LED Black \n3.Kodak 80cm (32 inches) HD LED Black"
				+ "\n4.eAirtec 81cm (32 inches) HD LED Black \n5.Sanyo 61cm (24 Inches) HD LED Black ");
		System.out.println();
		System.out.println("Select Your Product to Continue.....");

		switch (scan.nextInt()) {
		case 1:
			price= 31499;
			product_Color= "Black";
			product_Name="Sanyo 123cm (49 Inches) HD LED Black";
			inches= 49;

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
				TEAAllCategories.tvList();
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
			getTV30000to50000();
			break;
			}

		case 2:
			price= 30899;
			product_Color= "Black";
			product_Name="eAirtec 108cm (43 Inches) HD LED Black";
			inches= 43;

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
				TEAAllCategories.tvList();
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
			getTV30000to50000();
			break;
			}

		case 3:
			price= 42499;
			product_Color= "Black";
			product_Name="Kodak 80cm (32 inches) HD LED Black";
			inches= 32;

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
				TEAAllCategories.tvList();
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
			getTV30000to50000();
			break;
			}

		case 4:
			price= 46899;
			product_Color= "Black";
			product_Name="eAirtec 81cm (32 inches) HD LED Black";
			inches= 32;

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
				TEAAllCategories.tvList();
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
			getTV30000to50000();
			break;
			}

		case 5:
			price= 38099;
			product_Color= "Black";
			product_Name="Sanyo 61cm (24 Inches) HD LED Black";
			inches= 24;

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
				TEAAllCategories.tvList();
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
			getTV30000to50000();
			break;
			}	
		default: System.out.println("Thats Out of Something what we got!");	
		getTV30000to50000();
		}
	}
	public static void getTVabove50000() throws IOException, InterruptedException
	{
		System.out.println("TVs Above 50000");
		System.out.println("-----------------------------");
		System.out.println("1.Sanyo 109cm (43 Inches) HD LED Black \n2.eAirtec 138cm (55 Inches) HD LED Black \n3.Kodak 138cm (55 inches) HD LED Black"
				+ "\n4.eAirtec 108cm (43 inches) HD LED Black \n5.Sanyo 105cm (42 Inches) HD LED Black ");
		System.out.println();
		System.out.println("Select Your Product to Continue.....");

		switch (scan.nextInt()) {
		case 1:
			price= 74499;
			product_Color= "Black";
			product_Name="Sanyo 109cm (43 Inches) HD LED Black";
			inches= 43;

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
				TEAAllCategories.tvList();
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
			getTVabove50000();
			break;
			}
			
		case 2:
			price= 68899;
			product_Color= "Black";
			product_Name="eAirtec 138cm (55 Inches) HD LED Black";
			inches= 55;

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
				TEAAllCategories.tvList();
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
			getTVabove50000();
			break;
			}
			
		case 3:
			price= 62499;
			product_Color= "Black";
			product_Name="Kodak 138cm (55 inches) HD LED Black";
			inches= 55;

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
				TEAAllCategories.tvList();
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
			getTVabove50000();
			break;
			}
			
		case 4:
			price= 86899;
			product_Color= "Black";
			product_Name="eAirtec 108cm (43 inches) HD LED Black";
			inches= 43;

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
				TEAAllCategories.tvList();
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
			getTVabove50000();
			break;
			}
			
		case 5:
			price= 88099;
			product_Color= "Black";
			product_Name="Sanyo 105cm (42 Inches) HD LED Black";
			inches= 24;

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
				TEAAllCategories.tvList();
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
			getTVabove50000();
			break;
			}	
		default: System.out.println("Thats Out of Something what we got!");	
		getTVabove50000();
		}
	}
}
