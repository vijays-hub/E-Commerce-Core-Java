package com.MobilesAndComputers.amazon;

import java.io.IOException;
import java.util.Scanner;

import com.EntryArea.amazon.CartZone;
import com.EntryArea.amazon.Categories;
import com.EntryArea.amazon.Home;
import com.EntryArea.amazon.PaymentArea;

public class RedmiSeries
{
	
		public static void getRedmi() throws InterruptedException, IOException
		{
			Scanner redmi_scan= new Scanner(System.in); 

			double price;
			String product_Name;
			String product_Color;
			byte ram;
			short memory;
			
			
			System.out.println("Sort By Name?");
			
			System.out.println("------Xiaomi Series-------");
			System.out.println();
			System.out.println("Available Now----------");
			System.out.println();
			System.out.println("1.Redmi Note 8, 6GB, 64GB, MoonLight White \n2.Redmi Note 8, 4GB, 64GB, MoonLight White"
					+ "\n3.Redmi Note 8, 6GB, 128GB, Neptune Blue \n4.Redmi 8A Dual, 3GB, 32GB, Sea Blue \n5.Redmi 7A 2GB,32GB, Matte Blue");
			System.out.println();
			System.out.println("Select Your Product to Continue.....");
			
			switch (redmi_scan.nextInt()) {
			case 1:
				price= 12999;
				product_Color= "MoonLight White";
				product_Name="Redmi Note 8 , 6GB , 64GB";
				ram=6;
				memory=64;
				
				System.out.println(product_Name);
				System.out.println("Price :"+price);
				System.out.println("Color :"+product_Color);
				System.out.println("Ram :"+ram);
				System.out.println("Memory :"+memory);
				
				Thread.sleep(1500);
				System.out.println();
				System.out.println("1.Add to Cart \n2.Buy Now \n3.Go back \n4.Back to Categories \n5.Home");
				
				switch(redmi_scan.nextInt())
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
					MobilesAndComputers.mobiles();
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
				getRedmi();
				break;
			}
				
			case 2:
				price= 10499;
				product_Color= "MoonLight White";
				product_Name="Redmi Note 8 , 4GB , 64GB";
				ram=4;
				memory=64;
				
				System.out.println(product_Name);
				System.out.println("Price :"+price);
				System.out.println("Color :"+product_Color);
				System.out.println("Ram :"+ram);
				System.out.println("Memory :"+memory);
				
				Thread.sleep(1500);
				System.out.println();
				System.out.println("1.Add to Cart \n2.Buy Now \n3.Go back \n4.Back to Categories \n5.Home");
				
				switch(redmi_scan.nextInt())
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
				MobilesAndComputers.mobiles();
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
				getRedmi();
				break;
			}
				
				
			case 3:
				price= 10499;
				product_Color= "MoonLight White";
				product_Name="Redmi Note 8 , 6GB , 128GB";
				ram=6;
				memory=128;
				
				System.out.println(product_Name);
				System.out.println("Price :"+price);
				System.out.println("Color :"+product_Color);
				System.out.println("Ram :"+ram);
				System.out.println("Memory :"+memory);
				
				Thread.sleep(1500);
				System.out.println();
				System.out.println("1.Add to Cart \n2.Buy Now \n3.Go back \n4.Back to Categories \n5.Home");
				
				switch(redmi_scan.nextInt())
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
					MobilesAndComputers.mobiles();
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
				getRedmi();
				break;
			}
				
				
			case 4:
				price= 7499;
				product_Color= "Sea Blue";
				product_Name="Redmi 8A Dual , 3GB , 32GB";
				ram=3;
				memory=32;
				
				System.out.println(product_Name);
				System.out.println("Price :"+price);
				System.out.println("Color :"+product_Color);
				System.out.println("Ram :"+ram);
				System.out.println("Memory :"+memory);
				
				Thread.sleep(1500);
				System.out.println();
				System.out.println("1.Add to Cart \n2.Buy Now \n3.Go back \n4.Back to Categories \n5.Home");
				
				switch(redmi_scan.nextInt())
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
					MobilesAndComputers.mobiles();
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
				getRedmi();
				break;
			}
				
			case 5:
				price= 5499;
				product_Color= "Matte Black";
				product_Name="Redmi 7A , 4GB , 64GB";
				ram=4;
				memory=64;
				
				System.out.println(product_Name);
				System.out.println("Price :"+price);
				System.out.println("Color :"+product_Color);
				System.out.println("Ram :"+ram);
				System.out.println("Memory :"+memory);
				
				Thread.sleep(1500);
				System.out.println();
				System.out.println("1.Add to Cart \n2.Buy Now \n3.Go back \n4.Back to Categories \n5.Home");
				
				switch(redmi_scan.nextInt())
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
					MobilesAndComputers.mobiles();
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
				getRedmi();
				break;
			}
				
			default: System.out.println("Oops...Invalid Choice....Try wishing for the available products");
			getRedmi();
			break;
			
			
			
			}
		}
}
