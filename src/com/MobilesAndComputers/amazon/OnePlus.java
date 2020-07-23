package com.MobilesAndComputers.amazon;

import java.io.IOException;
import java.util.Scanner;

import com.EntryArea.amazon.CartZone;
import com.EntryArea.amazon.Categories;
import com.EntryArea.amazon.Home;
import com.EntryArea.amazon.PaymentArea;

public class OnePlus
{
	
		public static void getOnePlus() throws InterruptedException, IOException
		{
			Scanner one_Plus_scan= new Scanner(System.in); 

			double price;
			String product_Name;
			String product_Color;
			byte ram;
			short memory;
			
			
			System.out.println("Sort By Name?");
			
			System.out.println("------1+ Series-------");
			System.out.println();
			System.out.println("-----------Available Now----------");
			System.out.println();
			System.out.println("1.One Plus 7T Pro, 8GB, 256GB, Haze Blue \n2.One Plus 7T Pro, 6GB, 128GB, Nebula Blue"
					+ "\n3.One Plus 7T Pro, 8GB, 256GB, Nebula Blue \n4.One Plus 7T Pro, 6GB, 128GB, Mirror Grey \n5.One Plus 7T Pro, 8GB, 256GB, Almond");
			System.out.println();
			System.out.println("Select Your Product to Continue.....");
			
			switch (one_Plus_scan.nextInt()) {
			case 1:
				price= 42999;
				product_Color= "Haze Blue";
				product_Name="One Plus 7T Pro, 8GB, 256GB";
				ram=8;
				memory=256;
				
				System.out.println(product_Name);
				System.out.println("Price :"+price);
				System.out.println("Color :"+product_Color);
				System.out.println("Ram :"+ram);
				System.out.println("Memory :"+memory);
				
				Thread.sleep(1500);
				System.out.println();
				System.out.println("1.Add to Cart \n2.Buy Now \n3.Go back \n4.Back to Categories \n5.Home");
				
				switch(one_Plus_scan.nextInt())
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
				getOnePlus();
				break;
			}
				
			case 2:
				price= 32999;
				product_Color= " Nebula Blue";
				product_Name="One Plus 7T Pro, 6GB, 128GB";
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
				
				switch(one_Plus_scan.nextInt())
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
				getOnePlus();
				break;
			}
				
				
			case 3:
				price= 42999;
				product_Color= "Nebula Blue";
				product_Name="One Plus 7T Pro, 8GB, 256GB";
				ram=8;
				memory=256;
				
				System.out.println(product_Name);
				System.out.println("Price :"+price);
				System.out.println("Color :"+product_Color);
				System.out.println("Ram :"+ram);
				System.out.println("Memory :"+memory);
				
				Thread.sleep(1500);
				System.out.println();
				System.out.println("1.Add to Cart \n2.Buy Now \n3.Go back \n4.Back to Categories \n5.Home");
				
				switch(one_Plus_scan.nextInt())
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
				getOnePlus();
				break;
			}
				
				
			case 4:
				price= 32499;
				product_Color= "Mirror Grey";
				product_Name="One Plus 7T Pro, 6GB, 128GB";
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
				
				switch(one_Plus_scan.nextInt())
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
				getOnePlus();
				break;
			}
				
			case 5:
				price= 43499;
				product_Color= "Almond";
				product_Name="One Plus 7T Pro,8GB, 256GB";
				ram=8;
				memory=256;
				
				System.out.println(product_Name);
				System.out.println("Price :"+price);
				System.out.println("Color :"+product_Color);
				System.out.println("Ram :"+ram);
				System.out.println("Memory :"+memory);
				
				Thread.sleep(1500);
				System.out.println();
				System.out.println("1.Add to Cart \n2.Buy Now \n3.Go back \n4.Back to Categories \n5.Home");
				
				switch(one_Plus_scan.nextInt())
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
				getOnePlus();
				break;
			}
				
			default: System.out.println("Oops...Invalid Choice....Try wishing for the available products");
			getOnePlus();
			break;
			
			
			
			}
		}
}
