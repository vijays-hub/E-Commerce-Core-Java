package com.MensFashion.java;

import java.io.IOException;
import java.util.Scanner;

import com.EntryArea.amazon.CartZone;
import com.EntryArea.amazon.Categories;
import com.EntryArea.amazon.Home;
import com.EntryArea.amazon.PaymentArea;

public class Shoes {

	static double price;
	static String product_Name,product_Color;
	static Scanner scan= new Scanner(System.in);

	public static void getShoes() throws InterruptedException, IOException {
		System.out.println("--------Sparkling Shoes Section--------");	
		System.out.print("Fetching all cool Shoes Made for You!!!");
		for(int i=0;i<2;i++)
		{
			System.out.print(".");
			Thread.sleep(1000);
		}
		System.out.println();
		System.out.println("Whats in ur mind today?");
		System.out.println("I want: \n1.Casual Shoes \n2.Formal Shoes \n3.Sports and Outdoor Shoes \n4.Sandals & Floaters \n5.Safety Shoes");
		System.out.println(" Lean (put) Something!\n");

		switch(scan.nextInt())
		{
		case 1: 
			System.out.print("Taking u to Casual Shoes corner");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			casualShoes();
			break;

		case 2: 
			System.out.print("Taking u to Formal Shoes forum");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			formalShoes();
			break;

		case 3: 
			System.out.print("Taking u to Sports Shoes Section");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			sportsShoes();
			break;

		case 4: 
			System.out.print("Taking u to Sandals and Floaters Section");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			sandalsFloaters();
			break;

		case 5: 
			System.out.print("Taking u to Safety Shoes Section");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			safetyShoes();
			break;

		default:System.out.println("Not Available! Try Again....");
		getShoes();
		}
	}
	private static void casualShoes() throws IOException, InterruptedException{
		System.out.println("---------Casual Shoes Corner---------");
		System.out.println("------------------------------------------------");
		System.out.println("----Available Now------");
		System.out.println("1. Sparx Men's Dip Canvas Casual Shoes, White \n2.Chevit Men's Combo Pack of 2 Casual Shoes, (White, Red)	 "
				+ "\n3.Kraasa Casual Canvas Sneakers for Men, Black \n4.Bond Street by RedTape Casual Men's Sneakers, Blue \n5.Ethics Perfect Ultra Life Casual Shoes for Men, Yellow");

		switch (scan.nextInt()) {
		case 1:
			price= 499;
			product_Color= "White";
			product_Name="Sparx Men's Dip Canvas Casual Shoes";

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
			casualShoes();
			break;
			}

		case 2:
			price= 399;
			product_Color= "White, Red";
			product_Name="Chevit Men's Combo Pack of 2 Casual Shoes";

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
			casualShoes();
			break;
			}

		case 3:
			price= 699;
			product_Color= "Black";
			product_Name="Kraasa Casual Canvas Sneakers for Men";

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
			casualShoes();
			break;
			}

		case 4:
			price= 499;
			product_Color= "Blue";
			product_Name="Bond Street by RedTape Casual Men's Sneakers";

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
			casualShoes();
			break;
			}

		case 5:
			price= 599;
			product_Color= "White";
			product_Name="Ethics Perfect Ultra Life Casual Shoes for Men, Yellow";

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
			casualShoes();
			break;
			}

		default: System.out.println("We aint got them Bro!!! Lokk what we got first!!!");
		casualShoes();	
		}	
	}
	private static void formalShoes() throws IOException, InterruptedException{
		System.out.println("---------Formal Shoes Forum---------");
		System.out.println("------------------------------------------------");
		System.out.println("----Available Now------");
		System.out.println("1. Sparx Men's Dip Canvas Formal Shoes, White \n2.Chevit Men's Combo Pack of 2  Formal Shoes, (White, Red)	 "
				+ "\n3.Kraasa  Formal Canvas Sneakers for Men, Black \n4.Bond Street by RedTape  Formal Men's Sneakers, Blue \n5.Ethics Perfect Ultra Life  Formal Shoes for Men, Yellow");

		switch (scan.nextInt()) {
		case 1:
			price= 499;
			product_Color= "White";
			product_Name="Sparx Men's Dip Canvas  FormalShoes";

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
			formalShoes();
			break;
			}

		case 2:
			price= 399;
			product_Color= "White, Red";
			product_Name="Chevit Men's Combo Pack of 2  Formal Shoes";

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
			formalShoes();
			break;
			}

		case 3:
			price= 699;
			product_Color= "Black";
			product_Name="Kraasa  Formal Canvas Sneakers for Men";

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
			formalShoes();
			break;
			}

		case 4:
			price= 499;
			product_Color= "Blue";
			product_Name="Bond Street by RedTape  Formal Men's Sneakers";

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
			formalShoes();
			break;
			}

		case 5:
			price= 599;
			product_Color= "White";
			product_Name="Ethics Perfect Ultra Life  Formal Shoes for Men, Yellow";

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
			formalShoes();
			break;
			}
		default: System.out.println("We aint got them Bro!!! Lokk what we got first!!!");
		formalShoes();
		}

	}
	private static void sportsShoes() throws IOException, InterruptedException{
		System.out.println("---------Sports Shoes Section---------");
		System.out.println("------------------------------------------------");
		System.out.println("----Available Now------");
		System.out.println("1. Sparx Men's Dip Canvas sports Shoes, White \n2.Chevit Men's Combo Pack of 2 sports Shoes, (White, Red)	 "
				+ "\n3.Kraasa sports Canvas Sneakers for Men, Black \n4.Bond Street by RedTape sports Men's Sneakers, Blue \n5.Ethics Perfect Ultra Life sports Shoes for Men, Yellow");

		switch (scan.nextInt()) {
		case 1:
			price= 499;
			product_Color= "White";
			product_Name="Sparx Men's Dip Canvas sports Shoes";

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
			sportsShoes();
			break;
			}

		case 2:
			price= 399;
			product_Color= "White, Red";
			product_Name="Chevit Men's Combo Pack of 2 sports Shoes";

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
			sportsShoes();
			break;
			}

		case 3:
			price= 699;
			product_Color= "Black";
			product_Name="Kraasa  sports Canvas Sneakers for Men";

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
			sportsShoes();
			break;
			}

		case 4:
			price= 499;
			product_Color= "Blue";
			product_Name="Bond Street by RedTape sports Men's Sneakers";

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
			sportsShoes();
			break;
			}

		case 5:
			price= 599;
			product_Color= "White";
			product_Name="Ethics Perfect Ultra Life  sports Shoes for Men, Yellow";

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
			sportsShoes();
			break;
			}
		default: System.out.println("We aint got them Bro!!! Lokk what we got first!!!");
		sportsShoes();
		}
	}
	private static void sandalsFloaters() throws IOException, InterruptedException{
		System.out.println("--------Sandals and Floaters Section---------");
		System.out.print("Sandals are Getting to be Hopped");
		for(int i=0;i<2;i++)
		{
			System.out.print(".");
			Thread.sleep(1000);
		}
		System.out.println();
		System.out.println("--------Ready to Go Now-----------");
		System.out.println("1.Flite Men's Flip Flops Thong Sandals, Blue \n2.Big Fox Men's Perforated Roman Sandals Brown "
				+ "\n3.Hush Puppies Men's Leather Outdoor Sandals, Brown \n4.Sparx Men's Sandals, Red "
				+ "\n5.Paragon Vertex Men's Flip Flops, Green");

		System.out.println("Hop Something");
		switch(scan.nextInt())
		{
		case 1:
			price= 216;
			product_Color= "Blue";
			product_Name="Flite Men's Flip Flops Thong Sandals";

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
			sandalsFloaters();
			break;
			}
			
		case 2:
			price= 352;
			product_Color= "Brown";
			product_Name="Big Fox Men's Perforated Roman Sandals ";

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
			sandalsFloaters();
			break;
			}
			
		case 3:
			price= 286;
			product_Color= "Brown";
			product_Name="Hush Puppies Men's Leather Outdoor Sandals";

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
			sandalsFloaters();
			break;
			}
			
		case 4:
			price= 526;
			product_Color= "Red";
			product_Name="Sparx Men's Sandals, Red";

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
			sandalsFloaters();
			break;
			}
			
		case 5:
			price= 446;
			product_Color= " Green";
			product_Name="Paragon Vertex Men's Flip Flops";

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
			sandalsFloaters();
			break;
			}
		default: System.out.println("We aint got them Bro!!! Lokk what we got first!!!");
		sandalsFloaters();
		}
	}
	private static void safetyShoes() throws IOException, InterruptedException{
		System.out.println("---------Safety Shoes Section---------");
		System.out.println("------------------------------------------------");
		System.out.println("----Available Now------");
		System.out.println("1. Sparx Men's Dip Canvas safety Shoes, White \n2.Chevit Men's safety Shoes, Black "
				+ "\n3.Kraasa safety Canvas Sneakers for Men, Black \n4.Bond Street by RedTape safety Men's Sneakers, Blue \n5.Ethics Perfect Ultra Life safety Shoes for Men, Yellow");

		switch (scan.nextInt()) {
		case 1:
			price= 499;
			product_Color= "White";
			product_Name="Sparx Men's Dip Canvas safety Shoes";

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
			safetyShoes();
			break;
			}

		case 2:
			price= 399;
			product_Color= "Black";
			product_Name="Chevit Men's safety Shoes";

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
			safetyShoes();
			break;
			}

		case 3:
			price= 699;
			product_Color= "Black";
			product_Name="Kraasa  sports Canvas safety for Men";

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
			safetyShoes();
			break;
			}

		case 4:
			price= 499;
			product_Color= "Blue";
			product_Name="Bond Street by RedTape safety Men's Sneakers";

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
			safetyShoes();
			break;
			}

		case 5:
			price= 599;
			product_Color= "White";
			product_Name="Ethics Perfect Ultra Life safety Shoes for Men, Yellow";

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
			safetyShoes();
			break;
			}
		default: System.out.println("We aint got them Bro!!! Lokk what we got first!!!");
		safetyShoes();
		}
	}
}

