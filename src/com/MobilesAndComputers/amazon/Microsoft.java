package com.MobilesAndComputers.amazon;

import java.io.IOException;
import java.util.Scanner;

import com.EntryArea.amazon.CartZone;
import com.EntryArea.amazon.Categories;
import com.EntryArea.amazon.Home;
import com.EntryArea.amazon.PaymentArea;

public class Microsoft
{
	
		public static void getMicrosoft() throws InterruptedException, IOException
		{
			Scanner microsoft_scan= new Scanner(System.in); 

			double price;
			String product_Name,product_Color,processor, OS;
			short ram,memory;
			double screenSize;
			
			
			System.out.println("Sort By Name?");
			
			System.out.println("------Microsoft Series-------");
			System.out.println();
			System.out.println("-----------Available Now----------");
			System.out.println();
			System.out.println("1.Microsoft 1 intel i3 5th Gen 15.6 inch FHD (4GB/1TB HDD/Windows 10) \n2.Microsoft  2 intel i5 7th Gen 14 inch FHD (8GB/1TB HDD/Windows 10)"
					+ "\n3.Microsoft 3 intel i3 7th Gen 15.6 inch FHD (4GB/1TB HDD/Windows 10) \n4.Microsoft 4 intel i3 7th Gen 14 inch HD (4GB/1TB HDD/Windows 10) \n5.Microsoft 5 intel i7 7th Gen 15.6 inch FHD (8GB/1TB HDD/Windows 10)");
			System.out.println();
			System.out.println("Select Your Product to Continue.....");
			
			switch (microsoft_scan.nextInt()) {
			case 1:
				price= 26990;
				product_Color= "Haze Blue";
				product_Name="Microsoft 1 intel i3 5th Gen 15.6 inch FHD (4GB/1TB HDD/Windows 10)";
				ram=4;
				memory=1024;
				screenSize= 15.6;
				processor="i3 5th";
				OS="Windows 10";
				
				System.out.println(product_Name);
				System.out.println("Price :"+price);
				System.out.println("Color :"+product_Color);
				System.out.println("Ram :"+ram);
				System.out.println("Memory :"+memory);
				
				Thread.sleep(1500);
				System.out.println();
				System.out.println("1.Add to Cart \n2.Buy Now \n3.Go back \n4.Back to Categories \n5.Home");
				
				switch(microsoft_scan.nextInt())
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
					MobilesAndComputers.Computers();
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
				getMicrosoft();;
				break;
			}
				
			case 2:
				price= 28990;
				product_Color= "Nebula Blue";
				product_Name="Microsoft 2 intel i5 7th Gen 14 inch FHD (8GB/1TB HDD/Windows 10)";
				ram=8;
				memory=1024;
				screenSize= 14;
				processor="i5 7th Gen";
				OS="Windows 10";
				
				System.out.println(product_Name);
				System.out.println("Price :"+price);
				System.out.println("Color :"+product_Color);
				System.out.println("Ram :"+ram);
				System.out.println("Memory :"+memory);
				
				Thread.sleep(1500);
				System.out.println();
				System.out.println("1.Add to Cart \n2.Buy Now \n3.Go back \n4.Back to Categories \n5.Home");
				
				switch(microsoft_scan.nextInt())
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
					MobilesAndComputers.Computers();
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
				getMicrosoft();
				break;
			}
				
			case 3:
				price= 27990;
				product_Color= "Haze Blue";
				product_Name="Microsoft 3 intel i3 7th Gen 15.6 inch FHD (4GB/1TB HDD/Windows 10)";
				ram=4;
				memory=1024;
				screenSize= 15.6;
				processor="i3 7th Gen";
				OS="Windows 10";
				
				System.out.println(product_Name);
				System.out.println("Price :"+price);
				System.out.println("Color :"+product_Color);
				System.out.println("Ram :"+ram);
				System.out.println("Memory :"+memory);
				
				Thread.sleep(1500);
				System.out.println();
				System.out.println("1.Add to Cart \n2.Buy Now \n3.Go back \n4.Back to Categories \n5.Home");
				
				switch(microsoft_scan.nextInt())
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
					MobilesAndComputers.Computers();
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
				getMicrosoft();
				break;
			}
				
			case 4:
				price= 26990;
				product_Color= "Haze Blue";
				product_Name="Microsoft 4 intel i3 7th Gen 14 inch FHD (4GB/1TB HDD/Windows 10)";
				ram=4;
				memory=1024;
				screenSize= 14;
				processor="i3 7th Gen";
				OS="Windows 10";
				
				System.out.println(product_Name);
				System.out.println("Price :"+price);
				System.out.println("Color :"+product_Color);
				System.out.println("Ram :"+ram);
				System.out.println("Memory :"+memory);
				
				Thread.sleep(1500);
				System.out.println();
				System.out.println("1.Add to Cart \n2.Buy Now \n3.Go back \n4.Back to Categories \n5.Home");
				
				switch(microsoft_scan.nextInt())
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
					MobilesAndComputers.Computers();
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
				getMicrosoft();
				break;
			}
				
				
			case 5:
				price= 34990;
				product_Color= "Haze Blue";
				product_Name="Microsoft 5 intel i7 7th Gen 15.6 inch FHD (8GB/1TB HDD/Windows 10";
				ram=8;
				memory=1024;
				screenSize= 15.6;
				processor="i7 7th";
				OS="Windows 10";
				
				System.out.println(product_Name);
				System.out.println("Price :"+price);
				System.out.println("Color :"+product_Color);
				System.out.println("Ram :"+ram);
				System.out.println("Memory :"+memory);
				
				Thread.sleep(1500);
				System.out.println();
				System.out.println("1.Add to Cart \n2.Buy Now \n3.Go back \n4.Back to Categories \n5.Home");
				
				switch(microsoft_scan.nextInt())
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
					MobilesAndComputers.Computers();
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
				getMicrosoft();
				break;
			}

			default: System.out.println("Oops...Invalid Choice....Try wishing for the available products");
			getMicrosoft();
			break;
			
			
			
			}
		}
}
