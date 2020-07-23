package com.TvElectronicsAppliances;

import java.io.IOException;
import java.util.Scanner;

import com.EntryArea.amazon.CartZone;
import com.EntryArea.amazon.Categories;
import com.EntryArea.amazon.Home;
import com.EntryArea.amazon.PaymentArea;

public class AppliancesZone {

	static double price;
	static String product_Name,product_Color;
	
	static Scanner scan= new Scanner(System.in);
	
	public static void getSamsung() throws InterruptedException, IOException {
		System.out.println("----Samsung Appliances----");
		System.out.print("Fetching all Samsung Appliances");
		for(int i=0;i<2;i++)
		{
			System.out.print(".");
			Thread.sleep(1000);
		}
		System.out.println();
		System.out.println("1.Samsung 6.2KG Fully Automatic TOP Load Washing Machine, Grey");
		System.out.println("2.Samsung 23L Solo Microwave Oven, Black");
		System.out.println("3.Samsung 28L Solo Microwave Oven, Blue");
		System.out.println("4.Samsung 192 L 2 Star Direct-Cool Single Door Refrigerator Elective Silver");
		System.out.println();
		System.out.println("Select Your Product to Continue.....");

		switch (scan.nextInt()) {
		case 1:
			price= 13990;
			product_Color= "Grey";
			product_Name="Samsung 6.2KG Fully Automatic TOP Load Washing Machine, Grey";

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
				TEAAllCategories.appliances_list();
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
			getSamsung();
			break;
			}
			
			
		case 2:
			price= 5990;
			product_Color= "Black";
			product_Name="Samsung 23L Solo Microwave Oven, Black";

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
				TEAAllCategories.appliances_list();
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
			getSamsung();
			break;
			}
			
		case 3:
			price= 7990;
			product_Color= "Blue";
			product_Name="	Samsung 28L Solo Microwave Oven, Blue";

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
				TEAAllCategories.appliances_list();
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
			getSamsung();
			break;
			}
			
		case 4:
			price= 11990;
			product_Color= "Elective Silver";
			product_Name="	Samsung 192 L 2 Star Direct-Cool Single Door Refrigerator Elective Silver";

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
				TEAAllCategories.appliances_list();
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
			getSamsung();
			break;
			}
			
			default:System.out.println("Thats Out of Something What we have got here....Try Again");
			getSamsung();
			
		}

		
	}
	
	public static void getWhirlpool() throws InterruptedException, IOException {
		System.out.println("----Whirlpool Appliances----");
		System.out.print("Fetching all Whirlpool Appliances");
		for(int i=0;i<2;i++)
		{
			System.out.print(".");
			Thread.sleep(1000);
		}
		System.out.println();
		System.out.println("1.Whirlpool 6.2KG Fully Automatic TOP Load Washing Machine, Grey");
		System.out.println("2.Whirlpool 23L Solo Microwave Oven, Black");
		System.out.println("3.Whirlpool 28L Solo Microwave Oven, Blue");
		System.out.println("4.Whirlpool 192 L 2 Star Direct-Cool Single Door Refrigerator Elective Silver");
		System.out.println();
		System.out.println("Select Your Product to Continue.....");

		switch (scan.nextInt()) {
		case 1:
			price= 13990;
			product_Color= "Grey";
			product_Name="Whirlpool 6.2KG Fully Automatic TOP Load Washing Machine, Grey";

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
				TEAAllCategories.appliances_list();
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
			getWhirlpool();
			break;
			}
			
		case 2:
			price= 5990;
			product_Color= "Black";
			product_Name="Whirlpool 23L Solo Microwave Oven, Black";

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
				TEAAllCategories.appliances_list();
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
			getWhirlpool();
			break;
			}
			
		case 3:
			price= 7990;
			product_Color= "Blue";
			product_Name="	Whirlpool 28L Solo Microwave Oven, Blue";

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
				TEAAllCategories.appliances_list();
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
			getWhirlpool();
			break;
			}
			
		case 4:
			price= 11990;
			product_Color= "Elective Silver";
			product_Name="	Whirlpool 192 L 2 Star Direct-Cool Single Door Refrigerator Elective Silver";

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
				TEAAllCategories.appliances_list();
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
			getWhirlpool();
			break;
			}
			
			default:System.out.println("Thats Out of Something What we have got here....Try Again");
			getWhirlpool();
		}
	}
	
	public static void getGodrej() throws InterruptedException, IOException {
		System.out.println("----Godrej Appliances----");
		System.out.print("Fetching all Godrej Appliances");
		for(int i=0;i<2;i++)
		{
			System.out.print(".");
			Thread.sleep(1000);
		}
		System.out.println();
		System.out.println("1.Godrej 6.2KG Fully Automatic TOP Load Washing Machine, Grey");
		System.out.println("2.Godrej 23L Solo Microwave Oven, Black");
		System.out.println("3.Godrej 28L Solo Microwave Oven, Blue");
		System.out.println("4.Godrej 192 L 2 Star Direct-Cool Single Door Refrigerator Elective Silver");
		System.out.println();
		System.out.println("Select Your Product to Continue.....");

		switch (scan.nextInt()) {
		case 1:
			price= 13990;
			product_Color= "Grey";
			product_Name="Godrej 6.2KG Fully Automatic TOP Load Washing Machine, Grey";

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
				TEAAllCategories.appliances_list();
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
			getGodrej();
			break;
			}
			
		case 2:
			price= 5990;
			product_Color= "Black";
			product_Name="Godrej 23L Solo Microwave Oven, Black";

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
				TEAAllCategories.appliances_list();
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
			getGodrej();
			break;
			}
			
		case 3:
			price= 7990;
			product_Color= "Blue";
			product_Name="	Godrej 28L Solo Microwave Oven, Blue";

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
				TEAAllCategories.appliances_list();
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
			getGodrej();
			break;
			}
			
		case 4:
			price= 11990;
			product_Color= "Elective Silver";
			product_Name="	Godrej 192 L 2 Star Direct-Cool Single Door Refrigerator Elective Silver";

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
				TEAAllCategories.appliances_list();
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
			getGodrej();
			break;
			}
			
			default:System.out.println("Thats Out of Something What we have got here....Try Again");
			getGodrej();
		}
	}
	public static void getHaier() throws IOException, InterruptedException{
		System.out.println("----Haier Appliances----");
		System.out.print("Fetching all Haier Appliances");
		for(int i=0;i<2;i++)
		{
			System.out.print(".");
			Thread.sleep(1000);
		}
		System.out.println();
		System.out.println("1.Haier 6.2KG Fully Automatic TOP Load Washing Machine, Grey");
		System.out.println("2.Haier 23L Solo Microwave Oven, Black");
		System.out.println("3.Haier 28L Solo Microwave Oven, Blue");
		System.out.println("4.Haier 192 L 2 Star Direct-Cool Single Door Refrigerator Elective Silver");
		System.out.println();
		System.out.println("Select Your Product to Continue.....");

		switch (scan.nextInt()) {
		case 1:
			price= 13990;
			product_Color= "Grey";
			product_Name=" Haier 6.2KG Fully Automatic TOP Load Washing Machine, Grey";

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
				TEAAllCategories.appliances_list();
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
			getHaier();
			break;
			}
			
		case 2:
			price= 5990;
			product_Color= "Black";
			product_Name="Haier 23L Solo Microwave Oven, Black";

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
				TEAAllCategories.appliances_list();
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
			getHaier();
			break;
			}
			
		case 3:
			price= 7990;
			product_Color= "Blue";
			product_Name="	Haier 28L Solo Microwave Oven, Blue";

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
				TEAAllCategories.appliances_list();
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
			getHaier();
			break;
			}
			
		case 4:
			price= 11990;
			product_Color= "Elective Silver";
			product_Name="	Haier 192 L 2 Star Direct-Cool Single Door Refrigerator Elective Silver";

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
				TEAAllCategories.appliances_list();
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
			getHaier();
			break;
			}
			
			default:System.out.println("Thats Out of Something What we have got here....Try Again");
			getHaier();
		}
	}

}
