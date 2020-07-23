package com.MobilesAndComputers.amazon;

import java.io.IOException;
import java.util.Scanner;

public class MobilesAndComputers 
{
	static Scanner mob_scan= new Scanner(System.in);
	public static void mob_categories() throws InterruptedException, IOException 
	{
		
		System.out.println("------Mobiles & Computers-------");
		System.out.println("Mob: Mobiles Categories \nComp: Compuetrs Area");

		System.out.println("");
		System.out.println("Jot Your Choice to Move Ahead");
		
		switch (mob_scan.next())
		{
		case "Mob":
			System.out.print("Loading");
			for(int i=0;i<3;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			mobiles();
			break;
		case "mob": 
			System.out.print("Loading");
			for(int i=0;i<3;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			mobiles();
		break;
		case "Comp" :
			System.out.print("Loading");
			for(int i=0;i<3;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			Computers();
		break;
		case "comp" : 
			System.out.print("Loading");
			for(int i=0;i<3;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			Computers();
		break;

		default: System.out.println("Invalid Choice. Please type proper Choice name");
		System.out.print("Loading");
		for(int i=0;i<3;i++)
		{
			System.out.print(".");
			Thread.sleep(1000);
		}
		System.out.println();
		MobilesAndComputers.mob_categories();
	
			break;
		}
	}
	
	public static void mobiles() throws InterruptedException, IOException
	{
		System.out.println("---------Mobiles-----------");
		System.out.println();
		System.out.println("------This is What we Got Bro!------");
		System.out.println("1.Xiaomi \n2.OnePlus (1+) \n3.Samsung \n4.Apple");
		System.out.println();
		System.out.println("Select Your Favourite Brand!");
		switch(mob_scan.nextInt())
		{
		case 1: 
			System.out.print("Loading Product List");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			RedmiSeries.getRedmi();
			break;
		case 2: 
			System.out.print("Loading Product List");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			OnePlus.getOnePlus();
			break;
		case 3: 
			System.out.print("Loading Product List");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			Samsung.getsamsung();
			break;
		case 4: 
			System.out.print("Loading Product List");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			Apple.getapple();
			break;
			
			default :
				System.out.println("Please dont wish for something we haven't Got!");
				mobiles();
		}
		
	}
	
	public static void Computers() throws InterruptedException, IOException
	{
		System.out.println("---------Computers Zone-----------");
		System.out.println();
		System.out.println("------Brands What we Got For You!------");
		System.out.println("1.Dell \n2.HP \n3.Microsoft \n4.Mac");
		System.out.println();
		System.out.println("Select Your Favourite Brand!");
		switch(mob_scan.nextInt())
		{
		case 1: 
			System.out.print("Loading Product List");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			Dell.getDell();
			break;
		case 2: 
			System.out.print("Loading Product List");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			HP.gethp();
			break;
		case 3: 
			System.out.print("Loading Product List");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			Microsoft.getMicrosoft();
			break;
		case 4: 
			System.out.print("Loading Product List");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			Mac.getMac();
			break;
			
			default :
				System.out.println("Please dont wish for something we haven't Got!");
				Computers();
		}
	}
}
