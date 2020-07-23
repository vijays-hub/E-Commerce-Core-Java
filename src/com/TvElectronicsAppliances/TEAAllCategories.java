package com.TvElectronicsAppliances;

import java.io.IOException;
import java.util.Scanner;

public class TEAAllCategories 
{
	static Scanner scan= new Scanner(System.in);
	public static  void teaCategories() throws InterruptedException, IOException
	{
		System.out.println("-----TV , APPLIANCES AND ELECTRONICS ZONE-----");
		System.out.print("Refreshing the things for You!  ");
		for(int i=0;i<2;i++)
		{
			System.out.print(".");
			Thread.sleep(1000);
		}
		System.out.println();
		System.out.println("What do you crave for today?");
		System.out.println("A. TVs \nB. Appliances \nC.Electronic Gadgets");

		System.out.println();
		System.out.println("Mention Your Choice!");
		switch(scan.next().charAt(0))
		{
		case 'a': 
			System.out.print("Processing");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			tvList();
			break;

		case 'A': 
			System.out.print("Processing");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			tvList();
			break;
		case 'b': 
			System.out.print("Processing");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			appliances_list();
			break;
		case 'B': 
			System.out.print("Processing");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			appliances_list();
			break;
		case 'C': 
			System.out.print("Processing");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			allElectronics();
			break;
		case 'c': 
			System.out.print("Processing");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			allElectronics();
			break;
		}
	}

	public static void tvList() throws InterruptedException, IOException
	{
		System.out.println("--------TVs------");
		System.out.println();
		System.out.println("1.Below 10000 \n2.From 10000-30000 \n3.From 30000-50000 \n4. Above 50000");
		System.out.println("Select any choice available");
		switch (scan.nextInt()) {
		case 1:
			System.out.print("Loading TVs Below 10000");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			TVZone.getTVbelow10000();
			break;

		case 2:
			System.out.print("Loading TVs From 10000-30000");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			TVZone.getTV10000to30000();
			break;

		case 3:
			System.out.print("Loading TVs From 30000-50000");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			TVZone.getTV30000to50000();
			break;

		case 4:
			System.out.print("Loading TVs above 50000");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			TVZone.getTVabove50000();
			break;

		default:
			break;
		}

	}
	public static void appliances_list() throws InterruptedException, IOException
	{
		System.out.println("----------Appliances Zone----------");
		System.out.print("Hold Up while we load the brands for you! ");
		for(int i=0;i<2;i++)
		{
			System.out.print(".");
			Thread.sleep(1000);
		}
		System.out.println();
		System.out.println("--Brands Available--");
		System.out.println("1.Samsung \n2.Whirlpool \n3.Godrej \n4.Haier ");
		System.out.println();
		System.out.println("Choose Your Favourite Brand to move ahead!");

		switch (scan.nextInt()) {
		case 1:
			System.out.print("Loading Samsung Appliances");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			AppliancesZone.getSamsung();
			break;
		case 2:
			System.out.print("Loading Whirlpool Appliances");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			AppliancesZone.getWhirlpool();
			break;
		case 3:
			System.out.print("Loading Godrej Appliances");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			AppliancesZone.getGodrej();
			break;
		case 4:
			System.out.print("Loading Haier Appliances");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			AppliancesZone.getHaier();
			break;

		default: System.out.println("OOps....We have'nt Got Those....Try again");
		appliances_list();
		}

	}
	public static void allElectronics() throws InterruptedException , IOException
	{
		System.out.println("----ELECTRONICS AREA");
		System.out.println();
		System.out.print("Hold Up while we load the Categories for you! ");
		for(int i=0;i<2;i++)
		{
			System.out.print(".");
			Thread.sleep(1000);
		}
		System.out.println();
		System.out.println("Categories Available To Shop:");
		System.out.println("1.Cameras \n2.Headphones \n3.Memory Cards \n4.Speakers");
		System.out.println();
		switch (scan.nextInt()) {
		case 1:
			System.out.print("Loading Camera List Please Wait ");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			ElectronicsZone.getCamera();
			break;

		case 2:
			System.out.print("Loading Headphones List Please Wait ");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			ElectronicsZone.getHeadphones();
			break;

		case 3:
			System.out.print("Loading Memory Card List Please Wait ");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			ElectronicsZone.getMemoryCards();
			break;

		default:System.out.println("Select With Available Choices");
		allElectronics();
		break;
		}
	}
}


